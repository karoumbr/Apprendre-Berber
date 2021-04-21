package com.bentechprotv.android.apprendreberber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NombresActivity extends AppCompatActivity {

    ListView _lsvNombres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombres);
        _lsvNombres = (ListView) findViewById(R.id.lsvNombres);

        final ArrayList<Mot> mots = new ArrayList<Mot>();
        mots.add(new Mot("Un","Yan",R.drawable.un));
        mots.add(new Mot("Deux","Sin",R.drawable.deux));
        mots.add(new Mot("Trois","Krad",R.drawable.trois));
        mots.add(new Mot("Quatre","Kouz",R.drawable.quatre));
        mots.add(new Mot("Cinq","Smmous",R.drawable.cinq));
        mots.add(new Mot("Six","Sdis",R.drawable.six));
        mots.add(new Mot("Sept","Sa",R.drawable.sept));
        mots.add(new Mot("Huit","Tam",R.drawable.huit));
        mots.add(new Mot("Neuf","Tza",R.drawable.neuf));
        mots.add(new Mot("Dix","Mzaw",R.drawable.dix));

        AdaptateurMot adaptMot = new AdaptateurMot(this,mots);
        _lsvNombres.setAdapter(adaptMot);




    }
}