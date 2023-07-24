
package Modelo;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ConvertidorApp extends JFrame{
    private JMenuBar  menuBar;
    private JMenu menu;
    private JMenuItem option1;
    private JMenuItem option2;
    private JMenuItem option3;
    
    public ConvertidorApp(){
        setSize(600,400);
        setTitle("Conversor");
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        ConvertidorApp ventana = new ConvertidorApp();
        ventana.setVisible(true);
    }
} 
