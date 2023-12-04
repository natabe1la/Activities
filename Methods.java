/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bonilla_CPE
 */
public class Methods {
    
    public static void main(String[]args){
  
        int factorial = FactorialofNumber(7);
        System.out.println(factorial);

}
    
    static int FactorialofNumber(int expo){
   int ans=1;
    for(int i= 1; i <= expo; i++){
        ans=i*ans;
    
    }
return ans;
}
}

