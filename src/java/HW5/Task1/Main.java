package src.java.HW5.Task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listOfInt = Arrays.asList(5,3,4,7,8,5,2,3,7);
        int sum = listOfInt.stream()
                        .distinct()
                        .filter(a -> a % 2 == 0)
                        .reduce(0, (acc, a) -> acc + a);

        System.out.println(sum);
    }
}
