import thermos.Thermostat;

public class Main {

    public static void main(String args[]) {
        Telecommande t = new Telecommande();


        Lampe l1 = new Lampe("Lampe1");
        t.ajouterAppareil(l1);

        Hifi h1 = new Hifi();
        t.ajouterAppareil(h1);

        Cheminee c1 = new Cheminee();
        AdapterCheminee c1o = new AdapterCheminee(c1);
        t.ajouterAppareil(c1o);

        Thermostat th1 = new Thermostat();
        AdapterThermostat th1o = new AdapterThermostat(th1);
        t.ajouterAppareil(th1o);


        TelecommandeGraphique tg = new TelecommandeGraphique(t);


    }

}
