public class largestnum {
    public static int largest(int num [] ) {
        int lag  = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(lag < num[i]){
                lag = num[i];
            }
        }
        return lag;
    }
    public static void main(String[] args) {
        int num [] = {23,43,25,2,4,6,54};
        System.out.println("largest number is : " + largest(num));
    }
}
