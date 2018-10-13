package com.company;


import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(final String... strings) throws InterruptedException,
            InvocationTargetException {
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager
                            .getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    // ignore failure to set default look en feel;
                }
                JFrame frame = strings.length == 0 ? new Spectrogram(null) : new Spectrogram(strings[0]) ;
                frame.pack();
                frame.setSize(640, 480);
                frame.setVisible(true);
            }
        });
    }
}
