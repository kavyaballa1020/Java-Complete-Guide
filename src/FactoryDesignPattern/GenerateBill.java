package FactoryDesignPattern;

import java.io.IOException;
import java.util.Scanner;

class GenerateBill{  
    public static void main(String args[])throws IOException{  
      LaptopFactory lap = new LaptopFactory();  
        
      System.out.print("Enter the name of the laptop : "); 
      
      Scanner obj=new Scanner(System.in);
     
      String lapName=obj.nextLine();  
      System.out.print("Enter the number of units : ");  
      int units=obj.nextInt();  
  
      Laptop p = lap.getLaptop(lapName);  
  
       System.out.print("Bill amount for "+lapName+" of  "+units+" units is: ");  
           p.getRate();  
           p.calculateBill(units);  
            }  
    }