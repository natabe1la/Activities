import javax.swing.JOptionPane;

public class Estore {

    public static void main(String[] args) {
        //gi apply nako ang lesson ganina sir so medjo si polish nako hehe
        String[] products = {"Ballpen", "Pencil", "Eraser", "Correction Tape", "Marker"};
        int[] prices = {10, 7, 5, 15, 10};
        double ans = 0;
        JOptionPane.showMessageDialog(null, "Welcome to Nat's EStore! \nIn this store we have 5 items available.");
        JOptionPane.showMessageDialog(null, "These are the following items available: \nBallpen - P10 \nPencil - P7 "
                + "\nEraser - P5 \nCorrection Tape - P15 \nMarker - P10");
        JOptionPane.showMessageDialog(null, "We also offer discounts "
                + "\nP50-P99 worth of products: 5% \nP100-above worth of products :10%");

        do {
            // Displays the products available like ballpen, pencil, everything in String [] products
            String items = "Products: \n";
            for (int i = 0; i < products.length; i++) {
                items += (i + 1) + ". " + products[i] + " - P" + prices[i] + "\n";
            }//kani siya sir kay ang i+l diha naa kay kung wala sa 0 siya mag start ang number imbis sa 1 
            // tapos naay ". " kay para ang kalabasan niya naay dot ang number e.x. "2." kay kung wala "2Pencil" mugawas
      
            double totalAmount = 0.0;
            String selectedItems = "Selected Items:\n";

            
            do {
                String input = JOptionPane.showInputDialog(items + "Enter product number:");
                int productIndex = Integer.parseInt(input)-1;
                //kani sir naay -1 kay ang first nako is wala jud na tapos ang nigawas kay 2nd product so na bantayan nako na 0 ang sugod diay sa ihap
                String qty = JOptionPane.showInputDialog("Enter quantity for " + products[productIndex] + ":");
                int quantity = Integer.parseInt(qty);

               
                double priceamount = prices[productIndex] * quantity;
                totalAmount = totalAmount + priceamount;
                selectedItems += products[productIndex] + ": " + quantity + " - P" + priceamount + "\n";

                // Ask the user if they want to add another product
                int choice = JOptionPane.showConfirmDialog(null, "Do you want to select another product?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.NO_OPTION) {
                    break;
                } else {
                }
            } while (true);
            
            JOptionPane.showMessageDialog(null, selectedItems + "Total amount: P" + totalAmount);
            if (totalAmount >= 150) {
                double b= totalAmount *0.10;
                ans = totalAmount - b ; // applies 10% discount sa total amount
            } else if (totalAmount >= 99) {
                double b=totalAmount*0.05;
                ans = totalAmount - b; // applies 5% discount sa total amount
            } else {
                ans = totalAmount;
            }
           while (true){
            double payment = Double.parseDouble(JOptionPane.showInputDialog("Enter cash amount: \nYour total is P" + ans));
            if (payment > ans) {
                double change = payment - ans;
                JOptionPane.showMessageDialog(null, "Thank you. Your change is: P" + change);
                break;
            } else if (payment == ans) {
                JOptionPane.showMessageDialog(null, "Thank you. Your payment is exact");
                break;
            } else if (payment < ans) {
                JOptionPane.showMessageDialog(null, "Invalid payment. Enter payment again");
                //if below siya sa amount needed sir pabalikon niyag pay ang costumer or user
            }
           }
            
            int again = JOptionPane.showConfirmDialog(null, "Do you want to perform another transaction?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (again == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Thank you for using Nat's EStore! \nHave a great day:) ");
                break;
            } else { 
            }
            
        } while (true);
    }
}
