import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Object o = new Scanner(System.in); // К переменной Object можно присвоеть объект любого типа.
        Scanner scanner = null; // Инициализация
        if (o instanceof Scanner) scanner = (Scanner)o; //Проверяет класс при приобразовании объекта tru\false
        if (scanner != null){ //Проверка
            scanner.nextInt();
        }
        Object o1 = new String(); // Вкладываем другие типы данных.
        Object o2 = new Integer(15); // Вкладываем другие типы данных.


    }


}