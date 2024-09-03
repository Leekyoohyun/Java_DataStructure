package test;

import javax.swing.*;
import java.time.LocalTime;

public class Clock {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        JOptionPane.showMessageDialog(null, LocalTime.now());
    }
}
