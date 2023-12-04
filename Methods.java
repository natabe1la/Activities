public class Methods {
    
    public static void main(String[]args){
  
        int factorial = FactorialofNumber(7);
        System.out.println(factorial);
           
        double Slope=Slope(4.3, 2.0, 3.1, 1.9);
        System.out.println(Slope);
        
        PrinttheName();
}
    
    static int FactorialofNumber(int expo){
   int ans=1;
    for(int i= 1; i <= expo; i++){
        ans=i*ans;

    }
return ans;
}
    
    static double Slope( double y2, double y1, double x2, double x1){
    return (y2-y1)/(x2-x1);   
    }
    
    static void PrinttheName(){
        for (int i = 0; i < 10; i++) {
        System.out.println("Name");   
        }
    }
}


