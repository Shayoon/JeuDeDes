package fr.jeuDeDes;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Joueur> joueurs;
    private int nbTours;
    private Gobelet gobelet;

    public Partie(int nbTours, int nbDes) {
        this.nbTours = nbTours;
        gobelet = new Gobelet(nbDes);
        joueurs = new ArrayList<>();
    }

    public void initialiser(Joueur joueur){
        joueurs.add(joueur);
    }

    public void lancer(){
        for (int i = 0; i < nbTours; i++) {
            for (Joueur joueur:joueurs
                 ) {
                joueur.jouer(gobelet);
            }
        }
    }

    public void afficherGagnant(){
        String nomGagnant = "";
        int scoreGagnant = 0;
        for (Joueur joueur : joueurs
             ) {
            if (joueur.getScore() > scoreGagnant){
                nomGagnant = joueur.getNom();
                scoreGagnant = joueur.getScore();
            }
        }
        System.out.printf("Le gagnant est %s, avec un score de : %d", nomGagnant,scoreGagnant);
    }
}
