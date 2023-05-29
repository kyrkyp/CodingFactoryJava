package gr.aueb.cf.ch6;

public class MissingElement {
    public static void main(String[] args) {
        int [] arr = {5, 1, 2, 3};
        int missing = getMissing(arr);
        System.out.println("The missing element is " + missing);
    }

    public static int getMissing(int[] arr) {
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int j : arr) {
            arrSum += j;
        }
        return sum - arrSum;
    }
}
