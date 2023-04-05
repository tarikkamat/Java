import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("5 Nisan 2023 - Java ArrayList || ArrayList ile Integer ekleme ve toplama.");
        System.out.println("5 April 2023 - Java ArrayList || Adding and summing integers with ArrayList.");

        /* Use ArrayList to store the list of integers || ArrayList ile Integer ekleme. */
        List<Integer> myIntegerList = new ArrayList<Integer>();

        /* Add integers to the list || Listeye Integer ekleme. */
        myIntegerList.add(1);
        myIntegerList.add(2);
        myIntegerList.add(3);
        myIntegerList.add(4);
        myIntegerList.add(6);

        /* Print the list || Listeyi yazdırma. */
        System.out.println(myIntegerList);

        /* Print the list with for loop || For döngüsü ile listeyi yazdırma. */
        for (int i = 0; i < myIntegerList.size(); i++) {
            System.out.println(myIntegerList.get(i));
        }


        int sum = 0;

        /* Sum the list with for loop || For döngüsü ile listeyi toplama. */
        for (int i = 0; i < myIntegerList.size(); i++) {
            sum += myIntegerList.get(i);
        }

        System.out.println("Sum of the list: " + sum);

        /* Sum the list with sum() method || sum() metodu ile listeyi toplama. */
        System.out.println("Sum of the list: " + sum(myIntegerList));

    }

    public static Integer sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

}