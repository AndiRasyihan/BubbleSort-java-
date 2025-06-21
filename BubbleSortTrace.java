public class BubbleSortTrace {
    public static void main(String[] args) {
        int[] arr = {5, 9, 4, 2, 8, 1};
        int n = arr.length;

        System.out.print("Array sebelum Bubble Sort: ");
        printArray(arr);

        for (int i = 0; i < n - 1; i++) {
            System.out.println("\ni = " + i + ", batas perulangan j = " + (n - i - 1));
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  Bandingkan arr[" + j + "]=" + arr[j] + " dan arr[" + (j+1) + "]=" + arr[j+1]);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.print(" → tukar → ");
                    printArray(arr);
                } else {
                    System.out.println(" → tidak ditukar");
                }
            }
        }
        System.out.print("\nArray setelah Bubble Sort: ");
        printArray(arr);
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}