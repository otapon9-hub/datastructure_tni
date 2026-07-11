import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lastDigit = 9;
        int secondLastDigit = 8;
        int thirdLastDigit = 7;
        int studyDate = 9;
        // ----------------------------------------

        ArrayList<Integer> numbers = new ArrayList<>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int i = 0; i < initial_numbers.length; i++) {
            numbers.add(initial_numbers[i]);
        }
        System.out.println("Initial ArrayList: " + numbers);

        System.out.print("Enter a number to append (เพิ่มต่อท้าย): ");
        int numToAppend = scanner.nextInt();
        numbers.add(numToAppend);

        System.out.print("Enter a number to insert at index " + lastDigit + " (แทรกตามตำแหน่ง): ");
        int numToInsert = scanner.nextInt();
        numbers.add(lastDigit, numToInsert);

        numbers.remove(secondLastDigit);
        System.out.println("After remove at index " + secondLastDigit + "...");

        numbers.set(thirdLastDigit, studyDate);
        System.out.println("After update at index " + thirdLastDigit + " with date " + studyDate + "...");

        System.out.println("-------------------------------------------------");
        System.out.println("Final numbers in ArrayList = " + numbers);

        scanner.close();
    }
}