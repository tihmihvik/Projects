package customgenerictypes;

public class Account {
    private int id;
    private int sum;

    public Account(int id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
