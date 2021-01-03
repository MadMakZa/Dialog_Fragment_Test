package com.example.dialogfragment;

import android.app.Fragment;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;



public class MainFragment extends Fragment {

    public static final String TAG = "Main Fragment";

    private Button mOpenDialog;
    public TextView mInputDisplay;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mOpenDialog = view.findViewById(R.id.open_dialog);
        mInputDisplay = view.findViewById(R.id.input_display);

        mOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: opening dialog");

                MyCustomDialog dialog = new MyCustomDialog();
                dialog.setTargetFragment(MainFragment.this, 1);
                dialog.show(getFragmentManager(), "MyCustomDialog");
            }
        });

        return view;
    }
}
