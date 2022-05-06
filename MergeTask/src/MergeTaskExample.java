import java.util.Arrays;

public class MergeTaskExample {
  public static void main(String[] args) {
    int[] a = new int[]{1, 5, 70, 2, 6, 65, 71};
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(merge(a, 0, 3, 6)));
  }

  public static int[] merge(int[] array, int p, int q, int r) {
    q--;
    int[] sortedArray = new int[array.length];
    int length = array.length;
    int indexL = p;
    int indexR = q + 1;
    int leftSize = q - p;
    int rightSize = r;
    for (int i = 0; i < length; i++) {
      if (indexL <= leftSize && indexR >= rightSize) {
        sortedArray[i] = array[indexL++];
        continue;
      }
      if (indexL >= leftSize && indexR <= rightSize) {
        sortedArray[i] = array[indexR++];
        continue;
      }
      if (indexL < leftSize && indexR < rightSize) {
        if (array[indexL] <= array[indexR]) {
          sortedArray[i] = array[indexL++];
        } else {
          sortedArray[i] = array[indexR++];
        }
      }
    }
    return sortedArray;
  }
}
