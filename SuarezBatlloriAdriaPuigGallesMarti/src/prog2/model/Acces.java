package prog2.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tancarAcces() {
        this.estat = false;
    }

    @Override
    public void obrirAcces() {
        this.estat = true;
    }
    
}
