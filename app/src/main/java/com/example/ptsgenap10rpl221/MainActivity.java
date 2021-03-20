package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText txtemail, txtpassword;
    private Button login;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtemail = (EditText)findViewById(R.id.txtemail);
        txtpassword = (EditText)findViewById(R.id.txtpassword);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = txtemail.getText().toString();
                String pass = txtpassword.getText().toString();
                if (email.equalsIgnoreCase(  "tiarr@gmail.com")
                        &&(pass.equalsIgnoreCase("919191"))){
                    Toast.makeText(MainActivity.this, "successful login",
                            Toast.LENGTH_SHORT).show();
                    Intent move = new Intent(MainActivity.this , Dashboard.class );
                    startActivity(move);
                }else {
                    Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}