package hashtables;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        CharFinder finder = new CharFinder();
        var ch = finder.findFirstNonRepeatingChar("a green apple");
        System.out.println(ch);

        //String s = "param " + (param != null ? "not ": "") + "null";





/*        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ertho");
        map.put(2, "John");
        map.put(3, "Mary");
        System.out.println(map);

        for (var item: map.entrySet()) {
            System.out.println(item.getValue());
        } */
    }
}
