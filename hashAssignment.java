import java.util.HashMap;

public class hashAssignment {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        map.put(4, "Orange");
        map.put(5, "Grapes");

        System.out.println("Initial Map: " + map);

        System.out.println("Value for key 3: " + map.get(3));

        map.remove(2);
        System.out.println("After removing key 2: " + map);

        System.out.println("Size of map: " + map.size());
    }
}