package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(7);
        count(2);
        int num =999;
        count(num);
        //            01234567891011+1=12
        String word= "wooden spoon";
        count((word.length()));//12

        printAge(1991);

    }   public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    /**
     * method name:printAge
     * input:int year
     * birth year: 1991. Age: 30
     */
    public static void printAge(int year){
        int age =2021 - year;
            System.out.println("Birth year : " + year + " Age : " + age);
        }
}
