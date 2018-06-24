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
                System.out.println("Next beep at " + new Date());
                Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer timer = new Time(10000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Exit?");
        System.exit(0);
    }
}
