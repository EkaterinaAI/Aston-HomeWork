package src.java.HW9;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        readKeyFromConsoleAndInitPlanet();
    }

    private static void readKeyFromConsoleAndInitPlanet() {
        Planet thePlanet = null;
        boolean exit = true;

        while(true) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            //по хэш-коду видно, что это один и тот же объект
            if (Planet.SUN.equals(str)) {
                thePlanet = Sun.getInstance();
                System.out.println(thePlanet.toString());
            } else if (Planet.MOON.equals(str)) {
                thePlanet = Moon.getInstance();
                System.out.println(thePlanet.toString());
            } else if (Planet.EARTH.equals(str)) {
                thePlanet = Earth.getInstance();
                System.out.println(thePlanet.toString());
            } else {
                System.out.println("Повторите ввод");
            }
        }
    }
}
