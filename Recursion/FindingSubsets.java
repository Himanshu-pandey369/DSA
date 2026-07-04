public class FindingSubsets {

    public static void printSubsets(int[] arr, int index, String current) {
        if (index == arr.length) {
            System.out.println("{" + current.trim() + "}");
            return;
        }

        // Exclude current element
        printSubsets(arr, index + 1, current);

        // Include current element
        printSubsets(arr, index + 1, current + arr[index] + " ");
    }

    public static void main(String[] args) {
        int[] set = {1, 2, 3};
        printSubsets(set, 0, "");
    }
}