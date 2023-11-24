
import java.util.Scanner;


public class mathcds {
    public static void main(String[] args){
        
        do{
        System.out.println ("Welcome user! \nIn this program you solve mathematical problems with specific topics: ");
        System.out.println ("1.Trigonometry  " + "2.Multiplication table(1 to 10)  " + "3.Time  " + "4.Calculation of Polygon Surface Area  " + "5.The Four Basic Operations");
        System.out.print("To use this program, select the corresponding number of the math topic: ");
        Scanner math = new Scanner(System.in);
        int choice = math.nextInt();
        
            switch (choice) {
                case 1:
                    while (true) {
                        while (true) {
                            System.out.println(" ");
                            System.out.println("You chose to perform a mathematical problem in Trigonometry");
                            System.out.println("In this program you can select between the following: ");
                            System.out.println("1. Solve for Sin " + "2.Solve for Cos " + "3.Solve for Tan");
                            System.out.print("Select a number: ");
                            int trg = math.nextInt();

                            if (trg == 1) {
                                System.out.println(" ");
                                System.out.print("Enter first number(Opposite): ");
                                int o = math.nextInt();
                                System.out.print("Enter second number(Hypotenuse): ");
                                int h = math.nextInt();

                                double sin = (o / h);
                                System.out.println("Sine theta is " + sin);
                                break;

                            } else if (trg == 2) {
                                System.out.println(" ");
                                System.out.print("Enter first number(Adjacent): ");
                                int a = math.nextInt();
                                System.out.print("Enter second number(Hypotenuse): ");
                                int H = math.nextInt();

                                double cos = (a / H);
                                System.out.println("Cosine theta is " + cos);
                                break;

                            } else if (trg == 3) {
                                System.out.println(" ");
                                System.out.print("Enter first number(Opposite): ");
                                int O = math.nextInt();
                                System.out.print("Enter second number(Adjacent): ");
                                int A = math.nextInt();

                                double sin = (O / A);
                                System.out.println(" ");
                                System.out.println("Tangent theta is " + sin);
                                break;
                            } else {
                                System.out.println("Invalid number. Please select again.");
                                System.out.println(" ");

                            }
                        }
                        System.out.println("Do you want to use this again? \nPress 0=No Press 1=Yes");
                        int x = math.nextInt();
                        if (x == 1) {
                        } else {
                            break;
                        }
                    }break;

                case 2:
                    while (true) {
                        System.out.println(" ");
                        System.out.println("You chose to perform the Multiplication Table(1 to 10");
                        System.out.println("In this program, you will give a number x and it will give you the multiplication from 1 to 10 ");
                        System.out.println("For example if you'll type the number 2 then the output will be \n2 x 1=2\n2 x 2=4\nand so on until the 10th number");

                        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                        System.out.print("Enter a number: ");
                        int v = math.nextInt();

                        for (int i = 0; i < A.length; i++) {
                            String table = v + " x " + A[i] + " = " + v * A[i] + "\n";
                            System.out.print(table);
                        }
                        System.out.print("Do you want to perform this activity again?");
                        System.out.print("Press 0=No  Press 1=Yes");
                        System.out.print("");
                        int p = math.nextInt();

                        if (p == 1) {
                        } else {
                            break;
                        }
                    }break;

                case 3:
                    while (true) {
                        while (true) {
                            System.out.println("");
                            System.out.println("You chose Time");
                            System.out.println("In this program you can do the following:");
                            System.out.println("1. Convert Minutes to Seconds");
                            System.out.println("2. Convert Seconds to Minutes");
                            System.out.println("3. Convert Hours to Seconds");
                            System.out.println("4. Convert Hours to Minutes");
                            System.out.println("5. Convert Hours to Days");
                            System.out.println("6. Convert Days to Seconds");
                            System.out.println("7. Convert Days to Minutes");
                            System.out.println("8. Convert Days to Hours");
                            System.out.println("Select a number: ");
                            int q = math.nextInt();
                            System.out.println("");

                            if (q == 1) {
                                System.out.print("Enter a number: ");
                                int e = math.nextInt();
                                int ans = e * 60;
                                System.out.println(e + " minutes is " + ans + " seconds");
                                break;
                            } else if (q == 2) {
                                System.out.print("Enter a number: ");
                                int e = math.nextInt();
                                int ans = e / 60;
                                System.out.println(e + " seconds is " + ans + " minutes");
                                break;
                            } else if (q == 3) {
                                System.out.print("Enter a number: ");
                                int e = math.nextInt();
                                int ans = e * 3600;
                                System.out.println(e + " hours is " + ans + " seconds");
                                break;
                            } else if (q == 4) {
                                System.out.print("Enter a number: ");
                                int e = math.nextInt();
                                int ans = e * 60;
                                System.out.println(e + " hours is " + ans + " minutes");
                                break;
                            } else if (q == 5) {
                                System.out.print("Enter a number: ");
                                int e = math.nextInt();
                                double ans = e * 0.0417;
                                System.out.println(e + " hours is " + ans + " days");
                                break;
                            } else if (q == 6) {
                                System.out.print("Enter a number: ");
                                int e = math.nextInt();
                                int ans = e * 86400;
                                System.out.println(e + " days is " + ans + " seconds");
                                break;
                            } else if (q == 7) {
                                System.out.print("Enter a number: ");
                                int e = math.nextInt();
                                int ans = e * 1440;
                                System.out.println(e + " days is " + ans + " minutes");
                                break;
                            } else if (q == 8) {
                                System.out.print("Enter a number: ");
                                int e = math.nextInt();
                                int ans = e * 24;
                                System.out.println(e + " days is " + ans + " hours");
                                break;
                            } else if (q > 8) {
                                System.out.print("INVALID!! Enter a number again.");
                                System.out.print(" ");

                            }
                        }
                        System.out.println("Do you want to use this program again? \nPress 0=No  Press 1=Yes");
                        System.out.println("");
                        int yn = math.nextInt();

                        if (yn == 1) {
                        } else {
                            break;
                        }
                    }break;
                case 4:
                    while (true) {
                        while (true) {
                            System.out.println("");
                            System.out.println("You chose Calculation of Polygon Surface Area");
                            System.out.println("Here are the following polygons: ");
                            System.out.println("1.Triangle   "
                                    + "2.Rectangle   "
                                    + "3.Square   "
                                    + "4.Parallelogram   ");
                            System.out.print("Select a polygon: ");
                            int f = 2;
                            int p = math.nextInt();

                            if (p == 1) {
                                System.out.print("Enter base: ");
                                int w = math.nextInt();
                                System.out.print("Enter height: ");
                                int h = math.nextInt();
                                System.out.println("The area of the Triagle is " + (w * h) / f);
                                break;
                            } else if (p == 2) {
                                System.out.print("Enter width: ");
                                int w = math.nextInt();
                                System.out.print("Enter length: ");
                                int h = math.nextInt();
                                System.out.println("The area of Rectangle is " + (w * h));
                                break;
                            } else if (p == 3) {
                                System.out.print("legth: ");
                                int w = math.nextInt();
                                System.out.println("The area of the sqaure is " + (w * w));
                                break;
                            } else if (p == 4) {
                                System.out.print("Enter base: ");
                                int w = math.nextInt();
                                System.out.print("Enter height: ");
                                int h = math.nextInt();
                                System.out.println("The area of the Parallelogram is " + (w * h));
                                break;
                            } else {
                                System.out.println("Cannot perform. Enter number again");
                            }
                        }
                        System.out.println("Do you want to use this program again? \nPress 0=No  Press 1=Yes");
                        System.out.println("");
                        int r = math.nextInt();

                        if (r == 1) {
                        } else {
                            break;
                        }
                    }break;
                case 5:
                while(true){
                    System.out.println("");
                    System.out.println("You chose Calculating using the Four Basic Operations");
                    System.out.println("You can choose between the following:");
                    System.out.println("1. Addition \n2.Subtraction \n3.Multiplication \n.4.Division");
                    int g=math.nextInt();
                    
                    if (g == 1) {
                        System.out.println("Enter 1st Digit: ");
                        int b = math.nextInt();
                        System.out.println("Enter 2nd Digit: ");
                        int c = math.nextInt();
                        int ans = b + c;

                        System.out.println("The answer is " + ans);
                        break;
                    } else if (g == 2) {
                        System.out.println("Enter 1st Digit: ");
                        int b = math.nextInt();
                        System.out.println("Enter 2nd Digit: ");
                        int c = math.nextInt();
                        int ans = b - c;

                        System.out.println("The answer is " + ans);
                        break;
                    } else if (g == 3) {
                        System.out.println("Enter 1st Digit: ");
                        int b = math.nextInt();
                        System.out.println("Enter 2nd Digit: ");
                        int c = math.nextInt();
                        int ans = b * c;

                        System.out.println("The answer is " + ans);
                        break;
                    } else if (g == 4) {
                        System.out.println("Enter 1st Digit: ");
                        int b = math.nextInt();
                        System.out.println("Enter 2nd Digit: ");
                        int c = math.nextInt();

                        if (c == 0) {
                            System.out.println("ERROR. Procedure cannot be done");
                        }

                        int ans = b / c;
                        System.out.println("The answer is " + ans);
                        break;
             }
                    System.out.println("Do you want to use this program again? \nPress 0=No  Press 1=Yes");
                        System.out.println("");
                        int o = math.nextInt();
                        if (o == 1) {
                        } else {
                            break;
                        }
                    }break;
        }      
                         System.out.println("Do you want to perform another activity? \nPress 0=No  Press 1=Yes");
                         System.out.println("");
                         int z=math.nextInt();
                         
                         if(z==0){
                             System.out.println("Thank you for using this program. Have a great day:)");
                             break;
                         }else{}
        }while(true);
    }
}
