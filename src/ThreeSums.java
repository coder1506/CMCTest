public class ThreeSums {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        display(result(arr));
    }
    public static int[][] result(int[] arr){
        int lengthOfArr = arr.length;
        int[][] newArr = new int[0][];
        for(int i = 0; i < lengthOfArr - 2 ; i++){
            for(int j = i + 1; j < lengthOfArr - 1 ; j++){
                for (int k = j + 1 ; k < lengthOfArr ; k++){
                    if(arr[i] + arr[j] + arr[k] == 0) {
                        int[] ele = {arr[i],arr[j],arr[k]};
                        newArr = addElementToArray(newArr,ele);
                    }
                }
            }
        }
        return newArr;
    }
    public static int[][] addElementToArray(int[][] arr, int[] ele){
        int[][] newArr = new int[arr.length + 1][];
        int lengthOfArray = arr.length;
        for (int i = 0 ; i < lengthOfArray ; i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = ele;
        return newArr;
    }
    public static void display(int[][] arr){
        for(int[] a : arr){
            System.out.print("[");
            for(int b : a){
                System.out.print(b + ",");
            }
            System.out.print("],");
        }
    }
}
