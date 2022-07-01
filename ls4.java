public class ls4 {
    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array,  0, temp,  0, length);
        temp[length] = item;
        return temp;
    }
    public static void main(String[]args) {
        int[] a = new int[] {1};
        for (int i : a) {System.out.println(i); }
        a = AddItem(a, 3);
        String format;
        for (int k : a) {System.out.printf( "%d ", k); }
        System.out.println("");
        a = AddItem(a,  6);
        for (int j : a) {System.out.printf( "%d ", j); }
        System.out.println("");
    }
}