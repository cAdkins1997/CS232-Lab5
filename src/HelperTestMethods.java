public class HelperTestMethods {
    static void testTurtle(Turtle turtle){
        System.out.println(turtle.toString());
        turtle.speak();
        turtle.crawl();
        turtle.hide_in_shell();
        turtle.swim();
        getterSetterTest(turtle);
    }

    static void testBird(Bird bird){
        System.out.println(bird.toString());
        System.out.println(bird.getName());
        bird.speak();
        bird.eat_bird_seed();
        bird.fly();
        bird.sing();
        getterSetterTest(bird);
    }

    static void testDog(Dog dog){
        System.out.println(dog.toString());
        System.out.println(dog.getName());
        dog.speak();
        dog.play_dead();
        dog.sit();
        dog.roll_over();
        dog.wag_tail();
        getterSetterTest(dog);
    }

    static void testCat(Cat cat){
        System.out.println(cat.toString());
        System.out.println(cat.getName());
        cat.speak();
        cat.climb_trees();
        cat.ignore_owner();
        cat.scratch_post();
        cat.sleep();
        getterSetterTest(cat);
    }
    static void getterSetterTest(Pet pet){
        pet.getTag();
        pet.setType("Some animal");
        System.out.println(pet.getType());
        pet.setName("a name for an animal and stuff");
        System.out.println(pet.getName());
        pet.setOwner("Some other guy");
        System.out.println(pet.getOwner());
        pet.setSex("Male or Female or somethin\'");
        System.out.print(pet.getSex());
        pet.setColor("some color");
        System.out.println(pet.getColor());
        pet.setBirthDate("99/99/9999");
        System.out.println(pet.getBirthDate());
        pet.setWeight(2.12);
        System.out.println(pet.getWeight());
    }
}