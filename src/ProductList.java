import java.util.Arrays;
import java.util.List;


public class ProductList{
    List<Product> allProducts = Arrays.asList( 
        new Product("Baby Shampoo",1,10.0," Mild Shampoo for babies , with a sweet fragnance after every wash ."),
        new Product("Pen",2,20.0," A royal looking ball pen . Take it with you everywhere either it is a office meeting or a party"),
        new Product("Calender",3,40.0,"A Calender with motivation quotes written on every month page ."),
        new Product("Realme 5 pro",4,13000.0,"48MP+8MP+2MP+2MP rear camera | 16MP front camera 16.002 centimeters (6.3-inch) Full HD+ capacitive touchscreen with 1080 x 2340 pixels resolution, 409 ppi pixel density"),
        new Product("Mobile Charger (Multi socket)",5,340.0,"Intelligent fast charging with Quick Charge 3.0 Technology at 5V/3A, 9V/2A, 12V/1.5A output. The charger auto detects your device and charges it at its fastest supported speed.")
        );

    boolean isProductIdExists(int id){
        boolean ans = false;
        for(int i =0 ;i<allProducts.size();i++){
            if(allProducts.get(i).id == id){
                ans = true;
                break;
            }
        }
        return ans;
    }
    
    CartItem getItem(int id){
        CartItem newItem = new CartItem("",-1,0.0,"",1);
        for(int i =0 ;i<allProducts.size();i++){
            if(allProducts.get(i).id == id){
                newItem = new CartItem(allProducts.get(i).name,allProducts.get(i).id,allProducts.get(i).price,allProducts.get(i).description,1);
                break;
            }
        }
        return newItem;
    }

    List<Product> getProducts(){
        return allProducts;
    }
    void showProducts(){
        System.out.println("Hello User !!\nHere is the list of all products we have!!\n\n");
    	for(int i=0;i<allProducts.size();i++){
    	    System.out.println("Product Id :" + allProducts.get(i).id +"\n");
    		System.out.println("Product name :" + allProducts.get(i).name+"\n");
    		System.out.println("Product price :" + allProducts.get(i).price+"\n");		    
    		System.out.println("Product description :" + allProducts.get(i).description+"\n\n");
    	}
    }
}