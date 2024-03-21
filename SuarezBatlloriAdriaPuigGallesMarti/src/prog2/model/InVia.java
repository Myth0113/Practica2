
package prog2.model;

/**
 *
 * @author lauraigual
 */
public interface InVia {
    
    /**
     * Modifica l'estat de la via a Tancada i la il·luminació depenent de la incidència rebuda com a paràmetre
     * @param in Objecte de tipus Incidencia.
     */
    public void tancarVia(Incidencia in);
    
    /**
     * Modifica l'estat de la via a Oberta i la il·luminació al 100%
     */
    public void obrirVia();
}
