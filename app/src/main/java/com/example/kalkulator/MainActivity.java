package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnTambah,btnKurang,btnKali,btnBagi,btnHapus;
    EditText editTextPertama,editTextKedua,textViewHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPertama = findViewById(R.id.edit_text_pertama);
        editTextKedua = findViewById(R.id.edit_text_kedua);
        btnTambah = findViewById(R.id.btn_tambah);
        btnKurang = findViewById(R.id.btn_kurang);
        btnKali = findViewById(R.id.btn_kali);
        btnBagi = findViewById(R.id.btn_bagi);
        btnHapus = findViewById(R.id.btn_hapus);
        textViewHasil = findViewById(R.id.hasil_perhitungan);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pertama = Double.parseDouble(editTextPertama.getText().toString());
                double kedua = Double.parseDouble(editTextKedua.getText().toString());
                String hasil = String.valueOf(pertama + kedua);
                textViewHasil.setText(hasil);
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pertama = Double.parseDouble(editTextPertama.getText().toString());
                double kedua = Double.parseDouble(editTextKedua.getText().toString());
                String hasil = String.valueOf(pertama - kedua);
                textViewHasil.setText(hasil);
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pertama = Double.parseDouble(editTextPertama.getText().toString());
                double kedua = Double.parseDouble(editTextKedua.getText().toString());
                String hasil = String.valueOf(pertama * kedua);
                textViewHasil.setText(hasil);
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pertama = Double.parseDouble(editTextPertama.getText().toString());
                double kedua = Double.parseDouble(editTextKedua.getText().toString());
                String hasil = String.valueOf(pertama / kedua);
                textViewHasil.setText(hasil);
            }
        });
        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextPertama.getText().clear();
                editTextKedua.getText().clear();
                textViewHasil.getText().clear();
            }
        });
    }
}