/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author mpuig
 */
public abstract class AccesDesnivell extends Acces{
    private int desnivell;
    public AccesDesnivell(LlistaVies llista, String _nom, boolean acces, boolean _estat, int _desnivell){
        super(llista, _nom, acces, _estat);
        this.desnivell = _desnivell;
    }
    public int getDesnivell() {
        return (this.desnivell);
    }
    public void setDesnivell(int _desnivell) {
        this.desnivell = _desnivell;
    }
    @Override
    public String toString(){
        return(super.toString() + ", té un desnivell de " + desnivell + "m.");
    }
}
