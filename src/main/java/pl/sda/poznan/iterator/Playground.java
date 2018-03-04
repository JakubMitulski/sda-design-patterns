package pl.sda.poznan.iterator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Playground {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Piotr", "Jan", "Ala");

        System.out.println("Petla for each .....");
        for (String s : names) {
            System.out.println(s);
        }

        System.out.println("Z uzyciem iteratora .....");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("Podana wartosc to: " + next);
        }

        for (int i = 0; i < names.size(); i++) {
            String s = names.get(i);
            System.out.println(s);
        }
    }
}
