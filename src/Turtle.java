public class Turtle extends Pet{

    @Override
    void speak() {
        System.out.println(super.getName() + ":\" grunt! grunt!\"");
    }

    void crawl(){
        System.out.println("The small turtle wanders about the space, his face the very image of contentedness");
    }
    void hide_in_shell(){
        System.out.println(super.getName() + " hides within his shell. \"In this space, no one can get at me now\" " +
                "thinks the serene reptile.");
    }
    void swim(){
        System.out.println(super.getName() + " swims about the water in his enclosure. \"It is a good day\" he thinks to himself");
    }

    public Turtle(String type, String name, String owner, double weight, String sex, String color, String birthDate) {
        super(type, name, owner, weight, sex, color, birthDate);
    }
}