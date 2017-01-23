
package clases;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class conexionFondos extends javax.swing.JPanel{
    
    public conexionFondos(){
        this.setSize(400,200);
    }
    
//    public void PaintMenu(Graphics g){
//        
//        Dimension tamanio = Toolkit.getDefaultToolkit().getScreenSize();
//         this.setSize((int)(tamanio.getWidth()) , (int)(tamanio.getHeight()));
//        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("imgfondos/Menu"));        
//        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
//        setOpaque(false);
//        super.paintComponent(g);
//    }
    
     public void PaintLogin(Graphics g){
        
        Dimension tamanio = Toolkit.getDefaultToolkit().getScreenSize();
         this.setSize((int)(tamanio.getWidth()) , (int)(tamanio.getHeight()));
        ImageIcon fondo = new ImageIcon(getClass().getResource("/imgfondos/Login.jpg"));        
        g.drawImage(fondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
        setOpaque(false);
        super.paintComponent(g);
    }      
}

