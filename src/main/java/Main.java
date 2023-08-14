import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Build a scanner
        Scanner scanner = new Scanner(System.in);

        //Prompt and store double amount
        System.out.print("Enter the amount of data: ");
        double amount = scanner.nextDouble();

        //Prompt and store String unit
        System.out.print("Enter the unit of data (bytes, kilobytes, megabytes, gigabytes): ");
        String unit = scanner.next();

        //Prompt and store download speed (in megabits)
        System.out.print("Enter the download speed (in megabits): ");
        double speed = scanner.nextDouble();

        //Build a Data object with these three values
        Data data = new Data(amount, unit, speed);

        //Print out the data Object with your toString();
        System.out.println(data.toString());
    }
}

