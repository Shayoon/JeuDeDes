import fr.jeuDeDes.De;
import fr.jeuDeDes.Gobelet;
import fr.jeuDeDes.Joueur;
import fr.jeuDeDes.Partie;

public class Main {
    public static void main(String[] args) {
        Gobelet gobelet1 = new Gobelet(2);
        Joueur quentin = new Joueur("Quentin");
        Joueur alexandre = new Joueur("Alexandre");
        Partie partie = new Partie(10,5);
        partie.initialiser(alexandre);
        partie.initialiser(quentin);
        partie.lancer();
        partie.afficherGagnant();

    }
}
