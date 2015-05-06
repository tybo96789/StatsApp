/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statsapp.core.basics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Tyler
 */
public class CalculateStats  implements ActionListener{
    
    private final JTextArea inputArea;
    private final JTextArea outputArea;
    
    
    

    public CalculateStats(JTextArea inputArea, JTextArea outputArea) {
        this.inputArea = inputArea;
        this.outputArea = outputArea;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        ArrayList<Double> arrayList = new ArrayList<Double>();
        double[] sqrd;
        int n = 0;
        double avg = 0;
        double stD = 0;
        double variance = 0;
        StringTokenizer st = new StringTokenizer(this.inputArea.getText().trim(),"\t\n ,",false);
        n = st.countTokens();
        try{
        while(st.hasMoreTokens())
        {
            arrayList.add(Double.parseDouble(st.nextToken()));
        }
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for(Double d : arrayList)
            avg += d;
        avg = avg/n;
        sqrd = new double[arrayList.size()];
        for (int i = 0; i < sqrd.length; i++) {
            sqrd[i] = Math.pow(arrayList.get(i)-avg, 2);
        }
        
        for(double d: sqrd)
            stD+= d;
        stD = stD/(n -1);
        variance = stD;
        stD = Math.sqrt(stD);
        
        this.outputArea.setText("n: " + n
        + "\nAverage: " + avg
        + "\nVariance: " + variance
        + "\nStandard Deviation: " + stD);
        
    }
    
}
