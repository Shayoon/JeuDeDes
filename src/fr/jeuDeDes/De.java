package fr.jeuDeDes;

import java.util.Random;

public class De {
    private int valeur;

    public De() {
        this.valeur = 0;
    }

    public int getValeur(){
        return this.valeur;
    }

    public void lancer(){
        Random random = new Random();
        this.valeur = random.nextInt(6) +1;
    }

}
