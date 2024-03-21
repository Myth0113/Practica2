/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author mpuig
 */
public abstract class AccesNivell extends Acces{
    private int longitud;
    public AccesNivell(LlistaVies llista, String _nom, boolean acces, boolean _estat, int _longitud){
        super(llista, _nom, acces, _estat);
        this.longitud = _longitud;
    }
    public int getLongitud(){
        return(this.longitud);
    }
    public void setLongitud(int lon){
        this.longitud = lon;
    }
}
