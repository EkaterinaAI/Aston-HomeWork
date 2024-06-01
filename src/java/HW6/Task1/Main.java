package src.java.HW6.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        System.out.println(checkingInputValues("Kate", "123", "123"));
    }

    public static boolean checkingInputValues(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {

        boolean result = true;
        List<String> exceptionsForLogin = new ArrayList<>();
        List<String> exceptionsForPassword = new ArrayList<>();

        //проверка логина
        if (login.isEmpty()) {
            exceptionsForLogin.add("введите логин");
        } else {
            if (login.length() >= 20) exceptionsForLogin.add("длина логина больше 20 символов");
            if (login.contains(" ")) exceptionsForLogin.add("логин содержит пробелы");
        }

        //проверка пароля
        if(password.isEmpty()) {
            exceptionsForPassword.add("введите пароль");
        } else {
            if (password.length() >= 20) exceptionsForPassword.add("длина пароля больше 20 символов");
            if (password.contains(" ")) exceptionsForPassword.add("пароль содержит пробелы");
            if (!password.matches(".*\\d.*")) exceptionsForPassword.add("пароль должен содержать хотя бы одну цифру");
            if (password != confirmPassword) exceptionsForPassword.add("пароль не совпадает с подтверждением пароля");
        }

        try {
            if (!exceptionsForLogin.isEmpty()) {
                result = false;
                throw new WrongLoginException(exceptionsForLogin.stream().collect(Collectors.joining(", ")));
            }

        } catch (WrongLoginException e) {
            e.printStackTrace();
        }

        try {
            if (!exceptionsForPassword.isEmpty()) {
                result = false;
                throw new WrongPasswordException(exceptionsForPassword.toString());
            }
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }

        return result;
    }
}
