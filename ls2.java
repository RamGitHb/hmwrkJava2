import java.util.Arrays;
public class ls2 {
    public static void main(String[]args) {

        final int[]SortedArray={1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int key = Arrays.binarySearch(SortedArray, 8);
        System.out.println(key);
    }
}