import java.util.Scanner;

public class user_get_index {
    public static void main(String[] args) {
        int[] arr = {5, 15, 25, 35, 45};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Value found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Value not found");
        }
    }
}