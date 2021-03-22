/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namereverse;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class NameReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       
       
       
       
       System.out.println("Enter your first name: ");
       String first = scnr.next();
       
       System.out.println("Enter your middle name: ");
       String middle = scnr.next();
       
       System.out.println("Enter your last name: ");
       String last = scnr.next();
       
       String name = first + " " + middle + " " + last;
       
       
       for (int i = name.length() - 1; i >= 0; i--) {
       System.out.print(name.charAt(i));
       }
       
       for (int i = 0; i < name.length(); i++) {
           System.out.print(name.charAt(i));
       }
       
       
       /*for(int i = 0; i < name.length(); i++)
       {
           System.out.println(name.charAt(i));
       }
       // System.out.println();
        
        for(int i = name.length() - 1; i >= 0; i--)
        {
            System.out.println(name.charAt(i));
        }
        /*
        Create a new Java application called NameReverse to prompt the user to enter their full name.  
        Use a for loop to output to mirror their full name in reverse on one line.
        For example, if the user enters their name as John Doe, the program should output eoD nhoJ.
        */
    }
    
}
