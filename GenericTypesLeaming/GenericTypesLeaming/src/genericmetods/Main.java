package genericmetods;

public class Main {
    public static void main(String[] args){
        Printer printer = new Printer();
        String[] strings = {"Андрей", "Сергей", "Михаил", "Ольга"};
        Integer[] integers = {20, 30, 22, 33};
       printer.<String>Print(strings);
       printer.<Integer >Print(integers);

    }
}
