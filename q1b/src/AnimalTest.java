public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        Dog dog = new Dog("Buddy");
        BigDog bigDog1 = new BigDog("Max");
        BigDog bigDog2 = new BigDog("Rocky");

        cat.greets();
        dog.greets();
        bigDog1.greets();
        dog.greets(dog);
        bigDog1.greets(dog);
        bigDog1.greets(bigDog2);
    }
}