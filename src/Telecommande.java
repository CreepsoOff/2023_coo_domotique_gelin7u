import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private ArrayList<Lampe> lampes;
    private ArrayList<Hifi> hifis;

    public Telecommande() {
        this.lampes = new ArrayList<>();
        this.hifis = new ArrayList<>();

    }

    public void ajouterLampe(Lampe l) {
        this.lampes.add(l);
    }

    public void ajouterHifi(Hifi h) {
        this.hifis.add(h);
    }

    public void activerLampe(int i) {
        this.lampes.get(i).allumer();
    }

    public void activerHifi(int i) {
        this.hifis.get(i).allumer();
    }

    public void desactiverLampe(int choix) {
        this.lampes.get(choix).eteindre();
    }

    public void desactiverHifi(int choix) {
        this.hifis.get(choix).eteindre();
    }

    public void activerTout() {
        for (Lampe l : this.lampes) {
            l.allumer();
        }

        for (Hifi h : this.hifis) {
            h.allumer();
        }
    }



    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Lampe lampe : lampes) {
            res.append(lampe.toString()).append("\n");
        }
        for (Hifi hifi : hifis) {
            res.append(hifi.toString()).append("\n");
        }
        return res.toString();
    }

    // Getters and Setters

    public Lampe getLampe(int i) {
        return this.lampes.get(i);
    }

    public Hifi getHifi(int i) {
        return this.hifis.get(i);
    }

    public List<Lampe> getLampes() {
        return this.lampes;
    }

    public List<Hifi> getHifis() {
        return this.hifis;
    }


}
