import java.util.Scanner;

public class MetodPactis {

    public static void main(String[] args){
        double name1 = getName();
        double name2 = getName();
        char operation = getOperation();
        double result = calc(name1, name2, operation);
        System.out.println("Результат:" + result);
    }

    private static double calc(double name1, double name2, char operation) {
        switch (operation){
            case '+':
                return name1+name2;
            case '-':
                return name1-name2;
            case  '*':
                 return name1*name2;
            default: return 0;
        }
    }
    private static char getOperation() {
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            default:
                return '+';
        }
    }

    private static double getName() {
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
}
