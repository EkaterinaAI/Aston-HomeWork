package src.java.HW3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку");
        String str3 = scanner.nextLine();

        minMaxString(str1, str2, str3);
        lessThenAvgString(str1, str2, str3);
        System.out.println("Первая строка с различными символами: " + diffCharString(str1, str2, str3));
        duplicateEachChar(str1);
    }

    public static void minMaxString(String str1, String str2, String str3) {

        String shortestString = str1;
        String longestString = str1;

        // поиск минимальной строки, без учета равенства (в задании не указано)
        if (str2.length() < shortestString.length()) {
            shortestString = str2;
        }
        if (str3.length() < shortestString.length()) {
            shortestString = str3;
        }

        // поиск максимальной строки, без учета равенства (в задании не указано)
        if (str2.length() > longestString.length()) {
            longestString = str2;
        }
        if (str3.length() > longestString.length()) {
            longestString = str3;
        }

        System.out.println("Минимальная строка: " + shortestString + ". Длина: " + shortestString.length());
        System.out.println("Максимальная строка: " + longestString + ". Длина: " + longestString.length());
    }
    public static void lessThenAvgString(String str1, String str2, String str3) {

        double avgLength = (str1.length() + str2.length() + str3.length()) / 3.0;

        if (str1.length() < avgLength) {
            System.out.println("Длина строки меньше среднего значения: " + str1 + ". Длина: " + str1.length());
        }

        if (str2.length() < avgLength) {
            System.out.println("Длина строки меньше среднего значения: " + str2 + ". Длина: " + str2.length());
        }

        if (str3.length() < avgLength) {
            System.out.println("Длина строки меньше среднего значения: " + str3 + ". Длина: " + str3.length());
        }
    }

    public static String diffCharString(String str1, String str2, String str3) {

        String result = "";

        String[] arrayStr1 = str1.split("");
        Set<String> hashSet1 = new HashSet<>(Arrays.asList(arrayStr1));

        if (hashSet1.size() == arrayStr1.length) {
            result = str1;
            return result;
        }

        String[] arrayStr2 = str2.split("");
        Set<String> hashSet2 = new HashSet<>(Arrays.asList(arrayStr2));

        if (hashSet2.size() == arrayStr2.length) {
            result = str2;
            return result;
        }

        String[] arrayStr3 = str3.split("");
        Set<String> hashSet3 = new HashSet<>(Arrays.asList(arrayStr2));

        if (hashSet3.size() == arrayStr3.length) {
            result = str3;
            return result;
        }

        return result;
    }

    public static void duplicateEachChar(String str1) {

        String[] arrayStr = str1.split("");
        List<String> listString = new LinkedList<>(Arrays.asList(arrayStr));

        for (int i = 0; i < listString.size(); i += 2) {
            String str = listString.get(i);
            listString.add(i,str);
        }

        for (String s: listString) {
            System.out.print(s);
        }
    }
}
