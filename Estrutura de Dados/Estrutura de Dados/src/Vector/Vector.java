package Vector;

import java.util.ArrayList;

public class Vector {
    public static void main(String[] args) {
        // Vector.Vector: 100% - Sincronizado
        // ArraysList 50%

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(0);
        list.indexOf(20);
        list.contains(20);
        list.toArray();

        System.out.println(list);
    }
}
