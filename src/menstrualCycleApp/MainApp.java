package menstrualCycleApp;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter your name?");
        String name = input.nextLine();

        System.out.print("What is your usual cycle length?");
        int cycleLength = Integer.parseInt(input.nextLine());

        System.out.println("What year did you see your last period? eg., 2024 ");
        String year = input.nextLine();

        System.out.println("What month did you see your last period? eg., 01 ");
        String month = input.nextLine();

        System.out.println("What day did you see your last period? eg., 09 ");
        String day = input.nextLine();

        MenstrualCycleTracker menstrualCycle = new MenstrualCycleTracker();
        menstrualCycle.setName(name);
        String userName = menstrualCycle.getName();

        menstrualCycle.setLastPeriodDate(year, month, day);
        //String lastPeriodDate = String.valueOf(menstrualCycle.getLastPeriodDate());

        String nextPeriodDate = String.valueOf(menstrualCycle.getNextPeriodDate(cycleLength));


        System.out.println("Welcome "+ userName);
        System.out.println("Your next possible period date is "+ nextPeriodDate);



    }
}
