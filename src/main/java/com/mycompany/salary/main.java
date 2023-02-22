/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salary;

/**
 *
 * @author alexc
 */
import java.util.Scanner;
public class main {
  
   public int salary [] = new int[9];
   
    public void calculateSalary(int sales )
    {
        int tempSalary = (int) (200+(sales*.09));
        System.out.println(tempSalary);
       
        if (tempSalary >= 200 && tempSalary <=299)
            salary[0] = salary[0] + 1;
        else if (tempSalary >= 300 && tempSalary <= 399)
            salary[1] = salary[1] + 1;
        else if (tempSalary >= 400 && tempSalary <= 499)
            salary[1] = salary[2] + 1;
        else if (tempSalary >= 500 && tempSalary <= 599)
            salary[1] = salary[3] + 1;
        else if (tempSalary >= 600 && tempSalary <= 699)
            salary[1] = salary[4] + 1;
        else if (tempSalary >= 700 && tempSalary <= 799)
            salary[1] = salary[5] + 1;
        else if (tempSalary >= 800 && tempSalary <= 899)
            salary[1] = salary[6] + 1;
        else if (tempSalary >= 900 && tempSalary <= 999)
            salary[1] = salary[7] + 1;
        else if (tempSalary >= 1000)
            salary[1] = salary[8] + 1;      
   }
   
   
    public void inputSalary()
    {
        int sales;
       
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the sales for Salesperson (enter -1 to quit ");
        sales=input.nextInt();
       
        while (sales != -1 )
        {
            calculateSalary(sales);
           System.out.println("Please enter the sales for Salesperson (enter -1 to quit ");
             sales=input.nextInt();
    }
        displaySales();
       
    }    
   
   
    public void displaySales()
    {
        for ( int counter = 0; counter < salary.length; counter++)
        {
            if (counter == 8)
                System.out.println("Sales is over $1000");
            else
               System.out.printf("4%3d=%3d",(200+(counter*100)), (200+ (counter*100 +99)));
            System.out.println(salary[counter]);
           
            System.out.println();
        }
    }
}  

