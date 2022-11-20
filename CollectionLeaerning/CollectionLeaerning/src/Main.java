import java.lang.reflect.Array;
import java.security.Key;
import java.util.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
//         Array
        /*Cat[] cats = new Cat[3];
         cats[0] = new Cat("Tomas");
         cats[1] = new Cat("Begemot");
         cats[2] = new Cat("Filipp Marcovich");

//         cats[1] = null;
         System.out.println(Arrays.toString(cats));*/
// ArrayList
        /*ArrayList<Cat> catsList = new ArrayList<>();
        for (Cat cat : cats) {
            catsList.add(cat);
        }

        catsList.add(new Cat("Begemot"));
//        catsList.remove(1);
        Cat cat = catsList.get(0);
        System.out.println(cat);
        System.out.println(catsList.indexOf(cat));
        catsList.add(2, cat);
        System.out.println(catsList.toString());
        catsList.set(2, new Cat("Меня сюда вставили"));
        System.out.println(catsList.toString());
        System.out.println(catsList.size());
//        catsList.removeAll(Arrays.asList(cats, catsList.get(2)));
        System.out.println(catsList.toString());
//        catsList.removeAll(catsList);
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

        /*LinkedList<Car> cars = new LinkedList<>();
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
        System.out.println(cars);*/

//         ArrayList vs LinkedList


        /*List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5000000; i++){
            list.add(i);

        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            list.add(2000000, Integer.MAX_VALUE);
        }
        System.out.println("Время работы" + (System.currentTimeMillis() - start));

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5000000; i++){
            list2.add(i);

        }
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            list2.add(2000000, Integer.MAX_VALUE);
        }
        System.out.println("Время работы" + (System.currentTimeMillis() - start2));*/

//         Set

        /*Set<String> states = new HashSet<>();
        states.add("Франция");
        states.add("Италия");
        states.add("Германия");
        states.add("Германия");
        boolean IsAdded = states.add("Германия");
        System.out.println("Добавление Германия: " + IsAdded);
        System.out.println("Set contains" + states + states.size());
        states.remove("Франция");
        System.out.println("Set contains" + states + states.size());
        HashSet<Cat> catsHashSet = new HashSet<>(catsList);
// TreSet
        TreeSet<Cat> catTreeSet = new TreeSet<>(catsList);
        System.out.println(catsHashSet);
        System.out.println(catTreeSet);*/

//         Map

        Map<Integer, String > statsMap = new  HashMap<>();
        statsMap.clear();
        statsMap.put(1, "Германия");
        statsMap.put(2, "Италия");
        statsMap.put(3, "Франция");
        statsMap.put(4, "Россия");
        statsMap.remove(3);


        for (Map.Entry<Integer, String> item : statsMap.entrySet()){
            System.out.printf("|Key: %d |value: %s \n", item.getKey(), item.getValue());
        }

        String  first = statsMap.get(2);
        System.out.println(first);
        System.out.println(statsMap.keySet());

    }
}