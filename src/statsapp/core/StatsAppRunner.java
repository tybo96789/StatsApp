package statsapp.core;

import statsapp.foundation.AbstractFrame;
import statsapp.foundation.FrameConstants;

/**
 *
 * @author Tyler_Atiburcio
 */
public class StatsAppRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new StatsAppCore().setVisible(true);
//        Test testing = new Test();
//        FrameConstants.setFrameOperation(testing, FrameConstants.NORMAL_OPERATION);
//        testing.start();
       
    }
    
    private static class Test extends AbstractFrame{

        public Test() {
            super("Test",500,500);
        }

        @Override
        protected void build() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
