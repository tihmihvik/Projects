package customgenerictypes;

public class Main {
    public static void main(String[] args){
        Account<Integer> account1 = new Account(12345,500);
        System.out.println(account1.getId());

        Account<String> account2 = new Account("sid2345", 5000);
        System.out.println(account2.getId());

        int a = (account1.getId()) + 10; // Опасное преобразование типов
        System.out.println(a);


    }
}
