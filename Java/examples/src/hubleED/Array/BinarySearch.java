package src.hubleED.Array;

public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = new int[] {1, 2, 3, 5, 6, 7, 8, 9, 10, 11};

        System.out.println(binarySearch(numbers, 7));
    }

    public static boolean binarySearch(int[] arr, int number) {
        int start = 0;
        int end = arr.length - 1;
        int steps = 0;

        while (start < end ) {
            steps++;
            int mid = start + (end - start) / 2;

            if(arr[mid] == number) {
                System.out.println("steps: " + steps);
                return true;
            }else if(arr[mid] < number) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return false;
    }
}
