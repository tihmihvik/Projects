import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
      public static void main(String[] args) //Инициализация переменных
      {
// Считаем сумму чисел
      /*

        System.out.println("Введите два числа и я посчитаю их сумму:"); //Выводим сообщение в консоль
        System.out.println(" ");
        Double a = .0, b = .0; //Объявление двух переменных
        Scanner in = new Scanner(System.in); //Ввод чисел через точку, а не через запятую
        in.useLocale(Locale.US);
        System.out.print("Введите сюда первое число:"); //Ввод первого числа
        a = in.nextDouble();
        System.out.print("Введите сюда второе число:"); //Ввод второго числа
        b = in.nextDouble();
        System.out.println("Сумма ваших чисел ровна:" + (a + b)); //Сумма первого и второго чисел
*/
// Проверим чётное/нечётное
      /*
          Scanner in = new Scanner(System.in);
          Double value = in.nextDouble();
          if (value%2 == 0){
              System.out.println("Ваше число чётное.");
          }
          else System.out.println("Ваше число не чётное.");
*/
// Типы
      /*
//Integer g = c(a + b)/c;
//a + c(b + c));
       Long x = 100000;
//Int размер 32 бита, int должен быть не более 2^31
// long размер 64 бита
      System.out.println(x*x);
      System.out.println(x);
      */
// Операции.
       /*
            System.out.println(5 / 3); //можем разделить только один раз т.к. int
            System.out.println((double) 5); //5.0 т.к double
            System.out.println((double) 5 / 3); //можем разделить полностью т.к. double
            */
// Минуты
       /*
     Integer minutes = 10;
     System.out.println(minutes++);
     System.out.println(minutes);
     minutes -= 1;
      System.out.println(minutes);
      */
// Char
       /*
            Character a = 8667;
            Character b = '\u21DB';
            Character c = '⇛';
            System.out.println(a);
            System.out.println(b);
            System.out.println((int)c);
            */
// Типы операций
        /*
== Сравнивание
> больше
< меньше
>= больше или равно
<= меньше или равно
!= не равно
! отрицание
|| ИЛИ
&& И
true false

*/
// boolean
        /*
            boolean a = true;
            boolean b = false;
            int x = 5;
            boolean b1 = x>9; // принимает true из правой части
            boolean b2 = b1 && (x<20); // принимает true если x>0 и x<20
            */
// TТернарные операции
        /*

// результат = выражение ? значение1 : значение2;
int a = 10;
int b = 20;
int max = (a>b ? a: b);
System.out.println(max);
System.out.println(a > b ? a*a: "Ошибка");
*/
// задача: Определение попадания точки в треугольник.
        /*
// Задача №112165
          Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println(x<2 && y<x && (x*x+y*y)>4 && y>0 ? "Да": "Нет");*/
        /*
// Задача №112167
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println((y<2 - x*x && y>x && y<0) || (y<2 - x*x && y>0 && x>=0) ? "Да": "Нет");
*/
// if else
         /*

        Scanner in = new Scanner(System.in);
        int x1, x2;
        x1 = in.nextInt();
        if (x1>9 && x1<100) {
            x2 = x1 % 10;
            x1 = x1 / 10;
            System.out.println(x1 + ":" + x2);
            if (x1 == x2) {
                System.out.println("В числе одинаковые цифры");
            } else if (x2 < x1) {
                System.out.println("Первое число больше второго");
            } else System.out.println("Второе число больше первого");
        }else System.out.println("Ваше число не двухзначное.");
*/
// switch case
         /*
            Scanner in = new Scanner(System.in);
            switch (in.nextInt()) {
                  case 1:
                        System.out.println(" январе 31 день.");
                        break;
                  case 2:
                        System.out.println("В феврале 28 дней");
                        break;
                  case 3:
                        System.out.println("В марте 31 день");
                        break;
                  case 4:
                        System.out.println("В апреле 30 дней");
                        break;
                  case 5:
                        System.out.println("В мае 31 день");
                        break;
                  case 6:
                        System.out.println("В июне 30 дней");
                        break;
                  case 7:
                        System.out.println("В июле 31 день");
                        break;
                  case 8:
                        System.out.println("В августе 31 день");
                        break;
                  case 9:
                        System.out.println("В сентябре 30 дней");
                        break;
                  case 10:
                        System.out.println("В октябре 31 день");
                        break;
                  case 11:
                        System.out.println("В ноябре 30 дней");
                        break;
                  case 12:
                        System.out.println("В декабре 31 день");
                        break;
                  default:
                        break;


            }*/
// Блоки видимости
// Входит ли цифра три в двухзначное число
          /*
Scanner in = new Scanner(System.in);
int x1, x2;
x1 = in.nextInt();
x2 = x1 % 10;
x1 = x1 / 10;
if (x1 == 3 || x2 == 3){
      System.out.println("В числе есть цифра 3");
}
else {
      System.out.println("В числе нет цифры 3");
}*/
// Цикл - while
          /*

int x = 0;
while (x < 5){
      System.out.print(x + " ");
      x++;
}
*/
// Цикл - do while
          /*

            int x = 0;
            do {
                  System.out.print(x + " ");
                  x++;
            }
            while (x < 5);
            System.out.println(x);

*/
// Автобусы и мосты.
           /*
Scanner in = new Scanner(System.in);
int i = 1;
int t = 0;
int n = in.nextInt();
while (i <= n){
      t = in.nextInt();
      if (t < 437){
            System.out.println("Авария " + i);
            break;
      }i++;
      }
 if (t > 437){
       System.out.println("Аварий небыло.");
}*/





      }

}