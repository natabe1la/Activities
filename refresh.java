
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BONILLA_CPE
 */
public class refresh{
    //one loop
    public static void main(String[] args) {
        int i = 0;
         Scanner input = new Scanner(System.in);
        while(true){
            if(i==0){
                System.out.println("");
            }else if(i==1){
                System.out.println("Thank you for using this program.");
            break;      
            }
            
        System.out.println(" ");
        System.out.println("Welcome to Nats Simple program. This program can let you do the following: ");
        System.out.println("1.Temperature Converter ");
        System.out.println("2.Odd and Even Checker ");
        System.out.println("3.Trigonometric Function of the number 3 ");
        System.out.println("4.4 polygon surface area calculations ");
        System.out.println(" ");
        System.out.print("Select your activity: ");
        int number = input.nextInt();
       
        if (number==1){
        System.out.println(" ");    
        System.out.println( "Welcome to Nat's temperature converter. Choose what you want to convert: ");
        System.out.println( "1.C to F  "
                + "2.F to C  "
                + "3.K to F  "
                + "4.K to C  "
                + "5.C to K  "
                + "6.F to K  ");
        System.out.print("Select conversion: ");        
        int x = input.nextInt();
        
        switch (x) {
            case 1:
                System.out.println("Enter temperature: ");
                float c = input.nextInt();
                System.out.println ("It is now " + ((c*9/5)+32) + " Fahrenheit ");
                break;
            case 2:
                System.out.println("Enter temperature:  ");
                float b = input.nextInt();
                System.out.println ("It is now " + ((b-32)*5/9) + " Celcius");
                break;
            case 3:
                System.out.println("Enter temperature:  ");                                    
                float a = input.nextInt();
                System.out.println ("It is now " + (((a-273.15)*1.8)+32) + " Fahrenheit ");
                break;
             case 4:
                System.out.println("Enter temperature:  ");
                float d = input.nextInt();
                System.out.println ("It is now " + (d-273.15) + "Celcius ");
                break;
            case 5:
                System.out.println("Enter temperature:  ");
                float e = input.nextInt();
                System.out.println ("It is now " + (e+273.15) + " Kelvin ");
                break;
            case 6:
                System.out.println("Enter temperature:  ");
                float f = input.nextInt();
                System.out.println ("It is now " + (((f-32)*5/9)+273.15) + " Kelvin ");
                break;
             
        }
        }else if(number==2){
           
            System.out.println(" ");
            System.out.println("Welcome to Nats Odd and Even Checker");
            System.out.print("Enter a number: ");
            int n = input.nextInt();
      
            if (n%2==0){
          System.out.println("The number is even");
             } else{
          System.out.println("The number is odd ");
        }
           
        }else if (number==3){
            System.out.println(" ");
            System.out.println("This lets you know the trogonemetric functions of the number 3");
            System.out.println("If you enter 1 then the value of Sin(3) will show ");
            System.out.println("If you enter 2 then the value of Cos(3) will show ");
            System.out.println("If you enter 3 then the value of Tan(3) will show ");
            System.out.println("Enter a number: ");
            int v = input.nextInt();
            
            
            switch(v){
            case 1:
               System.out.println(Math.sin(3)*(Math.PI/180));
               
               break;
            case 2:
               System.out.println(Math.cos(3) *(Math.PI/180));
               break;
            case 3:
                System.out.println(Math.tan(3)*(Math.PI/180));
                break;
             
            }
        }else if (number==4){
            System.out.println(" ");
            System.out.println("This program lets you know 4 polygon surface area calculations");
            System.out.println("Here are the following polygons: ");
            System.out.println("1.Triangle   "
                    + "2.Rectangle   "
                    + "3.Square   "
                    + "4.Parallelogram   ");        
            System.out.print("Select a polygon: ");     
            int f=2;
            int p = input.nextInt();
            
            if (p==1){
                System.out.print("Enter base: ");
                int w = input.nextInt();
                System.out.print("Enter height: ");
                int h = input.nextInt();
                System.out.println("The area of the Triagle is " + (w*h)/f);
            
         } else if (p==2){
                 
                System.out.print("Enter width: ");
                int w = input.nextInt();
                System.out.print("Enter length: ");
                int h = input.nextInt();
                System.out.println("The area of Rectangle is " + (w*h));
         }else if (p==3){
                System.out.print("legth: ");
                int w = input.nextInt();   
                System.out.println("The area of the sqaure is " + (w*w));
         }else if (p==4){
                System.out.print("Enter base: ");
                int w = input.nextInt();
                System.out.print("Enter height: ");
                int h = input.nextInt();
                System.out.println("The area of the Parallelogram is " + (w*h));
         }else{
             System.out.println("Cannot perform");
         }
        }else{
            System.out.println("Cannot perform ");
        }
        
        System.out.println("Do you want to perform another activity? ");
        System.out.println("0=Yes, 1=No");
            i=input.nextInt();
                  
            }
        }
    }

