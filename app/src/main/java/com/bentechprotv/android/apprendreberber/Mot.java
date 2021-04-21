package com.bentechprotv.android.apprendreberber;

public class Mot {
    private String _motFr; // en Français
    private String _motBr; // en Berbère
    private int _ImageRessourceId  = -1;

    public Mot(String _motFr, String _motBr, int _ImageRessourceId) {
        this._motFr = _motFr;
        this._motBr = _motBr;
        this._ImageRessourceId = _ImageRessourceId;
    }

    public String get_motFr() {
        return _motFr;
    }

    public void set_motFr(String _motFr) {
        this._motFr = _motFr;
    }

    public String get_motBr() {
        return _motBr;
    }

    public void set_motBr(String _motBr) {
        this._motBr = _motBr;
    }

    public int get_ImageRessourceId() {
        return _ImageRessourceId;
    }

    public void set_ImageRessourceId(int _ImageRessourceId) {
        this._ImageRessourceId = _ImageRessourceId;
    }

    public Boolean AuneImage(){
        return _ImageRessourceId != -1;
    }
}
