package com.example.film;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class locandina extends AppCompatActivity {

    TextView view_titolo;
    ImageView immagine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locandina);

        immagine = findViewById(R.id.imgFilm);
        view_titolo = findViewById(R.id.tit_film);

        String titolo = getIntent().getStringExtra("titolo");

        view_titolo.append(titolo);

        immagine.setImageResource(getResources().getIdentifier(titolo.toLowerCase(Locale.ROOT), "drawable", getPackageName()));

    }
}