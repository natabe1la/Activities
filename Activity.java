/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;

import java.util.Scanner;

/**
 *
 * @author Bonilla_CPE
 */
public class Activity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println(" Choose Operator: "
                + "1. Addition "
                + "2. Subtraction "
                + "3. Multiplication "
                + "4. Division " );
        int a = input.nextInt();
        
        if (a==1){
            System.out.println("Enter 1st Digit: ");
            int b = input.nextInt();
            System.out.println("Enter 2nd Digit: ");
            int c = input.nextInt();
            int ans=b+c;
                    
                    System.out.println("The answer is " + ans);
        } else if (a==2){
            System.out.println("Enter 1st Digit: ");
            int b = input.nextInt();
            System.out.println("Enter 2nd Digit: ");
            int c = input.nextInt();
            int ans=b-c;
                    
                    System.out.println("The answer is " + ans);
        }else if (a==3){
            System.out.println("Enter 1st Digit: ");
            int b = input.nextInt();
            System.out.println("Enter 2nd Digit: ");
            int c = input.nextInt();
            int ans=b*c;
                    
                    System.out.println("The answer is " + ans);
    }else if (a==4){
            System.out.println("Enter 1st Digit: ");
            int b = input.nextInt();
            System.out.println("Enter 2nd Digit: ");
            int c = input.nextInt();
            
            if (c==0)
                System.out.println("ERROR. Procedure cannot be done");
            
            int ans=b/c;
                    
                    System.out.println("The answer is " + ans);
        // TODO code application logic here
    }
    }
}
