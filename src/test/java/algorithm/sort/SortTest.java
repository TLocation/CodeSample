package algorithm.sort;

import kotlin.test.AssertionsKt;
import org.junit.jupiter.api.Test;

public class SortTest {
    @Test
    public void bubblingSortTest() {
        int[] data1 = new int[]{3, 2, 1};
        Sort.bubblingSort(data1);
        AssertionsKt.assertTrue(equalsArray(data1, new int[]{1, 2, 3}), null);
        data1 = new int[]{1, 2, 3};
        Sort.bubblingSort(data1);
        AssertionsKt.assertTrue(equalsArray(data1, new int[]{1, 2, 3}), null);
        data1 = new int[]{3, 1, 2, 0};
        Sort.bubblingSort(data1);
        AssertionsKt.assertTrue(equalsArray(data1, new int[]{0, 1, 2, 3}), null);
    }

    @Test
    public void bubblingSortRefTest(){
        int[] data1 = new int[]{3, 2, 1};
        Sort.bubblingSortRef(data1);
        AssertionsKt.assertTrue(equalsArray(data1, new int[]{1, 2, 3}), null);
        data1 = new int[]{1, 2, 3};
        Sort.bubblingSortRef(data1);
        AssertionsKt.assertTrue(equalsArray(data1, new int[]{1, 2, 3}), null);
        data1 = new int[]{3, 1, 2, 0};
        Sort.bubblingSortRef(data1);
        AssertionsKt.assertTrue(equalsArray(data1, new int[]{0, 1, 2, 3}), null);
    }


    public boolean equalsArray(int[] srcArray, int[] targetArray) {
        int srcLen = srcArray.length;
        int targetLen = targetArray.length;
        if (srcLen != targetLen) {
            return false;
        }
        for (int i = 0; i < srcLen; i++) {
            if (srcArray[i] != targetArray[i]) {
                return false;
            }
        }
        return true;
    }
}
