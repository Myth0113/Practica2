package prog2.model;

public class Via implements InVia{
    private String nom;
    private String amplada;
    private int numTunels;
    private String estat;
    private String iluminacio;
    
    public Via(String _nom, String _amplada, int _numTunels, String _estat, String _iluminacio){
        this.nom = _nom;
        this.amplada = _amplada;
        this.numTunels = _numTunels;
        this.estat = _estat;
        this.iluminacio = _iluminacio;
    }
    @Override
    public void tancarVia(Incidencia in) {
        setEstat("Tancada");
        setIluminacio(in.getIluminacioVia());
    }

    @Override
    public void obrirVia() {
        setEstat("Oberta");
        setIluminacio("100%");
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
    public String getEstat(){
        return(this.estat);
    }
    public void setEstat(String _estat){
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
        String state = getEstat().equals("Oberta") ? "oberta" : "tancada";
        s = "Via amb nom: " + nom + ", amplada: " + amplada + ", " + numTunels +
                "tunels. Estacio " + state + "i amb una iluminacio del " + iluminacio;
        return (s);
    }
}
