import fr.ecole3il.rodez2023.carte.chemin.elements.Graphe;
import fr.ecole3il.rodez2023.carte.chemin.elements.Noeud;
import fr.ecole3il.rodez2023.carte.elements.Case;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GraphTest {

    private Graphe<Case> graphe;

    @BeforeEach
    public void setUp() {
        graphe = new Graphe<>();
    }

    @Test
    public void testAjouterNoeud() {
        Noeud<Case> noeud = new Noeud<>(new Case(null, 0, 0));
        graphe.ajouterNoeud(noeud);
        assertTrue(graphe.getNoeuds().contains(noeud));
    }

    @Test
    public void testAjouterArete() {
        Noeud<Case> depart = new Noeud<>(new Case(null, 0, 0));
        Noeud<Case> arrivee = new Noeud<>(new Case(null, 1, 1));
        double cout = 10.0;
        graphe.ajouterArete(depart, arrivee, cout);
        assertEquals(cout, graphe.getCoutArete(depart, arrivee));
    }

    @Test
    public void testGetCoutArete() {
        Noeud<Case> depart = new Noeud<>(new Case(null, 0, 0));
        Noeud<Case> arrivee = new Noeud<>(new Case(null, 1, 1));
        double cout = 10.0;
        graphe.ajouterArete(depart, arrivee, cout);
        assertEquals(cout, graphe.getCoutArete(depart, arrivee));
    }

    @Test
    public void testGetNoeuds() {
        Noeud<Case> noeud1 = new Noeud<>(new Case(null, 0, 0));
        Noeud<Case> noeud2 = new Noeud<>(new Case(null, 1, 1));
        graphe.ajouterNoeud(noeud1);
        graphe.ajouterNoeud(noeud2);
        List<Noeud<Case>> noeuds = graphe.getNoeuds();
        assertTrue(noeuds.contains(noeud1));
        assertTrue(noeuds.contains(noeud2));
    }

    @Test
    public void testGetVoisins() {
        Noeud<Case> depart = new Noeud<>(new Case(null, 0, 0));
        Noeud<Case> arrivee = new Noeud<>(new Case(null, 1, 1));
        double cout = 10.0;
        graphe.ajouterArete(depart, arrivee, cout);
        List<Noeud<Case>> voisins = graphe.getVoisins(depart);
        assertTrue(voisins.contains(arrivee));
    }
}
