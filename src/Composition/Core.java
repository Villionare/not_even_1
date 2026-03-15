package Composition;

public class Core {
    String core_main;

    Core(String c){
        this.core_main = c;
    }

    void coreCheck(){
        System.out.println("so the core is active "+ this.core_main);
    }
}
