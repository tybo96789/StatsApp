/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statsapp.core;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import statsapp.core.basics.CalculateStats;
import statsapp.foundation.AbstractFrame;
import statsapp.foundation.FrameConstants;

/**
 *
 * @author Tyler Atiburcio
 */
public class StatsAppCore extends AbstractFrame{
    
    protected JTabbedPane mainPane;
    
    protected StatsAppCore INSTANCE = this;
    
    //Basic Panel
    protected JPanel basicPanel;
    protected JScrollPane inputPane;
    protected JTextArea inputArea;
    protected JPanel infoCalPanel;
    protected JScrollPane infoScroll;
    protected JTextArea outputArea;
    protected JPanel calPanel;
    protected JButton clearInput;
    protected JButton calculateButton;
    

    public StatsAppCore() {
        super("Stats Calculator", 500,500);
        this.INSTANCE = this;
        FrameConstants.setFrameOperation(this, FrameConstants.NORMAL_OPERATION);
        this.start();
    }

    @Override
    protected void build() {
        this.setLayout(new GridLayout(1,1));
        this.mainPane = new JTabbedPane();
        this.mainPane.setTabPlacement(JTabbedPane.BOTTOM);
        this.add(this.mainPane);
        
        
        //Basic Calculations
        this.basicPanel = new JPanel();
        this.basicPanel.setLayout(new GridLayout(1,2));
        this.mainPane.addTab("Basic Calculations", this.basicPanel);
        
        this.inputArea = new JTextArea();
        this.inputPane = new JScrollPane(this.inputArea);
        this.basicPanel.add(this.inputPane);
        
        this.infoCalPanel= new JPanel();
        this.infoCalPanel.setLayout(new GridLayout(2,1));
        this.basicPanel.add(this.infoCalPanel);
        

        this.outputArea = new JTextArea();
        this.outputArea.setEditable(false);
        this.infoScroll = new JScrollPane(this.outputArea);
        this.infoCalPanel.add(this.infoScroll);
        
        this.calPanel = new JPanel();
        this.calPanel.setLayout(new GridLayout(2,1));
        this.infoCalPanel.add(this.calPanel);
        
        this.clearInput = new JButton("Clear");
        this.calPanel.add(this.clearInput);
        this.clearInput.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                INSTANCE.inputArea.setText("");
            }
        });
        
        this.calculateButton = new JButton("Calculate");
        this.calculateButton.addActionListener(new CalculateStats(this.inputArea,this.outputArea));
        this.calPanel.add(this.calculateButton);
        
        
        
        
        
        this.mainPane.addTab("Somethin", null);
    }
    
}
