package beep;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class Beep {
    public static void main(String[] args)
    {
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent event)
            {
                System.out.println("Last beep at " + new Date());
                Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer timer = new Timer(10000, listener);
        timer.start();

        JOptionPane.showMessageDialog(null, "Exit?");
        System.exit(0);
    }
}

class Clock {
    public void start(int interval, final boolean beep)
    {
        
    }
}
