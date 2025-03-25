public class Mammal extends Animal{
    protected String name;
    public Mammal(String name){
        super(name);
    }
    public String toString(){
        return "Mammal[Animal[name=" +super.toString() + "]";
    }
}


