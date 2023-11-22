
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class prime {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = num.nextInt();
    do{
        if(num1%2==1){
        System.out.print(num1 + " is a prime number.");
        break;
        }else if(num1%2==0) {
            System.out.print(num1 + " is not a prime number.");
        }
        break;
    }while(true);
    }
}
