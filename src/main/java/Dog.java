public class Dog extends Animal {
    private String owner;

    public Dog(String name, int age, String owner) {
        super(name, age); // this is initialized from the base class: Animal
        this.owner = owner;
    }

    public void play() {
        System.out.println("Dog " + name + " is chasing its tail");
    }

    @Override
    public void play(Toy toy) {
        {
            System.out.println("Dog " + name + " is playing with " + toy);
        }
    }
}
