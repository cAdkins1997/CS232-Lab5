public class Cat extends Pet{

    @Override
    void speak() {
        System.out.println(super.getName() + ": \"Meow\"");
    }
    void scratch_post() {
        System.out.println(super.getName() + ": scrsh, srcsh, srcsh");
    }
    void ignore_owner(){
        System.out.println(super.getName() + ": \"I am paying you no mind human now scram! Wait! Wait! you didn't hear that. Meow\"");
    }
    void sleep(){
        System.out.println("a constant pur emanates from the sleeping cat");
    }
    void climb_trees(){
        System.out.println(super.getName() + " extends it's claws and climbs the nearest tree seeking either adventure or escape");
    }

    public Cat(String type, String name, String owner, double weight, String sex, String color, String birthDate) {
        super(type, name, owner, weight, sex, color, birthDate);
    }
}
