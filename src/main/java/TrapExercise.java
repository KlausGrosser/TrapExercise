package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class TrapExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message to see if there are any traps inside it: ");
        String input = sc.nextLine();
        System.out.println(trapFinder(input));

    }

    public static String trapFinder(String sourceText){
        Pattern p = Pattern.compile("trap");

        Matcher m = p.matcher(sourceText);

        if(m.find()) {
            System.out.println("BOO!!");
        } else {
            System.out.println("Relax, there's no trap.");
        }
return "Thank you for using TrapFinder";
        }


}
