package recursos;


import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Jorge
 */

public class FiltraComboBox extends JComboBox implements KeyListener {

  
    private List<String> entradas;
    private final JTextField textfield;
    public List<String> getEntradas()
    {
    
        return entradas;
    }

    public FiltraComboBox(List<String> entradas)
    {
        super(entradas.toArray());
        this.entradas = entradas  ;
        this.setEditable(true);
        this.setSelectedIndex(-1);
        textfield =(JTextField) this.getEditor().getEditorComponent();
        textfield.addKeyListener(this);
    }

  
    public void comboFilter(String texto)
    {
        List<String> listaFiltrada = new ArrayList<String>();
        
            
        for (String entrada : getEntradas())
        {
            if(!Objects.isNull(entrada))
            {
                 if (entrada.toLowerCase().contains(texto.toLowerCase()))
                 {
                     listaFiltrada.add(entrada);
                 }
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

    @Override
    public void keyTyped(KeyEvent e) 
    {
        
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        switch (e.getKeyChar()) {
            case KeyEvent.VK_ENTER:
                this.setSelectedItem(textfield.getText());
                break;
            case KeyEvent.VK_ESCAPE:
                this.setSelectedIndex(-1);
                this.fireActionEvent();
                break;
            default:
                SwingUtilities.invokeLater(new Runnable()
                {
                    public void run()
                    {
                        
                        comboFilter(textfield.getText());
                        
                        
                    }
                });
                break;
        }

    }
}
