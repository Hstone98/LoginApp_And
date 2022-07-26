package com.projecx.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AtvMain extends AppCompatActivity {

    EditText editID;
    Button loginbutton;
    String logininfo = "asdf";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atv_main);

        editID = findViewById(R.id.editID);
        loginbutton = findViewById(R.id.loginbutton);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editID.getText().toString().equals(logininfo))
                {
                    Intent intent = new Intent(AtvMain.this , AvtNextPage.class);
                    startActivity(intent);
                }
            }
        });
    }
}