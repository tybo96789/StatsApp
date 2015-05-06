/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statsapp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Tyler_Atiburcio
 */
public enum FrameConstants{
    NORMAL_OPERATION (JFrame.EXIT_ON_CLOSE),
    DISPOSE_OPERATION(JFrame.DISPOSE_ON_CLOSE);
    
    
    private final int TYPE;

    private FrameConstants(int TYPE) {
        this.TYPE = TYPE;
    }
    
    public static JFrame setFrameOperation(JFrame frame, FrameConstants frameType)
    {
        frame.setDefaultCloseOperation(frameType.TYPE);
        
        JMenuBar bar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem exit = new JMenuItem("Exit");
        frame.setJMenuBar(bar);
        bar.add(file);
        file.add(exit);
        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        //Used to center the Window to the center of the screen no matter what computer you are using
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            frame.setMaximizedBounds(null);
            frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
        return frame;
    }
    
    
}
