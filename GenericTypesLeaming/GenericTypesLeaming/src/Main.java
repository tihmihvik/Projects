import java.util.ArrayList;
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
        ArrayList numbers = new ArrayList(); // сохраняет Object
        for (int i = 10; i < 10; i++){ // сохранять в коллекцию числа 10,2О..
        numbers.add(i*10);
            //numbers.add(i*10.4F); - ошибка.

        }
        int sum = 0;
        for (Object o : numbers){
            sum = sum + (Integer) o;
        }
        System.out.println(sum);


    }


}