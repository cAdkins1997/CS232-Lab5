public class Dog extends Pet{

    @Override
    void speak() {
        System.out.println(super.getName() + ": \"bark! bark!\"");
    }
    void roll_over(){
        System.out.println(super.getName() + " rolls over, anticipating fantastic belly rubs from " + super.getOwner());
    }
    void play_dead(){
        System.out.println("On " + super.getOwner() + "'s command " + super.getName() + " collapse on the ground to play dead");
    }
    void sit(){
        System.out.println(super.getName() + " sits in place. They stare at you, anticipating further instruction");
    }
    void whine(){
        System.out.println(super.getName() + " whines at you.");
    }
    void wag_tail() {
        System.out.println(super.getName() + "wags their tail. They simply can not wait to play");
    }

    public Dog(String type, String name, String owner, double weight, String sex, String color, String birthDate) {
        super(type, name, owner, weight, sex, color, birthDate);
    }
}
