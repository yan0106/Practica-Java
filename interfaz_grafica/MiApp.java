package interfaz_grafica;

import javax.swing.SwingUtilities;

public class MiApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
            new Runnable() {
                public void run () {
                    MiVentana mi = new MiVentana();
                    mi.setVisible (true);
                }
            }
        );
    }
}
