package Utilerias;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
/**
 * Clase que se utiliza para colocar un fondo de imagen en un JDesktopPane
 * @author kev4142
 */
public class Ecritorio extends JDesktopPane{
 
       private  Image IMG=new ImageIcon(getClass().getResource("/Vistax/Imagenes/fondo.jpg")).getImage();
 
        public void paintChildren(Graphics g){
            g.drawImage(IMG, 0, 0, getWidth(), getHeight(), this);
            super.paintChildren(g);
        }
    }