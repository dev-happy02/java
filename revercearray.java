public class revercearray {
    public static void reverse(int num []) {
        int small = 0;
        int large = num.length-1;
        while(small < large){
            int temp = num [large];
            num[large] = num [small];
            num[small] = temp;

            small++;
            large--;
        } 
    }
    public static void main(String[] args) {
        int num []= {1,2,3,4,5,6,7,8,9};
        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }
        System.out.println( );
    }
}
