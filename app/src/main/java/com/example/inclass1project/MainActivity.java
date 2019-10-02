package com.example.inclass1project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Toast message
    public void toastMsg(String messageToast) {
        Toast toast = Toast.makeText(this, messageToast, Toast.LENGTH_LONG);
        toast.show();
    }
    //Display toast message into Screen
    public void displayToastMsg(View viewMessage) {
        toastMsg("Hello, This is my first Android APP");
    }
}
