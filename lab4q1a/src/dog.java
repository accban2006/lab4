public class dog extends Mammal{
    protected String name;
    public dog(String name){
        super(name);
    }
    public void greets(){
        System.err.println("Woof");
    }
    public void greets(dog another){
        System.err.println("Woooof");
    }
    public String toString(){
        return "dog[Mammal[Animal[name=" +super.toString() + "]";
    }
}

