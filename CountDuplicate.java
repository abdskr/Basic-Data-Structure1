public class CountDuplicate {
    public static void main(String[] args) {

        int[] numbers = {21, 9, 17, 43, 9, 15, 21, 6, 38, 6};

        int duplicateCount = 0;

        System.out.print("Array values are: ");

        // Display all array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }

        // Count duplicate occurrences
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicateCount++;
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("The count of duplicate values is: " + duplicateCount);
    }
}