package com.saifAlkaraawy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {


    TextView textViewName;
    TextView textViewPassword;
    TextView textViewPhone;
    Intent intent;
    String name;
    String password;
    String phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        cratewight();
        setValue();
    }

    void setValue(){
        intent=getIntent();
        name=intent.getStringExtra(MainActivity.TEXT_NAME);
        password=intent.getStringExtra(MainActivity.TEXT_PASSWORD);
        phone=intent.getStringExtra(MainActivity.TEXT_PHONE);
        textViewName.setText(name);
         textViewPassword.setText(password);
         textViewPhone.setText(phone);
    }
    void cratewight(){
        textViewName=findViewById(R.id.textViewName);
        textViewPassword=findViewById(R.id.textViewPassword);
        textViewPhone=findViewById(R.id.textViewPhone);
    }

}
