public class smallestnum {
    public static int smallest(int num []) {
        int small =Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(small > num[i]){
                small = num[i];
            }
        }
        return small ;
    }
    public static void main(String[] args) {
        int num [] = {34,54,-23,-56,76};
        System.out.println("smallest num is : "+smallest(num));
    }
}
