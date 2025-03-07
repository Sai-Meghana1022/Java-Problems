import java.util.Scanner;

public class TheaterSeating {
    public static void main(String[] args) {
        int[][] seats = {
            {0, 0, 1, 0, 1},
            {1, 1, 0, 0, 0},
            {0, 1, 1, 0, 1},
            {1, 0, 0, 1, 0},
            {0, 0, 1, 0, 0}
        };

        markSeatOccupied(seats, 2, 2);
        System.out.println("Total available seats: " + countAvailableSeats(seats));
        displaySeatingArrangement(seats);
    }

    // Mark a specific seat as occupied
    public static void markSeatOccupied(int[][] seats, int row, int col) {
        if (seats[row][col] == 0) {
            seats[row][col] = 1;
            System.out.println("Seat at (" + row + ", " + col + ") marked as occupied.");
        } else {
            System.out.println("Seat already occupied.");
        }
    }

    // Count available (empty) seats
    public static int countAvailableSeats(int[][] seats) {
        int count = 0;
        for (int[] row : seats) {
            for (int seat : row) {
                if (seat == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // Display the seating arrangement
    public static void displaySeatingArrangement(int[][] seats) {
        System.out.println("Seating Arrangement:");
        for (int[] row : seats) {
            for (int seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }
}
