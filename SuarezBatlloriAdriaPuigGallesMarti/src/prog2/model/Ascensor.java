/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author mpuig
 */
public class Ascensor extends AccesDesnivell{
    private double pesMax;
    public Ascensor(LlistaVies llista, String _nom, boolean acces, boolean _estat, int _desnivell, double _pesMax) {
        super(llista, _nom, acces, _estat, _desnivell);
        this.pesMax = _pesMax;
    }

    public double getPesMax() {
        return (this.pesMax);
    }

    public void setPesMax(double _pesMax) {
        this.pesMax = _pesMax;
    }
}
