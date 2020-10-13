package recursos;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class FiltraComboBox extends JComboBox {

    /**
     * Entries to the combobox list.
     */
    private List<String> entradas;

    public List<String> getEntradas()
    {
        return entradas;
    }

    public FiltraComboBox(List<String> entradas)
    {
        super(entradas.toArray());
        this.entradas = entradas  ;
        this.setEditable(true);

        final JTextField textfield =
                (JTextField) this.getEditor().getEditorComponent();

        /**
         * Listen for key presses.
         */
        textfield.addKeyListener(new KeyAdapter()
        {
            public void keyReleased(KeyEvent ke)
            {
                SwingUtilities.invokeLater(new Runnable()
                {
                    public void run()
                    {
                        /**
                         * On key press filter the list.
                         * If there is "text" entered in text field of this combo use that "text" for filtering.
                         */
                        comboFilter(textfield.getText());
                    }
                });
            }
        });

    }

    /**
     * Build a list of entries that match the given filter.
     */
    public void comboFilter(String texto)
    {
        List<String> listaFiltrada = new ArrayList<String>();

        for (String entrada : getEntradas())
        {
            if (entrada.toLowerCase().contains(texto.toLowerCase()))
            {
                listaFiltrada.add(entrada);
            }
        }

        if (listaFiltrada.size() > 0)
        {
            this.setModel(
                    new DefaultComboBoxModel(
                            listaFiltrada.toArray()));
            this.setSelectedItem(texto);
            this.showPopup();
        }
        else
        {
            this.hidePopup();
        }
    }
}
