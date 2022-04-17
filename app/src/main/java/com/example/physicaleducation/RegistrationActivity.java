package com.example.physicaleducation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.android.userlistsql.REPLY";

    EditText login, password, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        init();
    }

    public void Register(View view) {
        if (login.getText().toString().equals("") || password.getText().toString().equals("") ||  name.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Заполните все поля", Toast.LENGTH_SHORT).show();
        }
        else {
            try {
                Intent replyIntent = new Intent();
                String[] arr = new String[]{
                        name.getText().toString(),
                        login.getText().toString(),
                        password.getText().toString()
                };
                replyIntent.putExtra(EXTRA_REPLY, arr);
                setResult(RESULT_OK, replyIntent);
                finish();
            } catch(Exception e){
                e.printStackTrace();
                Toast.makeText(getApplicationContext(), "Не получилось зарегистрироваться", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void init(){
        login=(EditText) findViewById(R.id.login);
        name=(EditText) findViewById(R.id.name);
        password=(EditText) findViewById(R.id.password);
    }
}