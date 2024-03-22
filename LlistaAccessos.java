package prog2.model;

import java.util.ArrayList;
import prog2.vista.ExcepcioEstacio;

public class LlistaAccessos implements InLlistaAccessos{
    private ArrayList<Acces> llistaAccessos;

    public LlistaAccessos(){
        this.llistaAccessos = new ArrayList<>();
    }
    
    @Override
    public void afegirAcces(Acces acc) throws ExcepcioEstacio {
        if(!llistaAccessos.contains(acc)){
            llistaAccessos.add(acc);
        }
        else{
            throw new ExcepcioEstacio("Aquest acces ja existeix.");
        }
    }

    @Override
    public void buidar() {
        llistaAccessos.clear();
    }

    @Override
    public String llistarAccessos(boolean estat) throws ExcepcioEstacio {
        String message = "";
        for(Acces aux : llistaAccessos){
            if(aux.getEstat() == estat){
                message += aux.toString();
            }
        }
        if(message.equals("")) {
            throw new ExcepcioEstacio("No hi ha accessos a l'estat proporcionat");
        } else{
            return message;
        }
    }

    @Override
    public void actualitzaEstatAccessos() throws ExcepcioEstacio {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calculaAccessosAccessibles() throws ExcepcioEstacio {
        int num = 0;
        for(Acces aux : llistaAccessos){
            if(aux.isAccessibilitat()){
                num++;
            }
        }
        
        if(num != 0){
            return num;
        }
        else{
            throw new ExcepcioEstacio("No hi ha cap acces amb accessibilitat. ");
        }
    }

    @Override
    public float calculaLongitudAccessosNivell() throws ExcepcioEstacio {
        float longitud = 0;
        for(Acces aux : llistaAccessos){
            if(aux instanceof AccesNivell){
                longitud += ((AccesNivell) aux).getLongitud();
            }
        }
        if(longitud != 0.0){
            return longitud;
        }
        else{
            throw new ExcepcioEstacio("No hi ha cap acces a nivell. ");
        }
    }
    
}
