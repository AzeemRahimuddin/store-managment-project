import java.util.Scanner;

/*
 * Main class to run the electronic store program. It creates instances of 
 * Phones and Laptops and allows the user to select the product they want. 
 */
public class StoreRunner {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
  // Create instances of Phones and Laptops
Phones storePhones= new Phones( "Iphone 15 Pro Max",1099.99,256,0.5,48.0);
Laptops  storeLaptops = new Laptops( "Macbook Pro 2023 M2 Pro chip ",1999.99,512,13.3,16);   
int selection = 0;   
    
 // Displays a welcome message to the user  
System.out.print ( "Welcome to Azeem's electronics store. We sell Macbooks and Iphones here.\n ");
    
 // Prompt the user for input on which product they would like to view   
System.out.print( "\n If you would like to see what Iphone we have in stock press the number 1 and then enter. \n If you would like to see what Macbook we have, press 2 and then enter.\n" ); 
  
  // Read the user's selection from the console
  selection = input.nextInt();
   input.nextLine(); 
    
    
    // Display product details based on user selection
    // Check if user has selected the option to view Phone specifications
    if (selection == 1){
   System.out.print("\n Currently have 4 Iphone 15 Pro Max's in stock. The specs of this model are:\n\n ");
   System.out.print(storePhones.toString());
    }
    // Check if the user has selected the option to view Macbook specifications
   if (selection == 2){
   System.out.print("\n Currently, we have 2 Macbook Pros in stock. The specs of this model are:\n\n ");
   System.out.print(storeLaptops.toString());
   } 
  
    // Check if the user input is invalid (not 1 or 2) 
   if (  (selection<1) || (selection>2)  ){
    System.out.print("\n Invalid Selection ");
     
   }

    // Closes the Scanner object
    input.close();
    
  }
}