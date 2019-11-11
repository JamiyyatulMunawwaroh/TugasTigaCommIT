package com.jamiyyatulmunawwaroh.tugastigacommit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class home2 extends AppCompatActivity implements View.OnClickListener {

    Button gambar, hitung, me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        gambar = findViewById(R.id.btn_image);
        hitung = findViewById(R.id.btn_berhitung);
        me = findViewById(R.id.btn_about);

        gambar.setOnClickListener(this);
        hitung.setOnClickListener(this);
        me.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_image){
            Intent gambar = new Intent(getApplicationContext(), image.class);
            startActivity(gambar);

        }else if (v.getId() == R.id.btn_berhitung){
            Intent hitung = new Intent(getApplicationContext(), perhitungan.class);
            startActivity(hitung);

        }else if (v.getId() == R.id.btn_about){
            Intent me = new Intent(getApplicationContext(), about.class);
            startActivity(me);
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this, "Bye - Bye", Toast.LENGTH_SHORT).show();
    }
}
