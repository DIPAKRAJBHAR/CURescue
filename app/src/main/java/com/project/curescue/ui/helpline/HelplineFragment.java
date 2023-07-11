package com.project.curescue.ui.helpline;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.project.curescue.databinding.FragmentGalleryBinding;
import com.project.curescue.databinding.FragmentHelplineBinding;

public class HelplineFragment extends Fragment {

private FragmentHelplineBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        HelplineViewModel helplineViewModel =
                new ViewModelProvider(this).get(HelplineViewModel.class);

    binding = FragmentHelplineBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textHelpline;
        helplineViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}