import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
import javax.swing.JOptionPane;

public class MorningRushTester
{
    private static final int DELAY = 1000;

    public MorningRushTester()
    {
        
    }

    public static void main(String[] args)
    {  
        class DrinkCoffee implements ActionListener
        {
            private int gulps;
            
            public DrinkCoffee(int inGulps)
            {
                gulps = inGulps;
            }
            
            public int gulps()
            {
                return gulps;
            }

            @Override
            public void actionPerformed(ActionEvent event)
            {
                if (gulps > 0)
                {
                    System.out.println(gulps);
                    --gulps;
                }
                
                if (gulps == 0)
                {
                    System.out.println("Go to school");
                    JOptionPane.showMessageDialog(null, "Make another?");
                    gulps = initialGulps;
                }
                --gulps;
            }
        }
        final int intitalGulps = 5;
        
        
        DrinkCoffee dc = new DrinkCoffee(initialGulps);
        Timer t = new Timer(DELAY, dc);
        t.start();
        
        JOptionPane.showMessageDialog(null, "Make another?");
        System.exit(0);
    }
}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
import javax.swing.JOptionPane;

public class MorningRushTester
{
    private static final int DELAY = 1000;

    public MorningRushTester()
    {
        
    }

    public static void main(String[] args)
    {  
        
        final int intitalGulps = 15;

        
        class DrinkCoffee implements ActionListener
        {
            private int gulps;
            
            public DrinkCoffee(int inGulps)
            {
                gulps = inGulps;
            }
            
            public int gulps()
            {
                return gulps;
            }

            @Override
            public void actionPerformed(ActionEvent event)
            {
                if (gulps > 0)
                {
                    System.out.println(gulps);
                    --gulps;
                }
                
                if (gulps == 0)
                {
                    System.out.println("Go to school");
                    JOptionPane.showMessageDialog(null, "Make another?");
                    gulps = initialGulps;
                }
                --gulps;
            }
        }        
        
        DrinkCoffee dc = new DrinkCoffee(initialGulps);
        Timer t = new Timer(DELAY, dc);
        t.start();
        
        JOptionPane.showMessageDialog(null, "Make another?");
        System.exit(0);
    }
}