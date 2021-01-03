package com.example.dialogfragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyCustomDialog extends DialogFragment {

    public static final String TAG = "MyCustomDialog";

    //widgets
    private EditText mInput;
    private TextView mActionOk, mActionCancel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        mActionCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: closing dialog");
                getDialog().dismiss();
            }
        });

        mActionOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: capturing input");
                String input = mInput.getText().toString();
                if(!input.equals("")){

                    MainFragment fragment = (MainFragment) getActivity().getFragmentManager().findFragmentByTag("MainFragment");
                    fragment.mInputDisplay.setText(input);
                }
            }
        });

        return view;
    }
}
