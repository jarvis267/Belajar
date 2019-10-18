package com.example.belajar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void pindah1(View view) {
        Intent intent = new Intent(MainActivity.this, hal1.class);

        startActivity(intent);
    }

    public void pindah2(View view) {
        Intent intent = new Intent(MainActivity.this, hal2.class);

        startActivity(intent);
    }

    public void pindah3(View view) {
        Intent intent = new Intent(MainActivity.this, hal3.class);

        startActivity(intent);
    }

    public void pindah4(View view) {
        Intent intent = new Intent(MainActivity.this, hal4.class);

        startActivity(intent);
    }

    public void pindah5(View view) {
        Intent intent = new Intent(MainActivity.this, hal5.class);

        startActivity(intent);
    }
}