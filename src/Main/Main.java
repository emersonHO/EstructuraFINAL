package Main;

import Calculadora.frmCalculadora;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crea una instancia de la frmCalculadora y hazla visible
                frmCalculadora calculadora = new frmCalculadora();
                calculadora.setVisible(true);
            }
        });
    }
}
