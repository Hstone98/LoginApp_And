
package com.projecx.loginapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AtvMain extends AppCompatActivity {
    EditText etID;
    EditText etPwd;
    String chk_Pwd = "1234";
    String chk_Id = "asdf";
    Button loginbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atv_main);

        InitLayout();
        InitEvent();
    }

    private void InitLayout() {
        etID = (EditText) findViewById(R.id.editID);
        etPwd = (EditText) findViewById(R.id.ediPassword);
        loginbutton = findViewById(R.id.loginbutton);
    }

    private void InitEvent()
    {

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               {
                   if(etPwd.getText().toString().equals(chk_Pwd) && etID.getText().toString().equals(chk_Id)) {
                       Intent intent = new Intent(AtvMain.this, AtvNextPage.class);
                       startActivity(intent);
                   }
                }
            }
        });
    }
}