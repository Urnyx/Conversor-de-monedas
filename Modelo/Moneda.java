
package Modelo;

public class Moneda {
    private String nombre;
    private double valor;

    @Override
    public String toString() {
        return nombre;
    }

    
    public Moneda(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public Moneda(String dolár, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }
}
