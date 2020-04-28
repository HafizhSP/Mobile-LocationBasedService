package com.example.mymaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    Fungsi untuk konek ke layer lain
    public void masjid(View view){
        String value="masjid";
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        //   Mengirim data untuk parameter di layer satunya
        intent.putExtra("key",value);
        startActivity(intent);
    }

    //    Fungsi untuk konek ke layer lain
    public void pom(View view){
        String value="pom";
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        //   Mengirim data untuk parameter di layer satunya
        intent.putExtra("key",value);
        startActivity(intent);
    }

    //    Fungsi untuk konek ke layer lain
    public void sekolah(View view){
        String value="sekolah";
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        //   Mengirim data untuk parameter di layer satunya
        intent.putExtra("key",value);
        startActivity(intent);
    }
}
