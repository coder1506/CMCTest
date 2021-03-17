import java.util.ArrayList;
import java.util.List;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr =  {-2,1,-3,4,-1,2,1,-5,4};
        displayArr(subArrResult(arr));
    }
    public static List<Integer> subArrResult(int[] arr){
        List<Integer> arrResult = new ArrayList<Integer>();
        int max = arr[0] ;
        int sum = 0;
        if (arr.length == 1) {
            arrResult.add(arr[0]);
            return arrResult;
        }
        int i = 0 ;
        int j = 0;
        while ( i != arr.length){
            for (int k = i ; k <= j ; k++){
                sum += arr[k];
            }
            if (sum > max){
                arrResult.clear();
                max = sum;
                sum = 0;
                for (int k = i ; k <= j ; k++){
                    arrResult.add(arr[k]);
                }
            }
            else sum = 0;
            j++;
            if (j == arr.length){
                i++;
                j = i;
            }
        }
        return arrResult;
    }
    public static void displayArr(List<Integer> arr){
        for (Integer a : arr){
            System.out.print(a + " ");
        }
    }
}
