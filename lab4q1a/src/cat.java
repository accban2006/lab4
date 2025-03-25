public class cat extends Mammal{
    protected String name;
    public cat(String name){
        super(name);
    }
    public void greets(){
        System.err.println("Meow");
    }
    public String toString(){
        return "cat[Mammal[Animal[name=" +super.toString()+ "]";
    }
}

