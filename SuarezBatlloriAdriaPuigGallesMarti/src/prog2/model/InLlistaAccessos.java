
package prog2.model;

import prog2.model.Acces;
import prog2.vista.ExcepcioEstacio;

/**
 *
 * @author lauraigual
 */
public interface InLlistaAccessos {
    
    /**
     * Afegeix un accés rebut per paràmetre a la llista d'accessos.
     * @param acc Objecte de tipus Acces.
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode podria llançar una excepció si fos necessari.
     */
    public void afegirAcces(Acces acc) throws ExcepcioEstacio;
    
    /**
     * Buida la llista d'accessos
     */
     public void buidar();
     
     /**
     * Itera sobre la llista d'accessos i retorna un String amb la informació de tots els accessos amb l'estat rebut per paràmetre.
     * En cas que no hi hagi accessos en l'estat passat com a paràmetre llança una excepció. 
     * @param estat boolean
     * @return String
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode llança una excepció en cas que no hi hagi accessos en l'estat passat com a parametre.
     * 
     */
     public String llistarAccessos(boolean estat) throws ExcepcioEstacio;
     
     /**
      * Recorre tota la llista d'accessos i els tanca.Només decidirà obrir cadascun d'ells si permet l'accés a alguna via oberta.
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode podria llançar una excepció si fos necessari.
      */
     public void actualitzaEstatAccessos() throws ExcepcioEstacio;
     
     /**
     * Itera sobre la llista d'accessos i retorna el número d'accessos amb accessibilitat.
     * @return int
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode podria llançar una excepció si fos necessari.
     */
     public int calculaAccessosAccessibles() throws ExcepcioEstacio;
     
     /**
     * Itera sobre la llista d'accessos, i per els accessos a nivell suma la longitud i la retorna. 
     * @return float amb la longitud dels accessos a nivell.
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode podria llançar una excepció si fos necessari.
     */
     public float calculaLongitudAccessosNivell() throws ExcepcioEstacio;
}
