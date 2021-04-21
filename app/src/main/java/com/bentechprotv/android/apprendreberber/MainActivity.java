package com.bentechprotv.android.apprendreberber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button _btnAlphabet, _btnNombres, _btnCouleurs, _btnPhrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _btnNombres = findViewById(R.id.btnNombres);
        _btnNombres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNombres = new Intent(getApplicationContext(),NombresActivity.class);
                startActivity(iNombres);
            }
        });

    }
}