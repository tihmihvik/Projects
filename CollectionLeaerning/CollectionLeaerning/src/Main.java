import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
         cats[0] = new Cat("Tomas");
         cats[1] = new Cat("Begemat");
         cats[2] = new Cat("Filipp Marcovich");

//         cats[1] = null;
         System.out.println(Arrays.toString(cats));

        ArrayList<Cat> catsList = new ArrayList<>();
        for (Cat cat : cats) {
            catsList.add(cat);
        }

        catsList.add(new Cat("Begemot2"));
        catsList.remove(1);
        Cat cat = catsList.get(0);
        System.out.println(cat);
        System.out.println(catsList.indexOf(cat));
        catsList.add(2, cat);
        System.out.println(catsList.toString());
        catsList.set(2, new Cat("Меня сюда вставили"));
        System.out.println(catsList.toString());
        System.out.println(catsList.size());

        catsList.removeAll(Arrays.asList(cats, catsList.get(2)));
        System.out.println(catsList.toString());

        catsList.removeAll(catsList);
        System.out.println(catsList.toString());



    }
}