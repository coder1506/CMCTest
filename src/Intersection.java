import java.util.ArrayList;
import java.util.List;

public class Intersection {

        public static void main(String[] args) {
            int[] nums1 = {1,2,2,1};
            int[] nums2 = {2,2};
            if(nums1.length > nums2.length) displayArr(intersectionResult(nums1,nums2));
            else displayArr(intersectionResult(nums2,nums1));
        }
        public static boolean contains(int[] arr, int number){
            for(int i = 0 ; i < arr.length; i++){
                if(arr[i] == number) return true;
            }
            return false;
        }
        public static List intersectionResult(int[] bArr, int[] sArr){
            List<Integer> result = new ArrayList<Integer>();
            for (int i = 0 ; i < bArr.length ; i++){
                if(contains(sArr,bArr[i]) && !result.contains(bArr[i])) {
                    result.add(bArr[i]);
                }
            }
            return result;
        }
        public static void displayArr(List<Integer> arr) {
            for (Integer num : arr) {
                System.out.print(num + " ");
            }
        }

}
