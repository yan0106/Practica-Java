package interfaz_grafica;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.FlowLayout;

public class MiVentana extends JFrame {
    private JButton boton;

    public MiVentana () {
        Container ct = getContentPane ();
        ct.setLayout (new FlowLayout());
        boton = new JButton("Aceptar");
        ct.add (boton);
        ct.add (new JTextArea("Hola"));
    }
}