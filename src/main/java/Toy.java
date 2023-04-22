public class Toy implements Action{
    private String name;
    private String brand;

    public Toy(String brand) {
        this.brand = brand;
    }

    public void play() {
        System.out.println("Toy of brand " + brand + " is making a weird sound");
    }

    public void play(Toy toy) {
        System.out.println("Toy of brand " + brand + " is happy to see another toy " + toy);
    }

    @Override
    public String toString() {
        return name;
    }
}
