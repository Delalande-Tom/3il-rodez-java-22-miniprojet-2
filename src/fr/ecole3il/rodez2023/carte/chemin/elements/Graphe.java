package fr.ecole3il.rodez2023.carte.chemin.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graphe<E> {
    Map<Noeud<E>, Map<Noeud<E>, Double>> voisins;

    public Graphe() {
        this.voisins = new HashMap<>();
    }

    public void ajouterNoeud(Noeud<E> noeud) {
        if (!voisins.containsKey(noeud)) voisins.put(noeud, new HashMap<>());
    }

    public void ajouterArete(Noeud<E> depart, Noeud<E> arrivee, double cout){
        ajouterNoeud(depart);
        ajouterNoeud(arrivee);

        voisins.get(depart).put(arrivee, cout);
    }

    public double getCoutArete(Noeud<E> depart, Noeud<E> arrivee) {
        if (voisins.containsKey(depart) && voisins.get(depart).containsKey(arrivee)) {
            return voisins.get(depart).get(arrivee);
        }
        return Double.POSITIVE_INFINITY;
    }

    public List<Noeud<E>> getNoeuds(){
        return new ArrayList<>(voisins.keySet());
    }

    public List<Noeud<E>> getVoisins(Noeud<E> noeud){
        if (voisins.containsKey(noeud)) {
            return new ArrayList<>(voisins.get(noeud).keySet());
        }
        return new ArrayList<>();
    }
}
