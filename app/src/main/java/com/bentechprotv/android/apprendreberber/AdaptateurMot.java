package com.bentechprotv.android.apprendreberber;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptateurMot extends ArrayAdapter<Mot> {

    public AdaptateurMot(@NonNull Context context, ArrayList<Mot> mots) {
        super(context,0, mots);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View lsvElementView = convertView;
            if (lsvElementView == null){
                lsvElementView = LayoutInflater.from(getContext()).inflate(R.layout.lsv_element,parent,false);
            }
            Mot motCourant = getItem(position);

            TextView nomFrTextView = (TextView) lsvElementView.findViewById(R.id.txtFrancais);
            nomFrTextView.setText(motCourant.get_motFr());

            TextView nomBrTextView = (TextView) lsvElementView.findViewById(R.id.txtBerbere);
            nomBrTextView.setText(motCourant.get_motBr());

            ImageView iconeView = (ImageView) lsvElementView.findViewById(R.id.imgNombre);
          
            if (motCourant.AuneImage()){
                iconeView.setImageResource(motCourant.get_ImageRessourceId());
            } else {
                iconeView.setVisibility(View.GONE);
            }
            return lsvElementView;
        }











    }