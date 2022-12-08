package Recursion;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int end,step;
        System.out.println("Enter end value: ");
        end = keyboard.nextInt();
        System.out.println("Enter step value: ");
        step = keyboard.nextInt();
        
        System.out.println(IncrementAdder.AddSequence(end, step));
    }
}