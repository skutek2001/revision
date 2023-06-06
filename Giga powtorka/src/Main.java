import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("siemka");
        int x = 123;
        System.out.println(x);

        System.out.println("podaj liczbe:");
        //x = sc.nextInt();
        System.out.println("twoja liczba to: "+x);

        double tak  = 10;
        tak = (double) tak / 3;
        System.out.println(tak);
        */



        /*String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null,"You're "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
        JOptionPane.showMessageDialog(null,"You're "+height+" m tall");
        */



        /*double z = 3.14;
        double y = 4.975;

        System.out.println(Math.max(z,y));
        System.out.println(Math.floor(z));
        System.out.println(Math.round(y));

        System.out.println("podaj a:");
        double a = sc.nextDouble();
        System.out.println("podaj b:");
        double b = sc.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("przekatna c wynosi: "+c);
         */



        /*Random random = new Random();

        int a = random.nextInt(10)+1;
        double b = random.nextDouble();

        System.out.println(a);
        System.out.println(b);
        */



        /*String imie = "Krystian";

        //boolean wynik = imie.equalsIgnoreCase("krystian");
        //int wynik = imie.length();
        //char wynik = imie.charAt(2);
        //int wynik = imie.indexOf("y");
        //boolean wynik = imie.isEmpty();
        //String wynik = imie.toLowerCase();
        //String wynik = imie.toUpperCase();
        //String wynik = imie.trim(); //usuwa puste przezstrzenie z początku i konca stringa
        //String wynik = imie.replace("n","k");
        //System.out.println(wynik);
         */



        /* wrapper class =  provides a way to use primitive data types as reference data types
        //     reference data types contain useful methods
        //     can be used with collections (ex.ArrayList)

        //primitive     //wrapper
        //---------     //-------
        // boolean      Boolean
        // char         Character
        // int          Integer
        // double       Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        Boolean a = true;
        Character b = 34;
        Integer c = 123;
        Double d = 3.14;
        String e = "Krystian"; //reference data type
        System.out.println(b.charValue());

        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
        if (a == true)
            System.out.println("this is true");
        */


        /*ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(2);
        food.clear();

        for(int i=0; i< food.size(); i++){
            System.out.println(food.get(i));
        }
        */



        /*2D ArrayList = a dynamic list od lists
        //You can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(0));
         */



        /* for-each
        //String[] animals = {"cat","dog","rat","bird"};
        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i : animals){
            System.out.println(i);
        }
        */

        /*method - a block of code that is executed whenever it is called upon
        String name = "krystian";
        int age = 22;
        hello(name,age);
        int x=3,y=7;
        System.out.println(sum(x,y));
        */


        /*overloaded methods
        int a = sum(1,2);
        int b = sum(1,2,3);
        int c = sum(1,2,3,4);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
         */



        /*printf
        //System.out.printf("this is a format string %d\n",123);

        boolean myBoolean = true;
        char myChar = '!';
        String myString = "Krystian";
        int myInt = 50;
        double myDouble = 1000;
        System.out.printf("%b\n",myBoolean);
        System.out.printf("%c\n",myChar);
        System.out.printf("%s\n",myString);
        System.out.printf("%d\n",myInt);
        System.out.printf("%f\n",myDouble);

        System.out.printf("Hello %15s, tak tak\n",myString);
        System.out.printf("Hello %-15s, tak tak\n",myString);
        System.out.printf("You have this much money %.2f\n",myDouble);
        System.out.printf("You have this much money %+f\n",myDouble);
        System.out.printf("You have this much money %020f\n",myDouble);
        System.out.printf("You have this much money %,f\n",myDouble);
        */



        /* starting objects
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        */



        /*Human human1 = new Human("Rick",28,75.5);
        Human human2 = new Human("Morty",16,50.5);


        System.out.println(human1.name);
        System.out.println(human2.name);
        human2.eat();
         */



        /*Local a global
        DiceRoller diceRoller = new DiceRoller();
        */



        /*Multiple constructors
        Pizza pizza = new Pizza();
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
         */



        /*toString
        Car myCar = new Car();

        //System.out.println(myCar.toString());
        System.out.println(myCar);
        */



        /*array of objects
        //Food[] refrigerator = new Food[3]; - one way

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hot dog");

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;
        Food[] refrigerator = {food1,food2,food3}; //second way

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
        */



        /*object passing
        Garage garage = new Garage();
        Car car1 =  new Car("BMW");
        Car car2 =  new Car("Tesla");

        garage.park(car1);
        garage.park(car2);

         */



        /*static - modifier. A single copy od a variable/method is created and shared.
        //         The class "owns" the static member.
        Friend friend1 = new Friend("Jack");
        Friend friend2 = new Friend("Mike");
        Friend friend3 = new Friend("Steve");

        Friend.displayFriends();
        System.out.println(Friend.numberOfFrineds);
         */



        /*inheritance
        Car car = new Car();
        Bicycle bike = new Bicycle();

        car.go();
        bike.stop();
        System.out.println(car.speed);

        System.out.println(car.wheels);
        System.out.println(bike.wheels);

        System.out.println(car.doors);
        System.out.println(bike.pedals);
        */



        /*method overriding = declaring a method is sub class,
        //                    which is already a present in parent class
        //                    done so that a child class can give its own implementation
        Animal animal = new Animal();
        animal.speak();
        Dog dog = new Dog();
        dog.speak();
         */



        /*super = keyword refers to the superclass(parent) of an object
        //        very similar to the "this" keyword
        Hero hero1 = new Hero("Batman",42,"$$$");
        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        System.out.println();
        Hero hero2 = new Hero("Superman",43,"everything");
        System.out.println(hero2.toString());
        */



        /*abstract = abstract classes cannot be instantiated, but they can have a subclass
        //           abstract methods are declared without an implementation
        //Vehicle_abst vechicle = new Vehicle_abst(); - after being abstract class we cannot call a new object from it
        Car_abst car = new Car_abst();
        car.go();
        */



        //Access modifiers - another folder



        /*encapsulation = attributes of class will be hibben or private,
        //                Can be accessed only through methods (getters & setters)
        //                You should make attributes private if you don't have a reason to make them public/protected
        Car_encap car = new Car_encap("BMW","RX6",2016);
        //System.out.println(car.make); // nie można się dostać do jest private
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        //car.year = 2022;      //nie można bo jest private wiec tylko w obrębie tamtej klasy możemy cos z tym robic
        //                      //trzeba użyć settera jesli chcemy cos zmienic
        car.setYear(2022);
        System.out.println(car.getYear());
        */



        /*copying objects
        Car_encap car1 = new Car_encap("Chevrolet","Camaro",2021);

        //Car_encap car2 = new Car_encap("Frod","Mustang",2022);
        //do not do car2 = car1; //it replaces just the address which makes car1 also visible as car2
        //car2.copy(car1);
        //can be done also like this with overloaded constructor
        Car_encap car2 =new Car_encap(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        */



        /*interfaces = a template that can be applied to a class
        //             similar to inheritance, but specifies what a class has/must do.
        //             classes can apply more than one interface, inheritance is limited ro 1 super
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
        */



        /*polymorphism = greek word for poly-"many", morph-"form"
        //               the ability of on object to identify as more than one type
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car,bicycle,boat};

        for(Vehicle x : racers){
            x.go();
        }
        */



        /*dynamic polymorphism
        //polymorphism - as above
        //dynamic - after compilation(during runtime)
        //ex. A corvette is a: corvette, and a car, and a vehicle, and an object
        Animal animal;
        System.out.println("What animal do you want?");
        System.out.println("1 - dog or 2 - cat");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                animal = new Dog();
                break;
            case 2:
                animal = new Cat();
                break;
            default:
                animal = new Animal();
                break;
        }
        animal.speak();
        */



        //exception = an event that occurs during the execution of a program that
        //            disrupts the normal flow of instruction
        /*try{
            System.out.println("Enter a whole number to divide: ");
            int x = sc.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = sc.nextInt();

            int z = x/y;
            System.out.println("Result: "+z);
        }catch (ArithmeticException e){
            System.out.println("You cant divide by 0");
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number!!");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            //System.out.println("This will always print");
            sc.close();//good for ex. to close scanner
        }
        */



        /* file = an abstract representation of file and directory path names
        File file = new File("src/test.txt");

        if(file.exists()){
            System.out.println("The file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();
            //nie może być w src tylko w głównym katalogu projektu troche dziwne
            //trzeba podać src/test.txt
        }
        else{
            System.out.println("Something want wrong");
        }
         */



        /* fileWriter
        try{
            FileWriter writer = new FileWriter("src/test.txt");
            writer.write("Ten test jest za latwy\nTry sth harder");
            writer.append("\nyeyeyeyeyye");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        */



        /*fileReader = read the contents of a file as a stream of characters. One by one
        //             read() returns an int value which contains the byte value
        //             when read() returns -1, there is no more data to be read

        try{
            FileReader reader = new FileReader("src/test.txt");
            int data = reader.read();
            while (data != -1){
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }*/



        //Math, BigInteger, BigDecimal
        /*pole koła pi*r^2
        double r = 10.0;
        //double pole = 3.14 * r * r;
        double pole = Math.pow(r,10) * 3.14;
        System.out.println("Pole koła: " + pole);
        int number = 121;
        double result = Math.sqrt(number);
        // można zrobić tz import statyczny
        // aby nie musieć pisać za każdym razem przedrostka Math
        //import static java.lang.Math.(nazwa metody, chyba że chcemy wszytkie to *)

        BigInteger num1 = new BigInteger("11111111111111111111111111111111111111111");
        BigInteger num2 = new BigInteger("22222222222222222222222222222222222222222");

        //BigInteger suma = num1 + num2; //nie wolno przeciążać operatorów w Javie
        num1.add(num2); //obiekty w BigInteger nie są modyfikowalne,
                        // kiedy utorzymy jakiś obiekt ten przyjmuje wartość juz na stałe
        BigInteger suma = num1.add(num2);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(suma);

        BigDecimal n1 = new BigDecimal("500000000000000000000.99999999999999999999"); //dokładnie taka wartość nie tak jak w double że po 15 miejscu zaokrągla
        BigDecimal n2 = new BigDecimal("3524363446234643.0000000000000000001");       //tak jak zapiszemy tak odczyta

        double a = 9.5;
        double b = 4.0;
        double c = 0.33;
        System.out.println(a/b*c);       //0.7837500000000001

        BigDecimal l1 = new BigDecimal("9.5");
        BigDecimal l2 = new BigDecimal("4.0");
        BigDecimal l3 = new BigDecimal("0.33");
        BigDecimal cash = l1.divide(l2).multiply(l3);
        System.out.println(cash);        //0.78375
        */



        //SimpleDateFormat & Date & Calendar
        /*Date thisDate = new Date();
        System.out.println(thisDate);  //build in toString method

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println(dateFormat.format(thisDate));

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("YYYY/MM/dd w");
        System.out.println(dateFormat1.format(thisDate));

        SimpleDateFormat dateFormat2 = new SimpleDateFormat("YYYY/MMMM/dd w"); //DD day of a year
        System.out.println(dateFormat2.format(thisDate));

        SimpleDateFormat dateFormat3 = new SimpleDateFormat("YYYY/MM/dd w hh:mm a"); //HH 24h
        System.out.println(dateFormat3.format(thisDate));

        String dateString = dateFormat.format(thisDate);
        System.out.println(dateString);

        int date = thisDate.getDate(); //dzień miesiaca
        System.out.println(date);

        int day = thisDate.getDay(); //dzień tygodnia
        System.out.println(day);



        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        calendar.add(Calendar.DAY_OF_YEAR, -10);

        Date dateTenDaysAgo = calendar.getTime();

        System.out.println("Ten days ago was: " + dateFormat.format(dateTenDaysAgo));
        */


        /*Map and HashMaps
        //HashMap implements the Map interface (need import)
        //HashMap is similar to Array list, but with key-value pairs
        //stores objects, need to use Wrapper Class
        //ex: (name,email), (username,userID), (country,capital)

        HashMap<String,String> countries = new HashMap<String,String>();

        //add a key and value
        countries.put("USA","Washington DC");
        countries.put("India","New Delhi");
        countries.put("Russia","Moscow");
        countries.put("China","Beijing");

        System.out.println(countries);
        countries.remove("USA");
        System.out.println(countries);
        countries.put("USA","Washington DC");
        System.out.println(countries.get("India"));
        System.out.println(countries.size());
        countries.replace("USA", "Detroit");
        System.out.println(countries);
        System.out.println(countries.containsKey("England"));
        System.out.println(countries.containsValue("Beijing"));

        countries.replace("USA", "Washington DC");
        for(String i : countries.keySet()){
            System.out.print(i + "\t"+"= ");
            System.out.println(countries.get(i));
        }

        countries.clear();
        System.out.println(countries);
        */



        /*CurrencyFormater
        //Given a double-precision number, payment,
        // denoting an amount of money, use the NumberFormat
        // class' getCurrencyInstance method to convert payment
        // into the US, Indian, Chinese, and French currency formats.
        // Then print the formatted values as follows:
        // US: formattedPayment
        // India: formattedPayment
        // China: formattedPayment
        // France: formattedPayment


        double payment = sc.nextDouble();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        */



        

        sc.close();
    }

    static void hello(String name, int age){
        System.out.println("hello "+name+", you are "+age+" years old");
    }
    static int sum(int x, int y){
        System.out.println("this is overloaded method #1");
        return x+y;
    }
    static int sum(int x, int y,int z){
        System.out.println("this is overloaded method #2");
        return x+y+z;
    }
    static int sum(int x, int y, int z, int v){
        System.out.println("this is overloaded method #3");
        return x+y+z+v;
    }
}