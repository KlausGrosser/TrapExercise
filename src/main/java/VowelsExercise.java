package main.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String input = sc.nextLine();
        System.out.println(noVowels(input));
    }
public static String noVowels(String str) {
    String regex = "[aeiouAEIOU]";
    String result;
    return result = str.replaceAll(regex, "");
}

}
