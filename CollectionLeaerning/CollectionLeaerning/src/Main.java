import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//         Array
        /*Cat[] cats = new Cat[3];
         cats[0] = new Cat("Tomas");
         cats[1] = new Cat("Begemat");
         cats[2] = new Cat("Filipp Marcovich");

//         cats[1] = null;
         System.out.println(Arrays.toString(cats));*/
// ArrayList
        /*ArrayList<Cat> catsList = new ArrayList<>();
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
        System.out.println(catsList.toString());*/

// LinkedList
        /*String str1 = new String("Меня зовут Михаил");
        String str2 = new String("Hello world");
        String str3 = new String("Я люблю Java");

        LinkedList<String> mihail = new LinkedList<>();
        mihail.add(str1);
        mihail.add(str2);
        mihail.add(str3);
        System.out.println(mihail);
        mihail.remove(1);
        System.out.println(mihail);*/

// LinkedList на практике

        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("ferrari Spider");
        Car bugatti = new  Car("Хорошая");
        Car mersedes = new Car("Тоже не плохая");
        cars.addAll(Arrays.asList(ferrari, bugatti, mersedes));
        System.out.println(cars);
        cars.addFirst(new Car("Зелёная"));
        System.out.println(cars);
        cars.addLast(new Car("Красная"));
        System.out.println(cars);
        System.out.println(cars.pollFirst());
        System.out.println(cars);

    }
}