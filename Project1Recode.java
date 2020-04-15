/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1recode;

import java.util.Scanner;

/**
 *
 * @author Warren
 */
public class Project1Recode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scnr = new Scanner(System.in);
    
    int salary = scnr.nextInt();
    double savingsRate = scnr.nextDouble();
    double interestRate = scnr.nextDouble();
    int yearsOfEmployment = scnr.nextInt();
    
    double retirementSavings = (salary * savingsRate * (1 + interestRate) * yearsOfEmployment);
    
    System.out.println("Retirement Savings: " + retirementSavings);
    
    
    
    
    
    }
    
}
