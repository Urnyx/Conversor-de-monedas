
package Modelo;


// Esta clase sera la que guarte el nombre y el valor de las monedas en comparacion a las de colombia.

public class Moneda {
    private String nombre;
    private double valor;

// toString solo devuelve el nombre de la moneda, es lo unico necesario de acuerdo a la logica del negocio.
    @Override
    public String toString() {
        return nombre;
    }

    
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
