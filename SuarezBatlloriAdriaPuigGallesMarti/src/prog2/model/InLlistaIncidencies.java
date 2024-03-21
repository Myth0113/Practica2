
package prog2.model;

import prog2.vista.ExcepcioEstacio;

/**
 *
 * @author lauraigual
 */
public interface InLlistaIncidencies {
    
    /**
     * Aquest mètode crea una incidència amb la informació passada com a paràmetres 
     * (número d'identificador, tipus, la via on s'ha produït i la data) i l'afegeix a la llista.
     * A més, s'ha de comprovar que aquesta via no té ja una incidència si ja té una incidència s'ha de llançar una excepció.
     * Una vegada creada la incidència s'ha de tancar la via corresponent.
     * @param num Número d'identificació de la incidència.
     * @param tipus Aquest String permet crear el enum TipusIncidencia
     * @param via Via on es produiex la incidència
     * @param data Data quan es produeix la incidènica.
     * @throws ExcepcioEstacio Per comprovar i avisar si la via ja té una incidènica o si el tipus d’incidència que es vol afegir no existeix.
     */
    public void afegirIncidencia(int num, String tipus, Via via, String data) throws ExcepcioEstacio;
    
    /**
    * Aquest mètode elimina una incidència de la llista i actualitza l'estat de la via mitjançant el mètode obrirVia de la classe Via.
    * @param in Objecte de tipus Incidència
    * @throws ExcepcioEstacio 
     */
    public void eliminarIncidencia(Incidencia in) throws ExcepcioEstacio;
    
    /**
     * Itera sobre la llista d'incidències i retorna un String amb la informació de totes les incidències. 
     * En cas que no hi hagi cap incidència llança una excepció. 
     * @return String
     * @throws ExcepcioEstacio 
     */
    public String llistarIncidencies() throws ExcepcioEstacio;
    
    /**
     * Busca la incidència amb el número rebut per paràmetre i la retorna. 
     * En cas que no existeixi llança una excepció.
     * @param num Número d'identificació de la incidència.
     * @return Objecte de tipus Incidència
     * @throws ExcepcioEstacio Aquest mètode llança una excepció si no existeix cap incidència amb el número passat per paràmetre.
     */
    public Incidencia getIncidencia(int num) throws ExcepcioEstacio;
}
