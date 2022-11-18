package customgenerictypes;

public class Account implements Accounttable<String> {
    private String id;
    private int sum;

    public Account(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    @Override
    public String setId() {
        return null;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
