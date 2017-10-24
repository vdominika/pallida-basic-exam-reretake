import java.util.ArrayList;
import java.util.Arrays;

public class Merger {
    public static void main(String[] args) {


        System.out.println(merger(Arrays.asList("kutya", "macska", "kecske"),
                                           Arrays.asList("bokor", "tolgy", "fenyo")));

        public void merger(ArrayList<String> elso, ArrayList<String> masodik){

    }
        ArrayList<String> elso = new ArrayList<>(Arrays.asList("kutya", "macska", "kecske"));
        ArrayList<String> masodik = new ArrayList<>(Arrays.asList("bokor", "tolgy", "fenyo"));

        ArrayList<String> order = new ArrayList<>();

        for (int i = 0; i < elso.size(); i++) {
            order.add(elso.get(i) + ", " + masodik.get(i));
        }
    }

}
