/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca;

import appbiblioteca.vistas.VistaBiblioteca;
import javax.swing.SwingUtilities;

/**
 *Metodo Main de la biblioteca
 * @author Jorge
 */
public class AppBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               new VistaBiblioteca().setVisible(true);
            }
        });
    }
    
}
