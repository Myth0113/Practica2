
package prog2.model;

import prog2.vista.ExcepcioEstacio;

/**
 *
 * @author lauraigual
 */
public interface InLlistaVies {
    
    /**
     * Afegeix una via rebuda per paràmetre a la llista de vies.
     * @param via Objecte de tipus Via
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode podria llançar una excepció si fos necessari.
     */
    public void afegirVia(Via via) throws ExcepcioEstacio;
    
    /**
     * Buida la llista de vies.
     */
    public void buidar();
    
    /**
     * Itera sobre la llista de vies i retorna un String amb la informació de totes les vies amb l'estat rebut per paràmetre.
     * En cas que no hi hagi vies en l'estat passat com a paràmetre llança una excepció. 
     * @param estat
     * @return String
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode llança una excepció en cas que no hi hagi vies en l'estat passat com a parametre.
     */
    public String llistarVies(String estat) throws ExcepcioEstacio;
    
    /**
     * Mira si la llista de vies conté alguna via oberta.
     * @return boolean
     */
    public boolean containsViesObertes();
    
    /**
     * Mira si la llista de vies conté la via rebuda per paràmetre i retorna un booleà amb la informació.
     * @param via
     * @return boolean
     */
    
    public boolean contains(Via via);
    
    /**
     * Busca la via amb el nom rebut per paràmetre i la retorna. En cas que no existeixi llança una excepció.
     * @param nom String amb el nom de la Via
     * @return  Objecte de tipus Via
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode podria llançar una excepció si fos necessari.
     */
    public Via getVia(String nom) throws ExcepcioEstacio;
    
 
}
