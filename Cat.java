public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public void setName(String name){
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String greets(){
        return "Meow";

    }
}

