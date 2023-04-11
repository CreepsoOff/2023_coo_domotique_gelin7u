import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Appareil> appareils;

    public Telecommande() {
        this.appareils = new ArrayList<>();

    }

    public void ajouterAppareil(Appareil a) {
        this.appareils.add(a);
    }

    public void activerAppareil(int i) {
        if (i < this.appareils.size() && i >= 0)
            this.appareils.get(i).allumer();
    }

    public void desactiverAppareil(int choix) {
        if (choix < this.appareils.size() && choix >= 0)
            this.appareils.get(choix).eteindre();
    }

    public void activerTout() {
        for (Appareil a : this.appareils) {
            a.allumer();
        }
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Appareil appareil : appareils) {
            res.append(appareil.toString()).append("\n");
        }
        return res.toString();
    }

    public int getNombre() {
        return this.appareils.size();
    }
}
