
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		LecteurFichier un = new LecteurFichier("fichier.txt");
        Inverser deux = new Inverser("fichier.txt");
		
		un.ouvrir();
		un.lire();
		un.afficher();
		System.out.println("affichage inverser:");
        deux.ouvrir();
        deux.lire();
		deux.afficher();

        System.out.println("affichage palindromique:");
        un.palindromique(un.longueurMot(), un.afficher());





    }

}
