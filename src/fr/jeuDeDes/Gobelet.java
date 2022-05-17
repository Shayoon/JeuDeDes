package fr.jeuDeDes;

import java.util.ArrayList;
import java.util.List;

public class Gobelet {
    private int valeur;
    private List<De> des;

    public Gobelet(int nbDes) {
        this.valeur = 0;
        des = new ArrayList<>();
        for (int i = 0; i < nbDes; i++) {
            des.add(new De());
        }
    }

    public int getValeur() {
        return valeur;
    }

    public void lancer(){
        valeur = 0;
        for (De de: des) {
            de.lancer();
            valeur += de.getValeur();
        }
    }


    public void afficherScore(){
        System.out.printf("Le dernier lance a donne : %d\n", valeur);
    }
}
