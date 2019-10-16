package collection;

import org.w3c.dom.ls.LSOutput;

public class CD implements Comparable<CD> {
    private String auteur, titre;
    private double prix;

    public CD() {
    }

    public CD(String auteur, String titre, double prix) {
        this.auteur = auteur;
        this.titre = titre;
        this.prix = prix;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "CD [auteur =" + auteur + " , titre = " + titre + " , prix = " + prix + "]";
    }

    @Override
    public int compareTo(CD o) {
        if (this.prix == o.prix){
            return 0;
        }else if (this.prix > o.prix){
            return 1;
        }
        return -1;
    }


    public static void main(String[] args) {

        System.out.println(new CD("larbi","trtrt",2).compareTo(new CD("nasim","fdfd",2)));
    }
}
