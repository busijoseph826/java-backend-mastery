/*Task 2: Pair<K,V>

Store key-value pairs.*/

class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println(key + " -> " + value);
    }
}

public class Main {

    public static void main(String[] args) {

        Pair<Integer, String> student =
                new Pair<>(101, "Joseph");

        student.display();
    }
}