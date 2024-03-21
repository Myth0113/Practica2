/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author mpuig
 */
public class EscalaMecanica extends AccesDesnivell{
    private String marca;

    public EscalaMecanica(LlistaVies llista, String _nom, boolean acces, boolean _estat, int _desnivell, String _marca) {
        super(llista, _nom, acces, _estat, _desnivell);
        this.marca = _marca;
    }

    public String getMarca() {
        return (this.marca);
    }

    public void setMarca(String _marca) {
        this.marca = _marca;
    }
}
