
import java.util.*;

public class Main {
    
    
    
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean flag = true;
		Cart cartO = new Cart();
		ProductList pl = new ProductList();
		while(flag == true){
		    int in;

		    System.out.println("1. Show all Products");
		    System.out.println("2. Show all CartProducts");
		    System.out.println("3. Add To Cart");
		    System.out.println("4. Remove From Cart");
		    System.out.println("5. Inc/Dec quantity of item from cart");
		    System.out.println("6. Print Bill");
		    System.out.println("7. Exit");
		    
		    in = sc.nextInt();
		    
		    if(in == 1){

	            pl.showProducts();
		    }
		    else if(in == 2){
                cartO.showCartProducts();
		    }
		    else if(in == 3){
		        
		        System.out.println("Enter product Id :-");
		        int id = sc.nextInt();
		        boolean isPresent = pl.isProductIdExists(id);
		        if(isPresent == true){
		            cartO.addToCart(id);
		        }
		        else
		            System.out.println("Product Id doesn't exist !!\n");
		        
		    }
		    else if(in == 4){
		        System.out.println("Enter product Id :-");
		        int id = sc.nextInt();
		        boolean isPresent = pl.isProductIdExists(id);
		        if(isPresent == true){
		            cartO.removeFromCart(id);
		        }
		        else
		            System.out.println("Product Id doesn't exist !!\n");
		    }
		    else if(in == 5){
		        System.out.println("Enter product Id :-");
		        int id = sc.nextInt();
		        boolean isPresent = pl.isProductIdExists(id);
		        if(isPresent == true){
                    System.out.println("\n\n1.Increase Quantity");
                    System.out.println("2.Decrease Quantity");
                    int ch = sc.nextInt();
                    if(ch == 1){
                        cartO.incQuantity(id);
                    }
                    else if(ch == 2){
                        cartO.decQuantity(id);   
                    }
                }
		        else
		            System.out.println("Product Id doesn't exist !!\n");
		    }
		    else if(in == 6){
		        cartO.printBill();
		    }
		    else if(in == 7)
		    {
		        flag = false;
		    }
		    else {
		        System.out.println("Please enter Valid choice!");
		    }
		}
	}
}
