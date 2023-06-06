public class Product {
    private String name;
    private String code;
    private int price;

    Product(String name, String code, int price){
        this.name = name;
        setCode(code);
        this.price = price;
    }

    Product(){
        throw new IllegalArgumentException("Nie można podać wpisu pustego towaru");
    }

    void setCode(String code){
        if(code.matches("^[A-Z]{2}-K[0-9]{4}$")){
            this.code = code;
        }
        else throw new IllegalArgumentException("Podano zły kod");
    }

    public String toString(){
        return "Name: "+name+"\nCode: "+code+"\nPrice: "+price+"\n";
    }

    String getCode(){
        return code;
    }

}
