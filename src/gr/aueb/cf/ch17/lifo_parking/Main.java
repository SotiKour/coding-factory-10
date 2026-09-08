package gr.aueb.cf.ch17.lifo_parking;

public class Main {

    public static void main(String[] args) {
        LifoParking lifoParking = new LifoParking();

        lifoParking.addCar("IAE 2323");
        lifoParking.addCar("ZAO 1391");
        lifoParking.addCar("ΧΔ 3444");

        lifoParking.traverse();

        String car = lifoParking.removeCar();
//        System.out.println(car);

        lifoParking.traverse();

        car = lifoParking.removeCar();
//        System.out.println(car);

        lifoParking.traverse();


    }
}
