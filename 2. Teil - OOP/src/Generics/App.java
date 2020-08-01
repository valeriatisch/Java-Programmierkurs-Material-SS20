package Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

    public static void main(String[] args){

        //raw type
        ArrayList array = new ArrayList();
        array.add("a string");
        array.add(1);
        array.add(2.5);
        array.add(false);
        String s0 = (String) array.get(0);
        String s1 = (String) array.get(1);
        Object o = array.get(2);

        ArrayList<String> liste = new ArrayList<>();
        liste.add("hallo");
        String s2 = liste.get(0);

        Container<String, Boolean> c = new Container<>();
        c.setAttribut(false);
        System.out.println(c.getAttribut());

        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(6);
        set1.add(70);
        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(3);
        set2.add(90);
        Set<Integer> result = union(set1, set2);

        Iterator<Integer> itr = result.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        Employee emp = new Employee();
        Accountant acc = new Accountant();
        emp = acc;

        ArrayList<?> bsp = new ArrayList<>(); //same as raw type

        ArrayList<? extends Employee> emps = new ArrayList<>(); //Employee and children are possible
        ArrayList<Accountant> accs = new ArrayList<>();
        emps = accs;


    }

    //generic method
    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;

    }
}
