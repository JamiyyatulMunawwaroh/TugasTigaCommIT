package com.jamiyyatulmunawwaroh.tugastigacommit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity implements View.OnClickListener {

    EditText username, pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.ed_username);
        pass = findViewById(R.id.ed_password);
        login = findViewById(R.id.btn_login);

        login.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String user = username.getText().toString();
        String password = pass.getText().toString();

        switch (v.getId()){

            case R.id.btn_login:
                if (TextUtils.isEmpty(user) | TextUtils.isEmpty(password)) {
                    Toast.makeText(this, "Data Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(login.this, home2.class);
                    startActivity(intent);
                    finish();
                }
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this, "Bye - Bye", Toast.LENGTH_SHORT).show();
    }
}
