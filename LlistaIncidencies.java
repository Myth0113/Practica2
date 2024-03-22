package prog2.model;

import java.util.ArrayList;
import prog2.model.Incidencia.TipusIncidencia;
import prog2.vista.ExcepcioEstacio;

public class LlistaIncidencies implements InLlistaIncidencies{
    private ArrayList<Incidencia> llistaIncidencies;
    
    public LlistaIncidencies(){
        this.llistaIncidencies = new ArrayList<>();
    }

    @Override
    public void afegirIncidencia(int num, String tipus, Via via, String data) throws ExcepcioEstacio{
        for(Incidencia aux : llistaIncidencies){
            if (aux.getVia_().equals(via)){
                throw new ExcepcioEstacio("Aquesta via ja te una incidencia i ja ha sigut tancada.");
            }
        }
        Incidencia novaIncidencia = new Incidencia(num, TipusIncidencia.valueOf(tipus), via, data);
        llistaIncidencies.add(novaIncidencia);  
    }

    @Override
    public void eliminarIncidencia(Incidencia in) throws ExcepcioEstacio {
        llistaIncidencies.remove(in);
    }

    @Override
    public String llistarIncidencies() throws ExcepcioEstacio {
        String message = "";
        int cont = 0;
        for(Incidencia aux : llistaIncidencies){
            cont++;
            message += "Incidencia " + cont + ": " + aux.toString() + "\n";
        }
        return message;
    }

    @Override
    public Incidencia getIncidencia(int num) throws ExcepcioEstacio {
        Incidencia incidenciaTrobada = null;
        for(Incidencia aux : llistaIncidencies){
            if(aux.getNum_() == num){
                incidenciaTrobada = aux;
                break;
            }
        }
        if(incidenciaTrobada != null){
            return incidenciaTrobada;
        }
        else{
            throw new ExcepcioEstacio("Inicidencia no trobada.");
        }
    }
    
}
