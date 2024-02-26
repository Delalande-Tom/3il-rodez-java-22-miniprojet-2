package fr.ecole3il.rodez2023.carte.chemin.algorithmes;

import fr.ecole3il.rodez2023.carte.chemin.elements.Graphe;
import fr.ecole3il.rodez2023.carte.chemin.elements.Noeud;

import java.util.List;

public interface AlgorithmeChemin<E> {
    /**
     * Trouve le chemin le plus court entre deux noeuds dans un graphe
     * @param graphe le graphe dans lequel chercher le chemin
     * @param depart le noeud de départ
     * @param arrivee le noeud d'arrivée
     * @return le chemin le plus court entre les deux noeuds
     */
    List<Noeud<E>> trouverChemin(Graphe<E> graphe, Noeud<E> depart, Noeud<E> arrivee);
}
