/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package prog2.model;

/**
 *
 * @author lauraigual
 */
public interface InAcces {
    
    /**
     * Afegeix una via rebuda com a paràmetre a la llista de vies de l'accés
     * @param via 
     */
    public void afegirVia(Via via);
    
    /**
     * Canvia l'estat de l'accés a tancat
     */
    public void tancarAcces();
    
    /**
     * Canvia l'estat de l'accés a obert 
     */
    public void obrirAcces();
}
