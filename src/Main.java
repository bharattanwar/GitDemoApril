import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Car class demo");
        Car c1 = new Car(100000,100);
        Car c2 = new Car(500000,300);
        Car c3 = new Car(700000,500);
        Car c4 = new Car(300000,200);
        Car c5 = new Car(600000,700);
        List<Car> cars = new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5));
        cars.sort(new carpricecomparator());
        System.out.println(cars);

    }
}