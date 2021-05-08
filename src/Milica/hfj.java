package Milica;

public class hfj {
    public static void main(String[] args) {
        int [] arrNum = {1,2,3,4};
        System.out.println(min(arrNum));

    }
    public static int min (int[] arrNum) {
        int min = arrNum[0];
        for (int i = 0; i < arrNum.length; i++){
            if (min > arrNum[i]){
                min = arrNum[i];
            }
        }
        return min;
    }
}
