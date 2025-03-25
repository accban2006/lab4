public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal("Unknown");
        System.out.println(a);

        Mammal m = new Mammal("Mammal");
        System.out.println(m);

        cat c = new cat("Kitty");
        System.out.println(c);
        c.greets();

        dog d1 = new dog("Buddy");
        System.out.println(d1);
        d1.greets();

        dog d2 = new dog("Rocky");
        d1.greets(d2);
    }
}

