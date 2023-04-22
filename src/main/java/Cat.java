public class Cat extends Animal {

    public Cat(String name,int age) {
        super(name,age);
    }

    @Override //override the function from the parent(base) class
    public void play() {
        System.out.println("Cat class: cat " + name + " jumps off the table");
    }

    @Override //This function is an Overload because it has the same function name but with different parameter names
    public void play(Toy toy) {
        System.out.println("Cat class: cat " + name + " is playing with the toy" + toy);
    }
}
