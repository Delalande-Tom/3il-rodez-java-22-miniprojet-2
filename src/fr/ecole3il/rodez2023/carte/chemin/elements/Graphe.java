package fr.ecole3il.rodez2023.carte.chemin.elements;

import fr.ecole3il.rodez2023.carte.elements.Case;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graphe<E> {
    Map<Noeud<E>, Map<Noeud<E>, Double>> voisins;

    public Graphe() {
        this.voisins = new HashMap<>();
    }

    /**
     * Ajoute un noeud au graphe
     * @param noeud le noeud à ajouter
     */
    public void ajouterNoeud(Noeud<E> noeud) {
        if (!voisins.containsKey(noeud)) voisins.put(noeud, new HashMap<>());
    }

    /**
     * Ajoute une arête au graphe
     * @param depart le noeud de départ
     * @param arrivee le noeud d'arrivée
     * @param cout le coût de l'arête
     */
    public void ajouterArete(Noeud<E> depart, Noeud<E> arrivee, double cout){
        assert depart != null && arrivee != null;
        ajouterNoeud(depart);
        ajouterNoeud(arrivee);

        voisins.get(depart).put(arrivee, cout);
    }

    /**
     * Récupère le coût d'une arête
     * @param depart le noeud de départ
     * @param arrivee le noeud d'arrivée
     * @return le coût de l'arête
     */
    public double getCoutArete(Noeud<E> depart, Noeud<E> arrivee) {
        if (voisins.containsKey(depart) && voisins.get(depart).containsKey(arrivee)) {
            return voisins.get(depart).get(arrivee);
        }
        return Double.POSITIVE_INFINITY;
    }

    /**
     * Récupère la liste des noeuds du graphe
     * @return la liste des noeuds du graphe
     */
    public List<Noeud<E>> getNoeuds(){
        return new ArrayList<>(voisins.keySet());
    }

    /**
     * Récupère la liste des voisins d'un noeud
     * @param noeud le noeud dont on veut les voisins
     * @return la liste des voisins du noeud
     */
    public List<Noeud<E>> getVoisins(Noeud<E> noeud){
        if (voisins.containsKey(noeud)) {
            return new ArrayList<>(voisins.get(noeud).keySet());
        }
        return new ArrayList<>();
    }


}
