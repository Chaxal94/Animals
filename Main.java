public class Main {
    public static void main(String[] args) {
       Animal cat = new Cat("Marus");
       System.out.println(cat.greets());
       System.out.println(" ");
       Animal dog = new Dog("Chalo");
       System.out.println(dog.greets());
        System.out.println(" ");
        Dog another = new Dog("Sevuk");
        System.out.println(another.greets(another));
        System.out.println(" ");
        Animal bigDog = new BigDog("Rex");
        System.out.println(bigDog.greets());
        BigDog anotherDog =new BigDog("QOT");
        System.out.println(" ");
        System.out.println(anotherDog.greets(another));
        BigDog anotherBigDog = new BigDog("Graf");
        System.out.println(" ");
        System.out.println(anotherBigDog.greets(anotherBigDog));









    }
}
