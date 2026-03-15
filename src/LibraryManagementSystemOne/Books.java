package LibraryManagementSystem;

import java.util.ArrayList;

public class Books {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("The Iliad by Homer ( ancient Greek epic poem)\n");
        list.add("The Republic by Plato (philosophical dialogue)\n");
        list.add(" Don Quixote by Miguel de Cervantes (regarded as the first modern novel)\n");
        list.add(" Pride and Prejudice by Jane Austen (classic romance novel)\n");
        list.add("War and Peace by Leo Tolstoy (masterpiece of Russian literature)\n");
        list.add("Syntactic Structures by Noam Chomsky (revolutionized linguistics)\n");
        list.add("The Structure of Scientific Revolutions by Thomas Kuhn (changed our view of science)\n");
        list.add("Man's Search for Meaning by Victor Frankl (provides answers to totalitarian attempts)\n");
        list.add(" After Virtue by Alasdair McIntyre (critiques rationalism and irrationalism)\n");
        list.add("Silent Spring by Rachel Carson (helped launch the environmental movement)\n");
        list.add("Silent");


        System.out.println(list.contains("Silent"));

//        Main main = new Main();
//        main.listBooks(list);
    }

    //listing all the books
    public void listBooks(ArrayList<String> list){
        for (String book: list){
            System.out.println(book);
        }
    }

}
