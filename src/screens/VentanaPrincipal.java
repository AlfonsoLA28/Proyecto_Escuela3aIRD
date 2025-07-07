package screens;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

    private JMenuBar menuBar; // Barra de menu
    private JMenu menuAlumnos; // Menu Alumnos  
    private JMenuItem menuInsertarAlumnos; // Elemento Insertor
    public VentanaPrincipal(String tittle){
        this.setTitle(tittle);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponet();
    }

    private void initComponet(){
        //Barra de menu
        menuBar = new JMenuBar();

        // menu Alumnos 
        menuAlumnos = new JMenu();
        menuAlumnos.setText("Alumnos");

        // menu Insertar
        menuInsertarAlumnos =  new JMenuItem();
        menuInsertarAlumnos.setText("Insertar...");


        //Agreagando menu
        menuAlumnos.add(menuInsertarAlumnos);
        menuBar.add(menuAlumnos);

        this.setJMenuBar(menuBar); // menuBar es la  unica barra del JFrame 


        pack(); // Empaquetar los componentes del JFrame

    }
}
