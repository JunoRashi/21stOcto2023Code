package oct;

import java.util.ArrayList;
import java.util.List;

public class ListEx001 {

    public static void main(String[] args) {
        //  List list=new List();//cannot create object as it is interface


        List l = List.of("orange", "apple", "banana", "sugar", 123, "papaya");

        System.out.println(l);

        System.out.println(l.get(4));

        System.out.println(l.size());


        System.out.println(l.indexOf(123));


        List list = List.of("A", "B");

        ArrayList list1 = new ArrayList();

        list1.add("Pramod");
        list1.add("Dutta");

        System.out.println(list1.size());

        System.out.println(list1.isEmpty());

        System.out.println(list1.remove(1));

        System.out.println(list1.add(""));


    }
}
