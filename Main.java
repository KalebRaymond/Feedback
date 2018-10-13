package com.company;


import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws InterruptedException,
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
                //JFrame frame = strings.length == 0 ? new Spectrogram(null) : new Spectrogram(strings[0]) ;
                JFrame frame;
                Scanner s = new Scanner(System.in);
                System.out.println("(m)ic or (f)ile input?");
                switch (s.nextLine().toLowerCase()) {
                    case "f":
                        System.out.println("Enter filepath of mp3: ");
                        String filepath = s.nextLine();
                        frame = new Spectrogram(filepath);
                        break;
                    case "m":
                    default:
                        frame = new Spectrogram(null);
                        break;
                }

                frame.pack();
                frame.setSize(640, 480);
                frame.setVisible(true);
                ((Spectrogram) frame).export(0);
            }


        });
    }


}
