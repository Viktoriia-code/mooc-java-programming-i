import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static int indexOfSmallest(int[] array){
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex+1; i < table.length; i++) {
            if (table[i] < table[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int number = array[index2];
        array[index2] = array[index1];
        array[index1] = number;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int minIndex = indexOfSmallestFrom(array,i);
            swap(array, i, minIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
