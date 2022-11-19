public class Car {
    String madel;

    public Car(String madel) {
        this.madel = madel;
    }

    public String getMadel() {
        return madel;
    }

    public void setMadel(String madel) {
        this.madel = madel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "madel='" + madel + '\'' +
                '}';
    }
}
