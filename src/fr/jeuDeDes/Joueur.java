package fr.jeuDeDes;

public class Joueur {
    private String nom;
    private int score;

    public Joueur(String nom) {
        this.nom = nom;
        this.score = 0;
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public void jouer(Gobelet gobelet){
        gobelet.lancer();
        score += gobelet.getValeur();
    }

    public void afficherScore(){
        System.out.printf("Le score de %s est : %d\n",nom,score);
    }
}
