public class DaysAlivePrinter
{
    public static void main(String[] args)
    {
        // This program calculates the number of days
        // that Sally Ride lived.
        // Initialize birthDay variable
        Day birthDay = new Day(1951, 5, 26);
        // Initialize lastDay variable
        Day lastDay = new Day(2012, 7, 23);
        // Print the last day
        System.out.print("LastDay: ");
        System.out.println(lastDay.toString());
        // Calculate the number of days Alive and assign to int
        int daysAlive = lastDay.daysFrom(birthDay);
        // Print days alive
        System.out.print("Days alive: ");
        System.out.println(daysAlive);
    }
}
