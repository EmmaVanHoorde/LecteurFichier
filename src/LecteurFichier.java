import java.io.*;
import java.util.*;

public class LecteurFichier implements Interface {
	
	private File fichier;
	FileInputStream pointeur;
	private LinkedList<String> contenu;
	private BufferedReader buffer;
	private FileInputStream lecteur;

	
	public LecteurFichier(String nom)
	{
		this.pointeur = null;
		this.fichier = new File(nom);
		this.contenu = new LinkedList<String>();
	}
	
	public void ouvrir()
	{
		if(this.fichier.exists()) {
			System.out.println("Fichier trouvé");
		} else {
			System.out.println("Fichier non trouvé");
		}	
	}	
	
	public void lire() {

        try {
            FileReader lecteur = new FileReader(fichier);
            BufferedReader buffer = new BufferedReader(lecteur);
            String ligne;

            while((ligne = buffer.readLine()) != null) {
                this.getContenu().add(ligne);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

	public String afficher() {
        int longueur = 0;
        String mot = "";
        for(int i = 0; i < this.getContenu().size(); i++) {
            System.out.println(this.getContenu().get(i));
            mot += this.getContenu().get(i);
            longueur += this.getContenu().get(i).length();
        }
        //System.out.println(longueur);
        return mot;

	}

	public int longueurMot() {
        int longueur = 0;
        for(int i = 0; i < this.getContenu().size(); i++) {
            //System.out.println(this.getContenu().get(i));
            longueur += this.getContenu().get(i).length();
        }
        return longueur;
    }


    public LinkedList<String> getContenu() {
        return contenu;
    }

    @Override
    public void palindromique(int i, String mot){
        String palindrome = "";
        for (int x = i-1; x>-1; x--) {
            palindrome+= mot.substring(x,x+1);
        }
        System.out.println(palindrome);
    }
	
}