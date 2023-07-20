
package Test;

import Modelo.ManejoDeMonedas;
import Modelo.Moneda;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PruebaConversor { 
    public static void main(String[] args) {
        ArrayList<String> tipoConversion = new ArrayList<>();
        
        tipoConversion.add("Conversor de Moneda");
        tipoConversion.add("otros conversores");
        
        ManejoDeMonedas monedas = new ManejoDeMonedas();
        monedas.add(new Moneda("Dólar", 0.00025));
        monedas.add(new Moneda("Peso Mexicano", 0.00419));
        monedas.add(new Moneda("Bolívar Venezolano", 8.296296));
        monedas.add(new Moneda("Corona Checa", 0.00535));
        monedas.add(new Moneda("Corona Sueca", 0.00257));
        monedas.add(new Moneda("Dinar Kuwait", 7.69215));
        monedas.add(new Moneda("Dólar Australiano", 0.00037));
        monedas.add(new Moneda("Dirham Emiratos", 0.00092));
        monedas.add(new Moneda("Dólar Canadiense", 0.00040));
        monedas.add(new Moneda("Dólar Hong Kong", 0.00195));
        monedas.add(new Moneda("Euro", 0.00022));
        monedas.add(new Moneda("Florín Húngaro", 0.08465));
        monedas.add(new Moneda("Franco Suizo", 0.000215));
        monedas.add(new Moneda("Libra", 0.000194));
        monedas.add(new Moneda("Peso Argentino", 0.06728));
        monedas.add(new Moneda("Peso Chileno", 0.20271));
        monedas.add(new Moneda("Peso Uruguayo", 0.00955));
        monedas.add(new Moneda("Real Brasileño", 0.00120));
        monedas.add(new Moneda("Rublo Ruso", 0.023012));
        monedas.add(new Moneda("Rupia India", 0.02059));
        monedas.add(new Moneda("Yen", 0.03504));
        monedas.add(new Moneda("Yuan", 0.001813));
        monedas.add(new Moneda("Zloty Polaco", 0.00099));
        
        System.out.println(monedas.get(5).toString());
         String valor;
         String valor2;
        valor = (String) JOptionPane.showInputDialog (null,
                "Elija el tipo de conversor que desea usar.", "Entrada",
                JOptionPane.INFORMATION_MESSAGE, null, 
                tipoConversion.toArray(), tipoConversion.get(0));
        
        valor2 = (String) JOptionPane.showInputDialog(null, 
                "Elija la moneda que desa convertir.", "Entrada", 
                JOptionPane.QUESTION_MESSAGE, null, monedas.toArray(), monedas.get(0));
        
        System.out.println(valor);
        System.out.println(valor2);
        menu();
        
    }
    public static void menu(){

    }
}


