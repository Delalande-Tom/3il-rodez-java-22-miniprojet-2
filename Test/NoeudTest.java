import fr.ecole3il.rodez2023.carte.chemin.elements.Noeud;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NoeudTest {
    private Noeud<Integer> noeud;

    @BeforeEach
    public void setUp() {
        noeud = new Noeud<>(42);
    }

    @Test
    public void testGetValeur() {
        assertEquals(42, noeud.getValeur());
    }

    @Test
    public void testGetVoisins() {
        Noeud<Integer> voisin1 = new Noeud<>(10);
        Noeud<Integer> voisin2 = new Noeud<>(20);
        noeud.ajouterVoisin(voisin1);
        noeud.ajouterVoisin(voisin2);
        List<Noeud<Integer>> voisins = noeud.getVoisins();
        assertEquals(2, voisins.size());
        assertTrue(voisins.contains(voisin1));
        assertTrue(voisins.contains(voisin2));
    }

    @Test
    public void testAjouterVoisin() {
        Noeud<Integer> voisin = new Noeud<>(10);
        noeud.ajouterVoisin(voisin);
        List<Noeud<Integer>> voisins = noeud.getVoisins();
        assertTrue(voisins.contains(voisin));
    }
}
