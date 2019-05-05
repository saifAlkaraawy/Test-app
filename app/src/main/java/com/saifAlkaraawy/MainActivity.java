package com.saifAlkaraawy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText name;
     EditText password;
     EditText phone;
     Button button;
     Intent intent;
      static  final String TEXT_NAME="com.saifAlkaraawy.name";
      static  final String TEXT_PASSWORD="com.saifAlkaraawy.Password";
      static  final String TEXT_PHONE="com.saifAlkaraawy.Phone";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        crateWight();
        clickButton();
    }
     void clickButton(){

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra(TEXT_NAME,name.getText().toString());
                intent.putExtra(TEXT_PASSWORD,password.getText().toString());
                intent.putExtra(TEXT_PHONE,phone.getText().toString());
                startActivity(intent);
            }
        });
     }

    void crateWight(){
        name=findViewById(R.id.nameTextEdit);
        password=findViewById(R.id.PasswordEdit);
        phone=findViewById(R.id.phoneTextEdit);
        button =findViewById(R.id.button);
        intent= new Intent(this,DetailsActivity.class);
    }


}
