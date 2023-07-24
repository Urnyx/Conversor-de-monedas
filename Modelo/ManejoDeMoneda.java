
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

// esta clase se encarga de todas las operaciones y del manejo del arreglo que almacena las monedas.

public class ManejoDeMoneda {
    private ArrayList<Moneda> tiposMoneda = new ArrayList<>();    
    private Moneda moneda;
    
    public void add(Moneda x){
        tiposMoneda.add(x);
    }
    public Moneda get(int x){
        return tiposMoneda.get(x);
    }
    
    public void eliminarInicio(){
        tiposMoneda.remove(0);
    }
    
    public Object[] toArray(){
        return tiposMoneda.toArray();
    }
    
    // Esta función recibe en x1 la cantidad de dinero colombiano y en x2 el valor de la moneda elegida.
   public double convertirDesdePeso(double x1, double x2){
        return x1 * x2;
    }
    
    public double convertirInverso(double x1, double x2){
        return x1 / x2;
    }
       
    public double cambioDesdePeso(){
        return 0;
    }
   
    
}
