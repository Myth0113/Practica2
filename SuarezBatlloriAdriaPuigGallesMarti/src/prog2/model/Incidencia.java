
package prog2.model;

/**
 *
 * @author lauraigual
 */
public class Incidencia {
    
    public static enum TipusIncidencia {
        Reparacio,
        Objecte,
        Tancament
    };
    
    private int num_;
    private TipusIncidencia tipus_; 
    private Via via_;
    private String data_;

    public Incidencia(int num_, TipusIncidencia tipus_, Via via_, String data_) {
        this.num_ = num_;
        this.tipus_ = tipus_;
        this.via_ = via_;
        this.data_ = data_;
    }

    
    public int getNum_() {
        return num_;
    }
    public TipusIncidencia getTipus_() {
        return tipus_;
    }

    public Via getVia_() {
        return via_;
    }

    public String getData_() {
        return data_;
    }

     
    public void setNum_(int num_) {
        this.num_ = num_;
    }
    public void setTipus_(TipusIncidencia tipus_) {
        this.tipus_ = tipus_;
    }

    public void setVia_(Via via_) {
        this.via_ = via_;
    }

    public void setData_(String data_) {
        this.data_ = data_;
    }
    
    /**
     * Retorna la informació del percentatge de la il·luminació a la que s'ha de deixar la via segons el tipus de incidència.
     * @return 
     */
    public String getIluminacioVia(){
        
        String iluminacio="";
        switch(tipus_) {
            case Reparacio:
                iluminacio = "100%";
                break;
            case Objecte:
                iluminacio = "50%";
                break;  
            case Tancament:
                iluminacio = "0%";
                break;   
        }
        return iluminacio;
    }

    @Override
    public String toString() {
        return "Incidencia{" + "num_=" + num_ + ", tipus_=" + tipus_ + ", via_=" + via_ + ", data_=" + data_ + '}';
    }
    
    
    
    
    
    
    
}
    
