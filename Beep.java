package beep;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class Beep {
    public static void main(String[] args)
    {
        Clock clock = new Clock();
        clock.start(10000, true);

        JOptionPane.showMessageDialog(null, "Exit?");
        System.exit(0);
    }
}

class Clock {
    public void start(int interval, final boolean beep)
    {
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent event)
            {
                System.out.println("Last beep at " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer timer = new Timer(interval, listener);
        timer.start();
    }
}
