public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
    }
    public static int[][] result(int[][] arr){
        sortAsc(arr);
        int lengthOfArr = arr.length;
        for (int i = 0 ; i < lengthOfArr ; i++){
            for (int j = 0 ; j < 2; j++){

            }
        }
    }
    public static boolean findInTime(int[] subArr , int[][] arr){

    }
    public static void sortAsc(int[][] arr){
        int lengthOfArr = arr.length;
        for (int i = 0 ; i < lengthOfArr - 1 ; i++){
            for(int j = i + 1 ; j < lengthOfArr ; j++){
                if(arr[i][0] > arr[j][0]){
                    int[] tg ;
                    tg = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tg;
                }
            }
        }
    }
}
