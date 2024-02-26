package fr.ecole3il.rodez2023.carte.chemin.elements;

import java.util.ArrayList;
import java.util.List;

public class Noeud<E> {
    private E valeur;
    private List<Noeud<E>> voisins;

    /**
     * Crée un noeud avec une valeur
     * @param valeur la valeur du noeud
     */
    public Noeud(E valeur) {
        this.valeur = valeur;
        this.voisins = new ArrayList<>();
    }

    /**
     * Récupère la valeur du noeud
     * @return la valeur du noeud
     */
    public E getValeur() {
        return valeur;
    }

    /**
     * Récupère la liste des voisins du noeud
     * @return la liste des voisins du noeud
     */
    public List<Noeud<E>> getVoisins() {
        return voisins;
    }

    /**
     * Ajoute un voisin au noeud
     * @param voisin le voisin à ajouter
     */
    public void ajouterVoisin(Noeud<E> voisin) {
        voisins.add(voisin);
    }
}
