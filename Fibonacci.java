import java.util.Scanner;

public class Fibonacci{
    public static void main(String []args){
    int i=1, frst=0, nd=1;
    System.out.print("How many numbers would you like to have in the sequence: ");
    Scanner n = new Scanner(System.in);
    int num =n.nextInt();
    
    while(i <= num){
        System.out.print(frst + " ");
        
        int sum = frst+nd;
        frst=nd;
        nd=sum;
        i++;
    }
   
    }
}
