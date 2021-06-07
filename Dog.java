public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }


    public void setName(String name){
        super.setName(name);
    }

    public  String getName(String name){
        return super.getName();
    }
    @Override
    public String greets(){
        return "Woof";
    }
    public String greets(Dog another){
        return "woooof";

    }
}
