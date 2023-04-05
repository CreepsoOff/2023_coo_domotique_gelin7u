import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelecommandeTest {

    @Test
    // ajout d'une lampe à une télécommande vide
    public void testAjoutLampeTelecommande_vide() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");

        //methode testee
        t.ajouterLampe(l);

        // verification
        Lampe res = t.getLampe(0);
        assertEquals(l, res, "la lampe ajoutee devrait etre la premiere de la liste");

    }
}
