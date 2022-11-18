package customgenerictypes;

public interface Accounttable<T> {
    T getId();
    T setId();
    void setId(T id);
    void setSum(int sum);
    int getSum();
}
