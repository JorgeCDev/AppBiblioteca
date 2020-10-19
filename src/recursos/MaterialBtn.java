package recursos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Boton con animacción estilo "Material Design" como propuesta de mejora
 * y reutilización del codigo
 * @Autor: Jorge Cañas
 */
public class MaterialBtn extends JButton implements MouseListener {

    private Point punto;//punto
    private int radio;//radio de los circulos
    private Color midTone= new Color(0, 176, 255);//colores medios
    private  Color lightTone=new Color(105, 226, 255);//realces
    //fuente personalizada
    private final Font fuenteB= new Font("Helvetica",Font.BOLD,13);

    //Constructor vacio
    public MaterialBtn()
    {
        creaBoton();
    }

    //Constructor con titulo
    public MaterialBtn(String title)
    {
        super(title);
        creaBoton();
    }

    //constructor con colores primario y luz
    public MaterialBtn(String text, Color midTone, Color lightTone) {
        super(text);
        this.midTone = midTone;
        this.lightTone = lightTone;
        creaBoton();
    }

    //Metodo que configura el boton
    public void creaBoton()
    {
        setBackground(midTone);
        setFont(fuenteB);
        setBorderPainted(false);
        setFocusPainted(false);
        setMaximumSize(new Dimension(200,30));
        setDoubleBuffered(true);
        radio =0;
        punto =new Point(0,0);
        addMouseListener(this);
    }

    //Metodo que crea las ondas de agua
    public void ripple(Graphics g)
    {
        Graphics2D g2d= (Graphics2D) g.create();

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(new Color(lightTone.getRed(), lightTone.getGreen(),
                lightTone.getBlue(),147));

        g2d.fillOval(punto.x - radio, punto.y - radio,
                2 * radio, 2 * radio);



            repaint();
            validate();

    }
    //Sobrescribe el metodo paint component para dibujar el efecto
    @Override
    protected void paintComponent(Graphics g)
    {

        super.paintComponent(g);

            ripple(g);//se llama el metodo de "ondas"

    }
    //Getters Setters
    public Color getMidTone() {
        return midTone;
    }

    public void setMidTone(Color midTone) {
        this.midTone = midTone;
    }

    public Color getLightTone() {
        return lightTone;
    }

    public void setLightTone(Color lightTone) {
        this.lightTone = lightTone;
    }

    public Font getFuenteB() {
        return fuenteB;
    }
    
    

    //Temporizador y metodo action performed

    private Timer temporizador =new Timer(15, new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            radio +=8;//se aumenta en 15 cada que entra  al metodo

            if(radio >= getWidth())//cuando es igual o mayor que el radio
            {
                radio =0;//desaparece la onda
                temporizador.stop();//detiene el temporizador
            }
        }
    });



    @Override
    public void mouseClicked(MouseEvent e)
    {

        punto =e.getPoint();//obtiene el punto
        radio=20;//empieza el radio en 20
        temporizador.start();//empieza el "ciclo"


    }

    @Override
    public void mousePressed(MouseEvent e)
    {

    }

    @Override
    public void mouseReleased(MouseEvent e)
    {

    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e)
    {

    }
}
