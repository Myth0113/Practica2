/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author mpuig
 */
public class CintaTransportadora extends AccesNivell{
    private double velocitat;
    public CintaTransportadora(LlistaVies llista, String _nom, boolean acces, boolean _estat, int _longitud, double _velocitat){
        super(llista, _nom, acces, _estat, _longitud);
        this.velocitat = _velocitat;
    }
    public double getVelocitat(){
        return(this.velocitat);
    }
    public void setVelocitat(double _velocitat){
        this.velocitat = _velocitat;
    }
    
}
