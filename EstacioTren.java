package prog2.model;

import prog2.vista.ExcepcioEstacio;

public class EstacioTren {
    private LlistaVies llistaVies;
    private LlistaAccessos llistaAccesos;
    private LlistaIncidencies llistaIncidencies;
    private String nom;
    
    
    public EstacioTren(String nom){
        this.nom = nom;
        this.llistaVies = new LlistaVies();
        this.llistaAccesos = new LlistaAccessos();
        this.llistaIncidencies = new LlistaIncidencies();
    }
    
    public void afegirIncidencia(int num, String tipus, String nomVia, String data) throws ExcepcioEstacio{
        Via via = llistaVies.getVia(nom);
        llistaIncidencies.afegirIncidencia(num, tipus, via, data);
    }
    
    public void eliminarIncidencia(int num) throws ExcepcioEstacio{
        Incidencia incidencia = llistaIncidencies.getIncidencia(num);
        llistaIncidencies.eliminarIncidencia(incidencia);
        llistaAccesos.actualitzaEstatAccessos();
    }
    
}
