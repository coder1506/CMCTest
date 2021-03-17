public class ClimbingStair {
    public static void main(String[] args) {
        System.out.println(countSteps(-2));
    }
    public static int countSteps(int n){
        int sum = 0;
        int numOfSteps = n/2;
        if (numOfSteps <= 0) return 0;
        if(n % 2 == 0){
            int numOf2 = n/2;
            int numOf1 = 0;
            for (int i = 0 ; i <= numOfSteps; i ++){
                sum+=(gt(numOf1+numOf2))/(gt(numOf1)*gt(numOf2));
                numOf1+=2;
                numOf2-=1;
            }
        }
        else {
            int numOf2 = 0;
            int numOf1 = n;
            for (int i = 0 ; i <= numOfSteps; i ++){
                sum+=(gt(numOf1+numOf2))/(gt(numOf1)*gt(numOf2));
                numOf1-=2;
                numOf2+=1;
            }
        }
        return sum;
    }
    public static long gt(int n){
        if(n <= 1) return 1;
        return n*gt(n-1);
    }
}
