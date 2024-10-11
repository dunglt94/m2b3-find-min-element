public class NumberArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 15, 7, 13, 9, 1};
        int index = findMin(arr);
        System.out.println("The min element is " + arr[index] + ", at position " + (index + 1));
    }

    public static int findMin(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
