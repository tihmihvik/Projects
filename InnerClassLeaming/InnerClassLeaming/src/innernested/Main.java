package innernested;

public class Main {
    public static void main(String[] args){
        Parcel parcel = new Parcel();
        Parcel.Destination destination = parcel.new Destination();
        destination.doSmth();


    }
}
 class Parcel{
    public String recepient;
    private int mass;

    class Destination {
        public String strit;
        private int homeNumber;
        private int roomNumber;

        public void doSmth(){
            System.out.println(mass);
        }
    }}


