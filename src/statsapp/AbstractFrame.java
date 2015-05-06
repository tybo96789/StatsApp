package statsapp;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author Tyler_Atiburcio
 */
public abstract class AbstractFrame extends JFrame {
    
    //Frame
    protected final String TITLE;
    protected final int HEIGHT;
    protected final int WIDTH;
    protected final JPanel panel;
    
    //Possible useful stuff
    protected Dimension dim;
    
    //JMenu Bar
    protected JMenuBar menuBar;
    protected JMenu menu;

    public AbstractFrame(String TITLE, int HEIGHT, int WIDTH) {
        this.TITLE = TITLE;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
        this.dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.panel = new JPanel();
        this.add(this.panel);
    }
    
    public void start()
    {
        this.build();
        this.setVisible(true);
    }
    
    protected abstract void build();
    
    
    
    
    
    

}
