
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

    /** esta clase se encarga de todas las operaciones de las monedas. */
   
    public class ManejoDeMoneda {
    
    /** Esta función recibe en x1 la cantidad de dinero colombiano y 
     * en x2 el valor de la moneda elegida. */  
    public double convertirDesdePeso(double x1, double x2){
        return x1 * x2;
    }
    
    /** Esta función recibe en x1 la cantidad de dinero de la moneda elegida y 
     * en x2 la cantidad de dinero. */  
    public double convertirInverso(double x1, double x2){
        return x1 / x2;
    }

    /** Esta función devuelve el valor de una moneda a travez de su nombre
     *  recibe el nombre de la moneda y la lista donde esta la moneda con su 
     *  valor.
     * @param nombre
     * @param moneda
     * @return 
     */
    
    public double obtenerValorPorNombre(String nombre, ArrayList<Moneda> moneda){
        double resultado = 0;
        
        /**
         * recorre la lista en busca de una moneda con el mismo 
         * nombre del parametro "nombre" recibido por la función.
         * 
         * IMPORTANTE: La función siempre retornara el valor de una moneda,
         * debido a que el "nombre" que recibe la función se deriva de una lista
         * de "String" que contiene todos los nombres de la lista de monedas
         * y depende de ella.
         */
        
        for (Moneda moneda1 : moneda) {
            if(nombre.equals(moneda1.toString()))
                resultado = moneda1.getValor();
        }
        return resultado;
    }    
    
}
