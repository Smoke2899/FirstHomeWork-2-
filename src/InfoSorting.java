public class InfoSorting {
    public static void bubbleSort(int[] arr) {
        int l = arr.length;
        for (int a = 0; a < l - 1; a++) {
            for (int b = 0; b < l - a - 1; b++) {

                if (arr[b] > arr[b + 1]) {
                    int temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int b : arr) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {68, 34, 28, 11, 29, 14, 90, 24, 19, 440, 192};

        System.out.println("Array Without Sorting:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}