
public class Inverser extends LecteurFichier {

    public Inverser(String nom)
    {
        super(nom);
    }

    public String afficher()
    {
        String motInverse = "";
        for(int i = super.getContenu().size() - 1; i >= 0; i--) {
            System.out.println(this.getContenu().get(i));
            motInverse += this.getContenu().get(i);
        }
        return motInverse;
    }


}
