package com.projecx.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AtvMain extends AppCompatActivity {

    String exmpId = new String("id");
    EditText etId;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atv_main);

        InitLayout();
        InitEvent();
    }

    private void InitLayout()
    {
        etId = (EditText)findViewById(R.id.editID);
        btnLogin = (Button)findViewById(R.id.loginbutton);

    }

    private void InitEvent()
    {
        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AtvMain.this, AvtNextPage.class);
                if(exmpId.compareTo(etId.getText().toString())==0) {
                    startActivity(intent);
                }
                else {
                    Log.e("asdf","씨발");
                }

            }
        });
    }

}