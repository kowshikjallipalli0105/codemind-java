import java.util.Scanner;

public class ClockAngleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the time in HH:MM format
        //System.out.print("Enter the time (HH:MM): ");
        String time = scanner.next();

        // Parse the hours and minutes
        String[] timeParts = time.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        // Validate input
        if (hours < 0 || hours > 12 || minutes < 0 || minutes >= 60) {
            System.out.println("Invalid input. Please enter a valid time.");
            return;
        }

        // Calculate the angle between the hands
        double angle = calculateClockAngle(hours, minutes);

        // Display the result
        System.out.println(angle);

        // Close the scanner to release resources
        scanner.close();
    }

    // Function to calculate the angle between the hands
    private static double calculateClockAngle(int hours, int minutes) {
        final int MINUTES_PER_HOUR = 60;
        final int DEGREES_PER_HOUR = 360 / 12;
        final int DEGREES_PER_MINUTE = 360 / 60;

        double hourAngle = (hours % 12 + minutes / (double) MINUTES_PER_HOUR) * DEGREES_PER_HOUR;
        double minuteAngle = minutes * DEGREES_PER_MINUTE;

        double angle = Math.abs(hourAngle - minuteAngle);

        // Ensure the smaller angle is considered
        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle;
    }
}
