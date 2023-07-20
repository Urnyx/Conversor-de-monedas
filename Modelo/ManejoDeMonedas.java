
package Modelo;

import java.util.ArrayList;

public class ManejoDeMonedas {
    private ArrayList<Moneda> tiposMoneda = new ArrayList<>();    
    
    public void add(Moneda x){
        tiposMoneda.add(x);
    }
    public Moneda get(int x){
        return tiposMoneda.get(x);
    }
    
    public Object[] toArray(){
        return tiposMoneda.toArray();
    }
    
    
}
