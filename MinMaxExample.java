import java.util.Scanner;

public class MinMaxExample {

    
    public static int findMin(int[] arr) {
        int min = arr[0];  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

   
    public static int findMax(int[] arr) {
        int max = arr[0];  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    
    public static int[] findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max}; 
    }

    public static void main(String[] args) {

        
        if (args.length > 0) {

            int[] commandLineArray = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                commandLineArray[i] = Integer.parseInt(args[i]);
            }

            System.out.println("From Command Line:");
            System.out.println("Minimum: " + findMin(commandLineArray));
            System.out.println("Maximum: " + findMax(commandLineArray));
        }

        
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter number of elements: ");
        int n = scanner.nextInt();

        int[] scannerArray = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            scannerArray[i] = scanner.nextInt();
        }

        System.out.println("\nFrom Scanner:");
        System.out.println("Minimum: " + findMin(scannerArray));
        System.out.println("Maximum: " + findMax(scannerArray));

       
        int[] result = findMinAndMax(scannerArray);

        System.out.println("\nUsing one method:");
        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);

        scanner.close();
    }
}
