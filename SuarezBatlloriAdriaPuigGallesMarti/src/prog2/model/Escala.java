/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author mpuig
 */
public class Escala extends AccesDesnivell{

    public Escala(LlistaVies llista, String _nom, boolean acces, boolean _estat, int _desnivell) {
        super(llista, _nom, acces, _estat, _desnivell);
    }

    @Override
    public String toString() {
        return ("Acces de tipus Escala, " + super.toString());
    }
}
