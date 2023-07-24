
package Modelo;


/** Esta clase guarda el nombre y 
 * el valor de las monedas en comparacion a las de colombia.
 **/
public class Moneda {
    private String nombre;
    private double valor;

/** 
 * toString solo devuelve el nombre de la moneda 
 **/
    @Override
    public String toString() {
        return nombre;
    }

/** El constructor recibe el nombre y el valor de la moneda.
 * 
 * @param nombre
 * @param valor 
 */    
    public Moneda(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }


    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }
}
