/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

import prog2.vista.ExcepcioEstacio;

import java.util.*;

/**
 *
 * @author mpuig
 */
public class LlistaVies implements InLlistaVies{
    private ArrayList<Via> llistaVies;
    public LlistaVies(ArrayList<Via> _llistaVies){
        this.llistaVies = _llistaVies;
    }
    @Override
    public void afegirVia(Via via) throws ExcepcioEstacio {
        for (Via llistaVY : llistaVies) {
            if (llistaVY.getNom().equals(via.getNom())) {
                ExcepcioEstacio e = new ExcepcioEstacio("Aquest acces ja accedeix a aquesta via!");
                throw e;
            }
        }
        this.llistaVies.add(via);
    }

    @Override
    public void buidar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String llistarVies(String estat) throws ExcepcioEstacio {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean containsViesObertes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean contains(Via via) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Via getVia(String nom) throws ExcepcioEstacio {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
