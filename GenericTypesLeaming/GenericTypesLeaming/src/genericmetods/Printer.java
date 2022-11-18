package genericmetods;

public class Printer {
    public <T> void Print(T[] items) {

        for (T item : items){
            System.out.println(item);
        }
    }
}
