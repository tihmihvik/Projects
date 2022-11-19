import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
         cats[0] = new Cat("Tomas");
         cats[1] = new Cat("Begemat");
         cats[2] = new Cat("Filipp Marcovich");

         cats[1] = null;
         System.out.println(Arrays.toString(cats));

        ArrayList<Cat> catsList = new ArrayList<>();
        for (Cat cat : cats) {
            catsList.add(cat);
        }

        catsList.add(new Cat("Begemot2"));
        System.out.println(catsList.toString());



    }
}