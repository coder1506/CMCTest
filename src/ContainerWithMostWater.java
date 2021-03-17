public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,4};
        System.out.printf(result(arr) + "");
    }
    public static long result(int[] arr){
        int lengthOFArr = arr.length;
        int max = 1;
        for (int i = 0 ; i < lengthOFArr - 1 ; i++){
            for (int j = i + 1; j < lengthOFArr ; j++){
                if(arr[i] < arr[j]) {
                    if(arr[i] * Math.abs(j - i) > max)
                        max = arr[i] * Math.abs(j - i);
                }
                else {
                    if(arr[j] * Math.abs(i - j) > max)
                        max = arr[j] * Math.abs(i - j);
                }
            }
        }
        return max;
    }
}
