
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
   /* public double convertirDesdePeso(double x1, double x2){
        return x1 * x2;
    }
    
    public double convertirInverso(double x1, double x2){
        return x1 / x2;
    }
    */
    
    public double convertir(double x1, Moneda x2){
        System.out.println(x2.getValor());
        if(!x2.getNombre().equals("Peso Colombiano")){
            return x1 * x2.getValor();
        }else{
            return x1/x2.getValor();
        }
    }
    public double cambioDesdePeso(){
        return 0;
    }
    //Esta funcion se encarga de recibir la cantidad que se desea convertirDesdePeso y valida que sea un tipo numerico positivo.
    public double insertarNumeroPositivo() {
    double numero = 0;
    boolean valorb = true;

    while(valorb){
        String valorIngresado = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir.");
        try {
            numero = Double.parseDouble(valorIngresado);
            valorb = false;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    return numero;
    }
    
    
}
