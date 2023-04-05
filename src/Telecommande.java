import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();

    }

    public void ajouterLampe(Lampe l) {
        this.lampes.add(l);
    }

    public void activerLampe(int i) {
        this.lampes.get(i).allumer();
    }

    public void desactiverLampe(int choix) {
        this.lampes.get(choix).eteindre();
    }

    public void activerTout() {
        for (Lampe l : this.lampes) {
            l.allumer();
        }
    }

    public String toString() {
        String res = "";
        for (Lampe l : this.lampes) {
            res += l.toString() + " ";
        }
        return res;
    }

    // Getters and Setters

    public Lampe getLampe(int i) {
        return this.lampes.get(i);
    }


}
