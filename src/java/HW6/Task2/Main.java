package src.java.HW6.Task2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        //запись строки в файл
        try (FileOutputStream fos = new FileOutputStream("tms.txt")) {
            fos.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //чтение строки из файла
        try (FileInputStream fis = new FileInputStream("tms.txt")) {
            byte[] result = new byte[fis.available()];
            fis.read(result);

            String sResult = new String(result);
            sResult = sResult.replaceAll(" ", "_");
            System.out.println(sResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
