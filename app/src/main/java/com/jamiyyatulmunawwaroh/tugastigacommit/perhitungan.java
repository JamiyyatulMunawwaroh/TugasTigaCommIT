package com.jamiyyatulmunawwaroh.tugastigacommit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class perhitungan extends AppCompatActivity implements View.OnClickListener {

    EditText hasil;
    Button n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
    Button penjumlahan, pengurangan, perkalian, pembagian, samadengan;
    Button delete, clear;


    public static double nilaisekarang = 0;
    public static String operasisekarang = "";
    public static double jawaban = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perhitungan);

        operasiaritmatika();

        hasil = findViewById(R.id.ed_hasil);

        delete = findViewById(R.id.btn_del);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String desplayelements = hasil.getText().toString();
                int length = desplayelements.length();
                if (length > 0) {
                    desplayelements = desplayelements.substring(0, length - 1);
                    hasil.setText(desplayelements);
                }
            }
        });

        clear = findViewById(R.id.btn_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("");
            }
        });

    }

    private void operasiaritmatika() {

        //angka
        n0 = findViewById(R.id.btn_n0);
        n0.setOnClickListener(this);

        n1 = findViewById(R.id.btn_n1);
        n1.setOnClickListener(this);

        n2 = findViewById(R.id.btn_n2);
        n2.setOnClickListener(this);

        n3 = findViewById(R.id.btn_n3);
        n3.setOnClickListener(this);

        n4 = findViewById(R.id.btn_n4);
        n4.setOnClickListener(this);

        n5 = findViewById(R.id.btn_n5);
        n5.setOnClickListener(this);

        n6 = findViewById(R.id.btn_n6);
        n6.setOnClickListener(this);

        n7 = findViewById(R.id.btn_n7);
        n7.setOnClickListener(this);

        n8 = findViewById(R.id.btn_n8);
        n8.setOnClickListener(this);

        n9 = findViewById(R.id.btn_n9);
        n9.setOnClickListener(this);

        //operasi aritmatika
        penjumlahan = findViewById(R.id.btn_tambah);
        penjumlahan.setOnClickListener(this);

        pengurangan = findViewById(R.id.btn_min);
        pengurangan.setOnClickListener(this);

        pembagian = findViewById(R.id.btn_bagi);
        pembagian.setOnClickListener(this);

        perkalian = findViewById(R.id.btn_kali);
        perkalian.setOnClickListener(this);

        samadengan = findViewById(R.id.btn_samadengan);
        samadengan.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // event setiap button
        switch (v.getId()) {
            case R.id.btn_n0:
                hasil.setText(hasil.getText().toString().trim() + "0");
                break;
            case R.id.btn_n1:
                hasil.setText(hasil.getText().toString().trim() + "1");
                break;
            case R.id.btn_n2:
                hasil.setText(hasil.getText().toString().trim() + "2");
                break;
            case R.id.btn_n3:
                hasil.setText(hasil.getText().toString().trim() + "3");
                break;
            case R.id.btn_n4:
                hasil.setText(hasil.getText().toString().trim() + "4");
                break;
            case R.id.btn_n5:
                hasil.setText(hasil.getText().toString().trim() + "5");
                break;
            case R.id.btn_n6:
                hasil.setText(hasil.getText().toString().trim() + "6");
                break;
            case R.id.btn_n7:
                hasil.setText(hasil.getText().toString().trim() + "7");
                break;
            case R.id.btn_n8:
                hasil.setText(hasil.getText().toString().trim() + "8");
                break;
            case R.id.btn_n9:
                hasil.setText(hasil.getText().toString().trim() + "9");
                break;

                // event dari operasi aritmatika
            case R.id.btn_tambah:
                operasisekarang = "+";
                nilaisekarang = Double.parseDouble(hasil.getText().toString());
                hasil.setText("");
                break;

            case R.id.btn_min:
                operasisekarang = "-";
                nilaisekarang = Double.parseDouble(hasil.getText().toString());
                hasil.setText("");
                break;

            case R.id.btn_kali:
                operasisekarang = "*";
                nilaisekarang = Double.parseDouble(hasil.getText().toString());
                hasil.setText("");
                break;

            case R.id.btn_bagi:
                operasisekarang = "/";
                nilaisekarang = Double.parseDouble(hasil.getText().toString());
                hasil.setText("");
                break;

            case R.id.btn_samadengan:
                if (operasisekarang.equals("+")) {
                    jawaban = nilaisekarang + Double.parseDouble(hasil.getText().toString().trim());


                } else if (operasisekarang.equals("-")) {
                    jawaban = nilaisekarang - Double.parseDouble(hasil.getText().toString().trim());


                } else if (operasisekarang.equals("*")) {
                    jawaban = nilaisekarang * Double.parseDouble(hasil.getText().toString().trim());


                } else if (operasisekarang.equals("/")) {
                    jawaban = nilaisekarang / Double.parseDouble(hasil.getText().toString().trim());

                }

                // mengantisapasi dari hasil berberntuk int dan pecahan karena 2.2 != 2
                // hasil = 2.2
                // nilaitemp = 2
                int nilaiTemporari = (int) jawaban;

                if (nilaiTemporari==jawaban){
                    hasil.setText(String.valueOf((int) jawaban));
                } else {
                    hasil.setText(String.valueOf(jawaban));
                }
                break;
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this, "Keluar dari Perhitungan", Toast.LENGTH_SHORT).show();
    }
}
