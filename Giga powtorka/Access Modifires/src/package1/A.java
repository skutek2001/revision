package package1;
import package2.*;

public class A {
    //protected String protectedMessage = "This is protected"; // only this and subclass can use it
    public static void main(String[] args) {

        B b = new B();
        //System.out.println(b.privateMessage); //something that is private is only visible to the class it's self,
                                                //even if it is in package that contains multiple classes with this same variable
    }
}