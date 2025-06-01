package com.Conditional_Loops;

public class EvenDaysInAugust {
    public static void main(String[] args) {
        int daysInAugust = 31;
        int evenDays = 0;

        for (int day = 1; day <= daysInAugust; day++) {
            if (day % 2 == 0) {
                evenDays++;
            }
        }

        System.out.println("Kunal can go out on " + evenDays + " days in August.");
    }
}
