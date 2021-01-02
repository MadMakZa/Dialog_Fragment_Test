package com.example.dialogfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button openDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    void init(){
        openDialog = findViewById(R.id.btn_opendialog);
    }
    public void onClickOpenDialog(View view){
        //метод нажатия на кнопку
        CustomDialogFragment dialog = new CustomDialogFragment();
        dialog.show(getFragmentManager(), "custom");
    }
}