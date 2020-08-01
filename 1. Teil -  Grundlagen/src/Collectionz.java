import java.util.*;

public class Collectionz {

    public static void main(String[] args){

        ArrayList<String> liste = new ArrayList<String>();

        liste.add("Banane");
        liste.add("Ananas");
        liste.add("Erdbeere");
        liste.add("Apfel");

        for(String element : liste){
            System.out.println(element);
        }

        //liste.clear(); // Löscht alle Elemente in der Liste.
        boolean b = liste.isEmpty();

        System.out.println("Ist die Liste leer?");

        if(b){ // ist das Gleiche wie "if(b == true)
            System.out.println("Ja.");
        } else {
            System.out.println("Nein.");
        }

        ArrayList<String> liste2 = new ArrayList<>();

        liste2.add("Ananas");
        liste2.add("Apfel");
        liste2.add("Honigmelone");
        liste2.add("Pfirsich");

        // Bildet die Schnittmenge aus den beiden Listen und speichert diese in "liste":
        liste.retainAll(liste2);

        System.out.println("Die neue Liste ist: " + liste);

        LinkedList<String> linked_list = new LinkedList<>();

        linked_list.add("Kartoffel");
        linked_list.add("Tomaten");
        linked_list.add("Rote Beete");
        linked_list.add("Kartoffel");
        linked_list.add("Tomate");

        //linked_list.removeFirst(); // entfernt das erste Element aus der verketteten Liste.

        System.out.println("LinkedList: " + linked_list);

        HashSet<String> set = new HashSet<>();
        // Dublikate werden eliminiert.
        set.add("Kartoffel");
        set.add("Tomaten");
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("Rote Beete");
        set.add("Kartoffel");
        set.add("Tomaten");
        set.add("Rote Beete");

        System.out.println("HashSet: " + set);

        ArrayList<String> set_liste = new ArrayList<>(set);

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Fritz Mueller", 20);
        map.put("Anne Marie", 23);
        map.put("Jakob B.", 70);

        //Iterieren durch die Keys:
        for(String s : map.keySet()){
            System.out.println(s);
        }
        //Iterieren durch die Values:
        for(int i : map.values()){
            System.out.println(i);
        }
        //Iterieren durch die gesamten Einträge:
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " ist " + e.getValue() + " Jahre alt.");
        }

    }
}
