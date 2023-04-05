import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    // ajout d'une lampe à une télécommande avec 1 élément
    public void testAjoutLampeTelecommande_1element(){
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l1);

        //methode testee
        t.ajouterLampe(l2);

        // verification
        Lampe res = t.getLampe(1);
        assertEquals(l2, res, "la lampe ajoutee devrait etre la deuxieme de la liste");

    }

    @Test
    // activation d'une lampe existante en position 0
    public void testActivationLampe_pos0() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        t.ajouterLampe(l1);

        //methode testee
        t.activerLampe(0);

        // verification
        Lampe res = t.getLampe(0);
        assertTrue(res.isAllume(), "la lampe devrait etre allumee");

    }

    @Test
    // activation d'une lampe existante en position 1
    public void testActivationLampe_pos1() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);

        //methode testee
        t.activerLampe(1);

        // verification
        Lampe res = t.getLampe(1);
        assertTrue(res.isAllume(), "la lampe devrait etre allumee");

    }

    @Test
    // activation d'une lampe inexistante
    public void testActivationLampe_inexistante() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);

        //methode testee
        try {
            t.activerLampe(2);
        } catch (Exception e) {
            // verification
            // La méthode ne fonctionnera pas car la lampe n'existe pas et donc ne peut pas être activée,
            // elle lève donc une exception.
            assertEquals("Index 2 out of bounds for length 2", e.getMessage(), "le message d'erreur devrait etre 'position inexistante'");
        }

    }
}
