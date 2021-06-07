public class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }
    public void setName(String name){
        super.setName(name);
    }
    public String getName(String name){
        return super.getName();
    }
    @Override
    public String greets(){
        return "Wooow";
    }
    public String greets(Dog another){
        return "Woooooow";
    }
    public String greets(BigDog another){

        return "Wooooooooooow";
    }
}
