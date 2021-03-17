import java.util.ArrayList;
import java.util.List;

public class TwoSums {
    public static void main(String[] args) {
        int[] numbers = {-1,0};
        int target = -1;
        displayArr(twoSumsResult(numbers,target));
    }
    public static List twoSumsResult(int[] arr, int target){
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = i + 1; j < arr.length ; j++){
                if(arr[i] + arr[j] == target) {
                    result.add(i + 1);
                    result.add(j + 1);
                }
            }
        }
        return result;
    }
    public static void displayArr(List<Integer> arr){
        for (Integer num : arr){
            System.out.print(num + " ");
        }
    }
}
