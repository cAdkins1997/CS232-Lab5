public class Bird extends Pet{

    @Override
    void speak() {
        System.out.println(super.getName() + ": \"chirp!  chirp!\"");
    }
    void sing(){
        System.out.println(super.getName() + " sings you the song of their people");
    }
    void fly(){
        System.out.println(super.getName() + " flies about the area, finding joy in using his skills of flight");
    }
    void eat_bird_seed(){
        System.out.println(super.getName() + " scarfs down the bird seed you have offered him. \"what a wonderful day they think\"");
    }

    public Bird(String type, String name, String owner, double weight, String sex, String color, String birthDate) {
        super(type, name, owner, weight, sex, color, birthDate);
    }
}
