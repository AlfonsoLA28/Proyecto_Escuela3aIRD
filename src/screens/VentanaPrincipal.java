package screens;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

    private JMenuBar menuBar; // Barra de menu
    private JMenu menuAlumnos; // Menu Alumnos  
    private JMenuItem menuInsertarAlumnos; // Elemento Insertor
    private JMenuItem menuVerAlumnos;
    private JMenuItem menuEliminarAlumnos;

    private JMenu menuBachilleratos;
    private JMenuItem menuVerBachilleratos;

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

        // menu ver alumnos 
        menuVerAlumnos = new JMenuItem("Ver todos los Alumnos...");

        // menu eliminar Alumnos
        menuEliminarAlumnos = new JMenuItem("Dar de baja alumno...");

        // menu Bachilleratos
        menuBachilleratos = new JMenu();
        menuBachilleratos.setText("Bachilleratos");

        // menu ver Bachilleratos
        menuVerBachilleratos = new JMenuItem("Ver tosos los Bachilleratos...");




        //Agreagando menu
        menuAlumnos.add(menuVerAlumnos);   
        menuAlumnos.add(menuInsertarAlumnos);
        menuAlumnos.add(menuEliminarAlumnos);     
        menuBar.add(menuAlumnos);

        // Agregar menu Bachilleratos
        menuBachilleratos.add(menuVerBachilleratos);
        menuBar.add(menuBachilleratos);

        this.setJMenuBar(menuBar); // menuBar es la  unica barra del JFrame 


        pack(); // Empaquetar los componentes del JFrame




    }
}
