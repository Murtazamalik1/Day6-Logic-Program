package logicprogram;

import java.util.Random;
import java.util.Scanner;
public class LogicProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long start, end;
        double time;
        System.out.println("Type any character to start the stopwatch");

        char s = sc.next().charAt(0);
        start = System.currentTimeMillis();
        System.out.println("Type any character to stop the stopwatch");

        char m = sc.next().charAt(0);
        end = System.currentTimeMillis();
        time = (end - start) / 1000.0;
        System.out.println("Elapsed Time between Start and Stop =  " + time);
    }
}
