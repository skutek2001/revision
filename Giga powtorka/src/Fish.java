public class Fish implements Prey,Predator{
    @Override
    public void flee() {
        System.out.println("The fish swim away");
    }

    @Override
    public void hunt() {
        System.out.println("This fish is hunting for smaller fishes");
    }
}
