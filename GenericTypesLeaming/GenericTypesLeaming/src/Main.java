import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Object o = new Scanner(System.in); // К переменной Object можно присвоеть объект любого типа.
        Scanner scanner = null; // Инициализация
        if (o instanceof Scanner) scanner = (Scanner)o; //Проверяет класс при приобразовании объекта tru\false
        if (scanner != null){ //Проверка
            scanner.nextInt();
        }
        Object o1 = new String(); // Вкладываем другие типы данных.
        Object o2 = new Integer(15); // Вкладываем другие типы данных.*/
        Object[] objects = {10, "Привет", 3.15}; //Здесь происходит автоупаковка.
        for (Object o : objects){
            if (o instanceof String){
                String s = (String) o;
                System.out.println(s);
            }
        }
        ArrayList<Integer> numbers = new ArrayList(); // сохраняет Object
        for (int i = 0; i < 10; i++){ // сохранять в коллекцию числа 10,2О..
        numbers.add(i*10);
            //numbers.add(i*10.4F); - ошибка.

        }
        int sum = 0;
        for (Integer o : numbers){
            sum = sum + o;
        }
        System.out.println(sum);

        // Generic - Основной тип<Тип параметр>
        // Основной тип<Тип параметр1, Тип параметр2, Тип параметр3 >

        HashMap<Integer, String> map = new HashMap<>();
        map.put(7, "Привет");
        map.put(15, "Hello");

        ArrayList<String> listHello = new ArrayList<>();
        listHello.add("Привет");
        listHello.add("Hi");

        ArrayList<String> listBye = new ArrayList<>();
        listBye.add("Пока");
        listBye.add("Good Bay");

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(listHello);
        list.add(listBye);
        for (ArrayList<String> spisok : list){
            for (String s : spisok){
                System.out.println(s);
            }


        }



    }


}