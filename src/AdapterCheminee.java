// Classe adapter pour la classe Cheminee pour qu'elle soit utilisable avec la telecommande (Appareil)
public class AdapterCheminee implements Appareil {

    // Cheminee
    Cheminee cheminee;


    public AdapterCheminee(Cheminee cheminee) {
        this.cheminee = cheminee;
    }

    @Override
    public void allumer() {
        cheminee.changerIntensite(cheminee.getLumiere()+10);
        if (cheminee.getLumiere() > 100)
            cheminee.changerIntensite(100);
    }

    @Override
    public void eteindre() {
        cheminee.changerIntensite(0);

    }

    /**
     * methode toString, affiche cheminee et la valeur intensite
     * @return description de l'objet this
     */
    public String toString()
    {
        return("cheminee: "+ cheminee.getLumiere());
    }


    //
}
