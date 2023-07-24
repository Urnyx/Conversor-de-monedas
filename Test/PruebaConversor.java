
package Test;

import Modelo.ManejoDeMoneda;
import Modelo.Moneda;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/** otras monedas y su valor respecto al precio colombiano.
 * 
 * @author Daniel
 */

/*
        monedas.add(new Moneda("Bolívar Venezolano", 8.296296));
        monedas.add(new Moneda("Corona Checa", 0.00535));
        monedas.add(new Moneda("Corona Sueca", 0.00257));
        monedas.add(new Moneda("Dinar Kuwait", 7.69215));
        monedas.add(new Moneda("Dólar Australiano", 0.00037));
        monedas.add(new Moneda("Dirham Emiratos", 0.00092));
        monedas.add(new Moneda("Dólar Canadiense", 0.00040));
        monedas.add(new Moneda("Dólar Hong Kong", 0.00195));
        monedas.add(new Moneda("Peso Mexicano", 0.00419));
        monedas.add(new Moneda("Florín Húngaro", 0.08465));
        monedas.add(new Moneda("Franco Suizo", 0.000215));
        monedas.add(new Moneda("Peso Argentino", 0.06728));
        monedas.add(new Moneda("Peso Chileno", 0.20271));
        monedas.add(new Moneda("Peso Uruguayo", 0.00955));
        monedas.add(new Moneda("Real Brasileño", 0.00120));
        monedas.add(new Moneda("Rublo Ruso", 0.023012));
        monedas.add(new Moneda("Rupia India", 0.02059));
        monedas.add(new Moneda("Yuan", 0.001813));
        monedas.add(new Moneda("Zloty Polaco", 0.00099));
*/

/** Clase para testear
 * 
 * @author Daniel
 */

public class PruebaConversor { 
    public static void main(String[] args) {
        
        /** 
         * arreglo con las opcines de conversion.
         */
        ArrayList<String> tipoConversion = new ArrayList<>();
        
        //Añadiendo opciones
        tipoConversion.add("Conversor de Moneda");
        tipoConversion.add("otros conversores");
        
        /**
         * Objeto con las operaciones de conversion.
         */
        ManejoDeMoneda operacionesDeMoneda = new ManejoDeMoneda();
        
        /**
         * Arreglo con las opciones de conversión.
         */
        ArrayList<Moneda> monedas = new ArrayList<>();
        
        //Añadiendo las monedas.
        
        monedas.add(new Moneda("Peso Colombiano", 0));
        monedas.add(new Moneda("Dólar", 0.00025));
        monedas.add(new Moneda("Euro", 0.00022));
        monedas.add(new Moneda("Yen", 0.03504));
        monedas.add(new Moneda("Libra", 0.000194));
        
         String conversor;  // Almacena la conversión elegida.
         Moneda moneda;     //Almacena la primera moneda elegida.
         Moneda moneda2 = null; //Almacena la segunda moneda elegida.
         double valorIngresado; //Almacena el valor ingresado.
         double resultado;      //Almacena el resultado.
         boolean exit = true;   //Cuando sea false se cierra el ciclo.
         
         //ciclo encargado del menu.
         while(exit){
             
             /*Solicitud del tipo de conversor que desea usar y
             lo almacena en la variable "conversor"*/
             
            conversor = (String) JOptionPane.showInputDialog (null,
                "Elija el tipo de conversor que desea usar.", "Entrada",
                JOptionPane.INFORMATION_MESSAGE, null, 
                tipoConversion.toArray(), tipoConversion.get(0));
            
            /*solicitud del tipo de moneda que desea convertir*/
            moneda = primerMoneda(monedas);
                 
            /*llama a la funcion que recibe y valida si el input es un numero postivo*/
            valorIngresado = insertarNumeroPositivo();
            
            /* Este while no permite continuar 
            si las dos moendas a convertir son iguales.
            */
            
            while(moneda!=null){
                moneda2 =  segundaMoneda(monedas);
                
                //Valida si la primer y ultima moneda son diferentes.
                
                if(!moneda.getNombre().equals(moneda2.getNombre())){
                    break;
                }
                //Si son iguales arroja el mensaje.
                
                JOptionPane.showMessageDialog(null, "No puedes ingresar la misma moneda");
            }
            
            /**
             * Condicional que valida si la conversión sera inversa o no.
             **/
            
            //Si la 2da moneda es "Peso Colombiano" la conversión es inversa.
            if(moneda2.getNombre().equals("Peso Colombiano")){
                resultado = operacionesDeMoneda.convertirInverso(valorIngresado, moneda.getValor());
            }else{
            //Si la 2da moneda no es "Peso Colombiano" la conversión es normal.
            
                resultado = operacionesDeMoneda.convertirDesdePeso(valorIngresado, moneda2.getValor());
            }
            
            //Muestra el resultado.
            
            JOptionPane.showMessageDialog(null, resultado);
            
            /*Se encarga de validar si el usuario desea seguir con el programa*/
            int x = JOptionPane.showConfirmDialog(null, "Desea continuar?.");
            
            if(x==0){
                //Si joptionPane retorna '0' la opción seleccionada es "SI"
                exit = true;
            }else{
                //Si el usuario no selecciono "Si" exit es igual a "false" y se termina el programa.
                exit = false;
                
                JOptionPane.showMessageDialog(null, "Programa finalizado :)");
            }
         }
        
        
    }
    
    //Función encargda de pedir la primera moneda.
    
    public static Moneda primerMoneda(ArrayList monedas){
        return (Moneda) JOptionPane.showInputDialog(null, 
                "Elija la moneda que desea convertir.", "Entrada", 
                JOptionPane.QUESTION_MESSAGE, null, monedas.toArray(), monedas.get(0));
    }
    
    //Función encargda de pedir la segunda moneda.
    
    public static Moneda segundaMoneda(ArrayList monedas){
        return  (Moneda) JOptionPane.showInputDialog(null, 
                "Elija a que moneda desea convertir.", "Entrada", 
                JOptionPane.QUESTION_MESSAGE, null, monedas.toArray(), monedas.get(0));
    }
    
    /*Esta funcion se encarga de recibir la cantidad que se desea convertir 
    y valida que sea un tipo numerico positivo.
    */
    
    public static double insertarNumeroPositivo() {
        double numero = 0;
        boolean valorb = true;
        
        while(valorb){
            
            //Recibe un valor de entrada.
            String valorIngresado = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir.");
            
            try {
                /**
                 * Intenda convertir "valorIngresado" a double,
                 * si lo logra "valorb" se vuelve "true" y acaba el ciclo. 
                **/
                
                numero = Double.parseDouble(valorIngresado);
                valorb = false;
            } catch (NumberFormatException e) {
                
                //Si falla el intento, atrapa el error y arroja un mensaje, el ciclo continua.
                
                JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return numero;
    }
    
    }



