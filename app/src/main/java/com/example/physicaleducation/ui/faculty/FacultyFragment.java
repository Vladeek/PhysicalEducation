package com.example.physicaleducation.ui.faculty;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.physicaleducation.Models.Faculty;
import com.example.physicaleducation.databinding.FragmentFacultyBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FacultyFragment extends Fragment {

    private FacultyViewModel facultyViewModel;
    private FragmentFacultyBinding binding;
    private EditText facultyName;
    private Button addFacultyButton;
    private DatabaseReference mDataBaseFaculty;
    private String FACULTY_KEY = "FACULTY";



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        facultyViewModel =
                new ViewModelProvider(this).get(FacultyViewModel.class);

        binding = FragmentFacultyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        mDataBaseFaculty = FirebaseDatabase.getInstance().getReference(FACULTY_KEY);
        facultyName = binding.addFaculty;
        addFacultyButton = binding.addFacultyButton;


        addFacultyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    DatabaseReference myRef = mDataBaseFaculty.push();
                    String key = myRef.getKey();
                    Faculty newFaculty = new Faculty(key,facultyName.getText().toString());
                    mDataBaseFaculty.push().setValue(newFaculty);
                    Toast.makeText(
                            getActivity().getApplicationContext(),
                            "Успешно сохранено",
                            Toast.LENGTH_LONG).show();
                }
                catch (Exception e){
                    Toast.makeText(
                            getActivity().getApplicationContext(),
                            e.getMessage(),
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}