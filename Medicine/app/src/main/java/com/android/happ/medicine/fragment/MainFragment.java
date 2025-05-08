package com.android.happ.medicine.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.android.happ.medicine.databinding.FragmentMainBinding;
import com.google.firebase.auth.FirebaseAuth;

/**
 * 메인 화면을 담당하는 클래스
 */
public class MainFragment extends Fragment {
    private FragmentMainBinding binding;        // viewbinding 변수

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        init();
        setEvent();
    }

    private void init() {
    }

    private void setEvent() {
        binding.layoutLogout.setOnClickListener(v -> {
            FirebaseAuth.getInstance().signOut();
            requireActivity().finish();
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
