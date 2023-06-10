//10.Get all found element index (Search Element) , store the result in an array.

package recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class find_indexes {
    public static void main(String[] args) {
        int[] arr = {10,2,3,6,1,4,2,5,2,3,0,2,1,3,2,5,2,7,2};
        int searchElement = 2;

        int[] indexes = findAllIndexes(arr, searchElement);
        System.out.println("Indexes of " + searchElement + ": " + Arrays.toString(indexes));
    }

    public static int[] findAllIndexes(int[] arr, int searchElement) {
        return findAllIndexesRecursive(arr, searchElement, 0, new ArrayList<>());
    }

    private static int[] findAllIndexesRecursive(int[] arr, int searchElement, int currentIndex, List<Integer> indexes) {
        if (currentIndex == arr.length) {
            int[] result = new int[indexes.size()];
            for (int i = 0; i < indexes.size(); i++) {
                result[i] = indexes.get(i);
            }
            return result;
        }

        if (arr[currentIndex] == searchElement) {
            indexes.add(currentIndex);
        }

        return findAllIndexesRecursive(arr, searchElement, currentIndex + 1, indexes);
    }
}
