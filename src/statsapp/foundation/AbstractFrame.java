package statsapp.foundation;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
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
    
    //Possible useful stuff
    protected Dimension dim;
    protected AbstractFrame INSTANCE = this;
    protected ArrayList<Container> arrayList = new ArrayList<Container>();
    
    //JMenu Bar
    protected JMenuBar menuBar;
    protected JMenu menu;

    public AbstractFrame(String TITLE, int HEIGHT, int WIDTH) {
        this.TITLE = TITLE;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
        this.setSize(WIDTH, HEIGHT);
        this.dim = Toolkit.getDefaultToolkit().getScreenSize();
    }
    
    public void start()
    {
        this.build();
        this.setVisible(true);
    }
    
    protected abstract void build();
    
    
    
    
    
    

}
