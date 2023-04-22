public abstract class Animal implements Action { //class is abstract which means you can't create an object off this class
    protected String name;
    protected int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
