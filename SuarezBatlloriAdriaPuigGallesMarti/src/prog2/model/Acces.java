package prog2.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import prog2.vista.ExcepcioEstacio;

/**
 *
 * @author mpuig
 */
public abstract class Acces implements InAcces{
    private LlistaVies llistaVies;
    private String nom;
    private boolean accessibilitat;
    private boolean estat;
    public Acces(LlistaVies llista, String _nom, boolean acces, boolean _estat){
        this.llistaVies = llista;
        this.nom = _nom;
        this.accessibilitat = acces;
        this.estat = _estat;
    }
    @Override
    public void afegirVia(Via via) {
        try {
            this.llistaVies.afegirVia(via);
        }catch(ExcepcioEstacio e){
            System.err.println((e.getMessage()));
        }
    }

    @Override
    public void tancarAcces() {
        this.estat = false;
    }

    @Override
    public void obrirAcces() {
        this.estat = true;
    }

    @Override
    public String toString() {
        String acces = accessibilitat? "És accessible":"No és accessible";
        String state = estat? "obert":"tancat";
        return (" amb nom: " + nom + ", que accedeix a les vies: " + llistaVies.toString() +
                ". " + acces + " per persones amb mobilitat reduida, i està " + state);
    }
}
     
