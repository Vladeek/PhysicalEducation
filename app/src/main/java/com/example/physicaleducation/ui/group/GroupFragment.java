package com.example.physicaleducation.ui.group;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.physicaleducation.databinding.FragmentCourseBinding;

public class GroupFragment extends Fragment {

    private GroupViewModel groupViewModel;
    private FragmentCourseBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        groupViewModel =
                new ViewModelProvider(this).get(GroupViewModel.class);

        binding = FragmentCourseBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        /*final TextView textView = binding.textSlideshow;
        courseViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}