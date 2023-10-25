/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newfolder;


import javax.swing.JOptionPane;

public class Newfolder {

    public static void main(String[] args) {
        
       String first=JOptionPane.showInputDialog("Performing Mathematical Operations. \nSelect an Operation: \nAddition \nSubtraction \nMultiplication \nDivision.");
       String second=JOptionPane.showInputDialog("Enter first number: ");
       String third=JOptionPane.showInputDialog("Enter second number: ");
       
       if(first.equals("Addition")){
          int num1=Integer.parseInt(second);
          int num2=Integer.parseInt(third);
          int ans=num1+num2;
          
         
          JOptionPane.showMessageDialog(null, ans);
          
          
       }else if(first.equals("Subtraction")){
          int num1=Integer.parseInt(second);
          int num2=Integer.parseInt(third);
          int ans=num1-num2;
          
         
          JOptionPane.showMessageDialog(null, ans);
          
       }else if(first.equals("Multiplication")){
          int num1=Integer.parseInt(second);
          int num2=Integer.parseInt(third);
          int ans=num1*num2;
          
         
          JOptionPane.showMessageDialog(null, ans);
          
       }else if(first.equals("Division")){
          int num1=Integer.parseInt(second);
          int num2=Integer.parseInt(third);
          int ans=num1/num2;
          
         
          JOptionPane.showMessageDialog(null, ans);
          
       }
    }

    
}
