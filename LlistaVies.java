package prog2.model;

import prog2.vista.ExcepcioEstacio;

import java.util.*;

public class LlistaVies implements InLlistaVies{
    private ArrayList<Via> llistaVies;
    
    public LlistaVies(){
        this.llistaVies = new ArrayList<>();
    }
    @Override
    public void afegirVia(Via via) throws ExcepcioEstacio {
        for (Via aux : llistaVies) {
            if (aux.getNom().equals(via.getNom())) {
                ExcepcioEstacio e = new ExcepcioEstacio("Aquest acces ja accedeix a aquesta via!");
                throw e;
            }
        }
        this.llistaVies.add(via);
    }

    @Override
    public void buidar() {
        llistaVies.clear();
    }

    @Override
    public String llistarVies(String estat) throws ExcepcioEstacio {
        Via viaTrobada = null;
        for(Via aux : llistaVies){
            if(aux.getEstat().equals(estat)){
                viaTrobada = aux;
                break;
            }
        }
        if(viaTrobada != null){
            String message = viaTrobada.toString();
            return message;
        }
        else{
            throw new ExcepcioEstacio("Inicdencia no trobada.");
        }
    }

    @Override
    public boolean containsViesObertes() {
        boolean viaOberta = false;
        for(Via aux : llistaVies){
            if(aux.getEstat().equals("Oberta")){
                viaOberta = true;
            }
        }
        return viaOberta;
    }

    @Override
    public boolean contains(Via via) {
        return llistaVies.contains(via);
    }

    @Override
    public Via getVia(String nom) throws ExcepcioEstacio {
        Via viaTrobada = null;
        for(Via aux : llistaVies){
            if(aux.getNom().equals(nom)){
                viaTrobada = aux;
                break;
            }
        }
        if(viaTrobada != null){
            return viaTrobada;
        }
        else{
            throw new ExcepcioEstacio("Via no trobada.");
        }
    }

}
