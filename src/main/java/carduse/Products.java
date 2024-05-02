package carduse;

public class Products extends LoginService {
    public int kurtiPrice = 500;
    public  int shirtsPrice = 500;

    public  int totalPrice;
    public  int noOfItems;

    public int Product(int noOfItems){
        totalPrice = kurtiPrice*noOfItems+ shirtsPrice*noOfItems;

       return totalPrice;
    }
}
