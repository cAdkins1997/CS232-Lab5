public class Main {
    public static void main(String[] args) {
        Dog buddy = new Dog("Dachshund", "Buddy", "Billy", 16, "male", "brown", "12/25/2007");
        Cat khajit = new Cat("Maine Coon-mix", "Khajit", "Joe-Bob", 10, "female", "siamese", "11/11/2011");
        Turtle joe = new Turtle("Eastern Box Turtle", "Joe", "Joe-Bob jr", 2, "female", "yellow spots w/ a brown background", "09/06/97");
        Bird lilGuy = new Bird("Green Parrot", "Lil Guy", "Joe-Bob jr.", 2.25, "male", "green", "04/20/1990");
        HelperTestMethods.testDog(buddy);
        HelperTestMethods.testCat(khajit);
        HelperTestMethods.testBird(lilGuy);
        HelperTestMethods.testTurtle(joe);
    }
}