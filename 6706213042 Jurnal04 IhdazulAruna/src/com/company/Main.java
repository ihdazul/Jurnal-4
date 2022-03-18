package com.company;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;
public class Main {

    public static void main(String[] args) {
        LinkedList<Doubly>douch = new LinkedList<>();
        Scanner i = new Scanner(System.in);
        boolean state = true;
        while(state){
            menu();
            switch (i.nextInt()) {
                case 1 -> {
                    String title = i.next();
                    String singer = i.next();
                    douch.addLast(new Doubly(title, singer));
                }
                case 2 -> {
                    System.out.println("1. Delete according to title");
                    System.out.println("2. Delete last song");
                    if (i.nextInt() == 1) {
                        removeWithTitle(douch, i.next());
                    } else {
                        douch.removeLast();
                    }
                }
                // note for case 2
                case 3 -> cetak(douch);

                //note for case 3
                default -> state = false;
            }
        }
    }
    public static void cetak(LinkedList doubo){
        ListIterator<Doubly> kursor = doubo.listIterator();
        while(kursor.hasNext()) {
            System.out.print(kursor.next());
            if(kursor.hasNext()){
                System.out.print(" - ");
            }
        }
        System.out.println();

        while (kursor.hasPrevious()){
            System.out.print(kursor.previous());
            if(kursor.hasPrevious()){
                System.out.print(" - ");
            }
        }
        System.out.println("\n ---- Done ----");
    }

    public static void removeWithTitle(LinkedList douch, String title){
        ListIterator<Doubly> kursor = douch.listIterator();
        while(kursor.hasNext()){
            Doubly douchy = kursor.next();
            if(douchy.gettitle().equals(title)){
                kursor.remove();
                System.out.println("--- Deleted ---");
            }
        }
    }

    public static void menu(){
        System.out.println("Menu :");
        System.out.println("1.Add a Song");
        System.out.println("2.Delete a Song");
        System.out.println("3.Play Song");
        System.out.println("4.Exit.");
    }
}