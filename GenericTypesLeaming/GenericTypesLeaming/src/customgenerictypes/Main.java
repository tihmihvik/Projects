package customgenerictypes;

public class Main {
    public static void main(String[] args){
        Account account1 = new Account(12345,500);
        System.out.println(account1.getId());

        Account account2 = new Account("sid2345", 5000);
        System.out.println(account2.getId());

        int a = ((Integer) account2.getId()) + 10;
        System.out.println(a);


    }
}
