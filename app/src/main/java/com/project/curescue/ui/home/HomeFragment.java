package com.project.curescue.ui.home;

import static android.content.Context.MODE_PRIVATE;
import static android.widget.Toast.makeText;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.google.android.material.textfield.TextInputEditText;
import com.project.curescue.R;
import com.project.curescue.databinding.FragmentHomeBinding;
import com.project.curescue.ui.notificaton.NotificationServiceFragment;

public class HomeFragment extends Fragment {

private FragmentHomeBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

    binding = FragmentHomeBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.text2;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        EditText number=(EditText) root.findViewById(R.id.numberEdit);
        Button b = (Button) root.findViewById(R.id.containedButton);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String numberString = number.getText().toString();

                if(numberString.length()==10){
                    SharedPreferences sharedPreferences = getActivity().getSharedPreferences("MySharedPref", MODE_PRIVATE);
                    SharedPreferences.Editor myEdit = sharedPreferences.edit();
                    myEdit.putString("ENUM", numberString);
                    myEdit.apply();
                    Navigation.findNavController(v).navigate(R.id.notification);

                }else {
                    makeText(getActivity(),"Enter Valid Number!",Toast.LENGTH_SHORT).show();
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