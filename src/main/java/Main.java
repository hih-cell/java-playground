public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco", 14);
        Dog max = new Dog("max", 5, "Ermyas");
        Rabbit snowWhite = new Rabbit("snowBall",12, "red");
        Toy robot = new Toy("curious Georg");

        Toy curiousGeorge = new Toy("ABC corp");

        Action[] homeFriends = new Action[4];
        homeFriends[0] = coco;
        homeFriends[1] = max;
        homeFriends[2] = snowWhite;
        homeFriends[3] = curiousGeorge;


        for (Action friend : homeFriends) {
            friend.play();
        }
    }
}
