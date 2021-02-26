
public class CartItem extends Product{
    int quantity;
    CartItem(String name,int id,double price,String description,int quantityt){
        super(name,id,price,description);
        quantity = quantityt;
    }
}