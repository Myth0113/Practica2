/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author mpuig
 */
public class Via implements InVia{
    private String nom;
    private String amplada;
    private int numTunels;
    private boolean estat;
    private String iluminacio;
    public Via(String _nom, String _amplada, int _numTunels, boolean _estat, String _iluminacio){
        this.nom = _nom;
        this.amplada = _amplada;
        this.numTunels = _numTunels;
        this.estat = _estat;
        this.iluminacio = _iluminacio;
    }
    @Override
    public void tancarVia(Incidencia in) {
        this.estat = false;
        this.iluminacio = in.getIluminacioVia();
    }

    @Override
    public void obrirVia() {
        this.estat = true;
        this.iluminacio = "100%";
    }
    public String getNom(){
        return(this.nom);
    }
    public void setNom(String _nom){
        this.nom = _nom;
    }
    public String getAmplada(){
        return(this.amplada);
    }
    public void setAmplada(String _amplada){
        this.amplada = _amplada;
    }
    public int getNumTunels(){
        return(this.numTunels);
    }
    public void setNumTunels(int _numTunels){
        this.numTunels = _numTunels;
;    }
    public boolean getEstat(){
        return(this.estat);
    }
    public void setEstat(boolean _estat){
        this.estat = _estat;
    }
    public String getIluminacio(){
        return(this.iluminacio);
    }
    public void setIluminacio(String _iluminacio){
        this.iluminacio = _iluminacio;
    }
    @Override
    public String toString(){
        String s;
        String state = getEstat()? "oberta":"tancada";
        s = "Via amb nom: " + nom + ", amplada: " + amplada + ", " + numTunels + "tunels. Estacio " + state + "i amb una iluminació del " + iluminacio;
        return (s);
    }
}
