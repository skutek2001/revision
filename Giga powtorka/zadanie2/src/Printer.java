import java.util.List;

public class Printer implements CartPrinter{
    @Override
    public void printItems(List<Product> cartList) {
        if(cartList.size() == 0){
            System.out.println("koszyk jest pusty");
            return;
        }
        for(Product x : cartList){
            System.out.println(x.toString());
        }
    }
}