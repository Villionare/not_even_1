package Composition;

public class Humanoid {
    String name;
    String madeOf;
    Core core;

    Humanoid(String name,String madeOf, String c){
        this.name = name;
        this.madeOf = madeOf;
        this.core = new Core(c);
    }

    void Display(){
        core.coreCheck();
        System.out.println(this.name +" "+ this.madeOf);
    }
}
