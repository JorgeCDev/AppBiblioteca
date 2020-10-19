package recursos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MaterialTxtField extends JTextField implements FocusListener {
    private Color lightTone= new Color(0, 176, 255);
    private String textBox;
    private int line,lineTwo,x1,y1,fuente, xFuente,yFuente;


    public MaterialTxtField(String text) {
        textBox = text;
        creaConfiguraciones();
    }

    public void creaConfiguraciones(){

        setPreferredSize(new Dimension(600,40));
        setBorder(BorderFactory.createEmptyBorder());
        setForeground(Color.lightGray);
        setFont(new Font("Helvetica",Font.PLAIN,12));
        addFocusListener(this);
        xFuente=10;
        yFuente=22;
        fuente=14;
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setColor(Color.LIGHT_GRAY);

        g2.setStroke(new BasicStroke(2));
        g2.drawLine(0,getHeight()-1,getWidth(),getHeight()-1);

            g2.setColor(getLightTone());
            g2.drawLine(x1, y1, line, y1);
            g2.drawLine(x1, y1, lineTwo, y1);

            if (isFocusOwner())
                g2.setColor(getLightTone());
            else
                g2.setColor(Color.LIGHT_GRAY);

            g2.setFont(new Font("Helvetica", Font.ITALIC+Font.BOLD,fuente));
            g2.drawString(getTextBox(), xFuente, yFuente);


    }

    public Color getLightTone() {
        return lightTone;
    }

    public void setLightTone(Color lightTone) {
        this.lightTone = lightTone;
    }

    public String getTextBox() {
        return textBox;
    }

    public void setTextBox(String textBox) {
        this.textBox = textBox;
    }

    private Timer temporizador =new Timer(getX()>300?250:10,
            new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(isFocusOwner()){
                line +=15;
                lineTwo-=15;
            }else {
                line -=15;
                lineTwo+=15;

            }

            repaint();
            if(line >= getWidth()&&isFocusOwner())
            {
                temporizador.stop();//detiene el temporizador

            }
            else if (line<=getWidth()/2&&!isFocusOwner())
            {

                temporizador.stop();
                x1=getHeight();
                y1=x1;
                line=x1;
                lineTwo=x1;

            }
        }
    });

    private Timer tempoFuente =new Timer(25,
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {


                    if (yFuente>=22&!isFocusOwner()){

                        tempoFuente.stop();
                        yFuente=22;
                        fuente=14;


                    }else if(yFuente<=12&isFocusOwner()){

                        tempoFuente.stop();
                        yFuente=12;
                        fuente=9;

                    }

                    if(isFocusOwner()) {
                        yFuente -= 4;
                        fuente -= 1;
                    }else if (!isFocusOwner()&getText().equals("")){
                        yFuente+=4;
                        fuente+=1;
                    }
                    repaint();



                }
            });

    @Override
    public void focusGained(FocusEvent e) {
        x1=getWidth()/2;
        y1=getHeight()-1;
        line=getWidth()/2;
        lineTwo=getWidth()/2;
        temporizador.start();
        tempoFuente.start();
        setFont(new Font("Helvetica",Font.PLAIN,11));
        setForeground(Color.BLACK);
;


    }

    @Override
    public void focusLost(FocusEvent e) {
        temporizador.start();
        tempoFuente.start();
        setForeground(Color.lightGray);



    }





}
