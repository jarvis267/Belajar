package com.example.belajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hal5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal5);
    }

    public void pindahome(View view) {
        Intent intent = new Intent(hal5.this, MainActivity.class);

        startActivity(intent);
    }
}
