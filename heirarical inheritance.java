class Animals {
    void eat(){
        System.out.println("The animal is eating now");
    }
}
class Dog extends Animals{
    void bark(){
        System.out.println("The dog is barking");
    }
}
class cat extends Animals{
    void meow(){
        System.out.println("The cat is meowing");
    }
}
class gow extends Animals{
    void shout(){
        System.out.println("The gow is Shouting");
    }
}
public class singleinheritence{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
        gow g1 = new gow();
        g1.shout();
        cat c1 = new cat();
        c1.eat();
    }
}

