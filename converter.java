
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BONILLA_CPE
 */
public class converter {
    
      public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Nat's temperature converter. Choose what you want to convert: ");
        System.out.println( "1.C to F  "
                + "2.F to C  "
                + "3.K to F  "
                + "4.K to C  "
                + "5.C to K  "
                + "6.F to K  ");
        System.out.println("Choose a conversion: ");
        int a= input.nextInt();
        
        if (a==1){
            System.out.println("Enter temperature: ");
            double b = input.nextInt();
            System.out.println ("It is now " + ((b*9/5)+32) + " Fahrenheit ");
        } else if (a==2){
            System.out.println("Enter temperature: ");
            double b = input.nextInt();
            System.out.println ("It is now " + ((b-32)*5/9) + " Celcius ");
        } else if (a==3){
            System.out.println("Enter temperature: ");
            double b = input.nextInt();
            System.out.println ("It is now " + (((b-273.15)*1.8)+32) + " Fahrenheit ");
        } else if (a==4) {
            System.out.println("Enter temperature: ");
            double b = input.nextInt();
            System.out.println ("It is now " + (b-273.15) + "Celcius ");
        } else if (a==5){
            System.out.println("Enter temperature: ");
            double b = input.nextInt();
            System.out.println ("It is now " + (b+273.15) + " Kelvin ");
        } else if (a==6) {
            System.out.println("Enter temperature: ");
            double b = input.nextInt();
            System.out.println ("It is now " + (((b-32)*5/9)+273.15) + " Kelvin ");
        } else{
            System.out.println("Cannot perform");
        }
    }
    }

  

    
       

        
        
    
    


        
       
    

