package ArrayListVsLinkedListTesting;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Main testOne = new Main();

        LinkedList<Students> list1 = testOne.createMilionLinkedList();
        ArrayList<Students> list2 = testOne.createMilionArrayList();

        long s1Start = System.currentTimeMillis();
        Students person = list1.get(500000);
        long s1End = System.currentTimeMillis();

        System.out.println(person.getName() + ": " + person.getAge());

        long s2Start = System.currentTimeMillis();
        Students people = list2.get(500000);
        long s2End = System.currentTimeMillis();

        System.out.println(people.getName() + ": " + people.getAge());

        System.out.println("LinkedList: " + (s1End - s1Start) + " " + "ArrayList: " + (s2End - s2Start));

    }

    //EXAMPLE BY LINKEDLIST
    public LinkedList<Students> createMilionLinkedList(){

        LinkedList<Students> exampleByList = new LinkedList<Students>();

        for(int i = 0; i < 1000000; i++){
            exampleByList.addFirst(new Students());
        }
        return exampleByList;
    }

    //EXAMPLE BY ARRAYLIST
    public ArrayList<Students> createMilionArrayList(){

        ArrayList<Students> exampleByArray = new ArrayList<Students>(1000000);

        for(int i = 0; i < 1000000; i++){
            exampleByArray.add(new Students());
        }
        return  exampleByArray;
    }
}