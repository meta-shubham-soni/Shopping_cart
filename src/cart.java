import java.util.ArrayList;
import java.util.List;

class Cart{
    List<CartItem> cartItems = new ArrayList<CartItem>();
    double cartPrice = 0;
    int totalQuantity = 0;
    List<CartItem> getCartProducts(){
        return cartItems;
    }
    void showCartProducts(){
        System.out.println("Hello User !!\nHere is the list of all cart products!!\n\n");
		List<CartItem> allCartProducts = cartItems;
    	for(int i=0;i<allCartProducts.size();i++){
    	    System.out.println("Product Id :" + allCartProducts.get(i).id +"\n");
    		System.out.println("Product name :" + allCartProducts.get(i).name+"\n");
    		System.out.println("Product price :" + allCartProducts.get(i).price+"\n");
    		System.out.println("Product quantity :" + allCartProducts.get(i).quantity+"\n");
    		System.out.println("Product description :" + allCartProducts.get(i).description+"\n\n");
    	}
    }
    
    void addToCart(int itemId){
        int itemInd = -1;
        for(int i=0;i<cartItems.size();i++){
            if(cartItems.get(i).id == itemId){
                itemInd = i;
                break;
            }
        }
        if(itemInd != -1){
            System.out.println("Item already exists in Cart !!");
            return;
        }
        else{
            ProductList pl = new ProductList();
            CartItem newItem = pl.getItem(itemId); 
            cartItems.add(newItem);
        }
    }
    
    void removeFromCart(int itemId){
        int itemInd = -1;
        for(int i=0;i<cartItems.size();i++){
            if(cartItems.get(i).id == itemId){
                itemInd = i;
                break;
            }
        }
        if(itemInd == -1){
            System.out.println("Item doesn't exists in Cart !!");
            return;
        }
        else{
            cartItems.remove(itemInd);
        }
    }
   
    void incQuantity(int itemId){
        int itemInd = -1;
        for(int i=0;i<cartItems.size();i++){
            if(cartItems.get(i).id == itemId){
                itemInd = i;
                break;
            }
        }
        if(itemInd == -1){
            System.out.println("Item doesn't exists in Cart !!");
            return;
        }
        else{
            CartItem newItem = new CartItem(cartItems.get(itemInd).name,itemId,cartItems.get(itemInd).price,cartItems.get(itemInd).description,cartItems.get(itemInd).quantity+1);
            cartItems.set(itemInd,newItem);
            
        }
    }
    
    void decQuantity(int itemId){
        int itemInd = -1;
        for(int i=0;i<cartItems.size();i++){
            if(cartItems.get(i).id == itemId){
                itemInd = i;
                break;
            }
        }
        if(itemInd == -1){
            System.out.println("Item doesn't exists in Cart !!");
            return;
        }
        else{

            CartItem newItem = new CartItem(cartItems.get(itemInd).name,itemId,cartItems.get(itemInd).price,cartItems.get(itemInd).description,cartItems.get(itemInd).quantity-1);
            if(newItem.quantity < 1){
                cartItems.remove(itemInd);
            }
            else
                cartItems.set(itemInd,newItem);
            
        }
    }
    
    void printBill(){
        if(cartItems.size() < 1){
            System.out.println("\nAdd products in cart to show Bill!!\n\n");
            return;
        }
        else{
            double gprice = 0;
            for(int i=0;i<cartItems.size();i++){
                System.out.println("\nProduct Name:- " + cartItems.get(i).name + "\n");
                System.out.println("\nProduct Price :- " + cartItems.get(i).price + "     Product Quantity:- " + cartItems.get(i).quantity + "\n");
                double tprice = cartItems.get(i).price * cartItems.get(i).quantity;
                gprice = gprice + tprice;
                System.out.println("\nTotal Price :- " + tprice + "\n\n");
                
            }
            System.out.println("\n\nGrand Total :- " + gprice);
        }
    }
}