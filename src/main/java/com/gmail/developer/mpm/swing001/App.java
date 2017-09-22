package com.gmail.developer.mpm.swing001;

import javax.swing.JOptionPane;

/**
 * Simple app that adds two numbers
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String firstNumber = JOptionPane.showInputDialog("Enter first integer: ");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer:");
        
        int a = Integer.parseInt(firstNumber);
        int b = Integer.parseInt(secondNumber);
        
        int c = a + b;
        
        JOptionPane.showMessageDialog(null, "The sume is: " + c, "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
}
