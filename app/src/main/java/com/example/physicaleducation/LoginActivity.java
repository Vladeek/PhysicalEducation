package com.example.physicaleducation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.physicaleducation.Models.Teacher;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class LoginActivity extends AppCompatActivity {
    private final int REGISTRATION_ACTIVITY_REQUEST_CODE = 1;

    private DatabaseReference mDataBase;
    private String TEACHER_KEY = "TEACHER";
    private List<Teacher> mainTeacherList = new ArrayList<>();
    EditText login, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login=(EditText) findViewById(R.id.login);
        password=(EditText) findViewById(R.id.password);

        mDataBase = FirebaseDatabase.getInstance().getReference(TEACHER_KEY);
        getDataFromDB();
    }
    private void getDataFromDB() {

        ValueEventListener VListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (mainTeacherList.size()>0)
                    mainTeacherList.clear();
                for (DataSnapshot ds : dataSnapshot.getChildren()){
                    Teacher teacher = ds.getValue(Teacher.class);
                    if (teacher != null)
                        mainTeacherList.add(teacher);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        };
        mDataBase.addValueEventListener(VListener);
    }
    public void Registration(View view) {
        Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
        startActivityForResult(intent, REGISTRATION_ACTIVITY_REQUEST_CODE);
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REGISTRATION_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK) {

            Teacher teacher = new Teacher();
            teacher.setName(data.getStringArrayExtra(RegistrationActivity.EXTRA_REPLY)[0]);
            teacher.setLogin(data.getStringArrayExtra(RegistrationActivity.EXTRA_REPLY)[1]);
            teacher.setPassword(data.getStringArrayExtra(RegistrationActivity.EXTRA_REPLY)[2]);

            DatabaseReference myRef = mDataBase.push();
            String key = myRef.getKey();
            teacher.setID(key);

            for (Teacher u: mainTeacherList) {
                if(u.getLogin().equals(teacher.getLogin())){
                    Toast.makeText(
                            getApplicationContext(),
                            "Логин должен быть уникальным",
                            Toast.LENGTH_LONG).show();
                    return;
                }
            }

            mDataBase.push().setValue(teacher);
            Toast.makeText(
                    getApplicationContext(),
                    "Регистрация прошла успешно",
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(
                    getApplicationContext(),
                    "Что-то пошло не так, регистрация не удалась",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void Authorization(View view) throws ExecutionException, InterruptedException {
        List<Teacher> teacherList = mainTeacherList;
        String enteredLogin = login.getText().toString();
        String enteredPassword = password.getText().toString();
        for (Teacher u: teacherList) {
            if(u.getLogin().equals(enteredLogin) && u.getPassword().equals(enteredPassword)){
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("id1",u.getLogin().toString());
                startActivity(intent);
                return;
            }
        }
        Toast.makeText(
                getApplicationContext(),
                "Введён неверный логин или пароль",
                Toast.LENGTH_LONG).show();
        return;
    }
}