public class Friend {

    String name;
    static int numberOfFrineds;

    Friend(String name){
        this.name = name;
        numberOfFrineds++;
    }

    static void displayFriends(){
        System.out.println("You have "+numberOfFrineds+" friends");
    }
}
