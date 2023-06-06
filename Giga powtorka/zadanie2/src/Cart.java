import java.util.ArrayList;

public class Cart {

    static int cartCapacity = 5;
    private ArrayList<Product> cartList = new ArrayList<>();
    private Printer printer;

    public void setPrinter(Printer printer){
        this.printer = printer;
    }
    void addItem(Product product){
        if(cartList.size() < cartCapacity){
            cartList.add(product);
        }
        else throw new IllegalArgumentException("Koszyk jest przepełniony");
    }

    void printItems(){
        for(Product x : cartList){
            System.out.println(x.toString());
        }
    }

    void removeItem(String code){
        for(int i=0; i < cartList.size(); i++){
            if(cartList.get(i).getCode().equals(code)){
                cartList.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException("Produkt podany przez ciebie nie istniej");
    }

    void findItem(String code){
        for(int i=0; i < cartList.size(); i++){
            if(cartList.get(i).getCode().equals(code)){
                System.out.println(cartList.get(i));
                return;
            }
        }
        throw new IllegalArgumentException("Produkt podany przez ciebie nie został znaleziony");
    }

    void cartSize(){
        System.out.println("Obecnie w koszyku jest: " + cartList.size() + " przedmioty");
    }

    void clearCart(){
        cartList.clear();
    }
}
