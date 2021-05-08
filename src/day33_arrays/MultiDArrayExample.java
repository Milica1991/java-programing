package day33_arrays;
/**
              0                  1
 0    "Teodora Tsvetanov"    "TeodorasPWD12"
 1    "Anna Ziyayeva"    "AnnaAlmaty123"
 2    "Parvin Altae"    "ParvinVienna321"
 */
public class MultiDArrayExample {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0] = "Teodora Tsvetanov";
        users[0][1] = "TeodorasPWD12";
        users[1][0] = "Anna Ziyaeva";
        users[1][1] = "AnnaAlmaty123";
        users[2][0] = "Parvin Altae";
        users[2][1] = "ParvinVienna321";

        String[][] usersData ={ { "Teodora Tsvetanov" , "TeodorasPWD12"} ,
                {"Anna Ziyaeva" , "AnnaAlmaty123"} ,
                { "Parvin Altae" , "ParvinVienna321"} };
        System.out.println(usersData[0][0]);
        System.out.println(usersData[1][0]);
        System.out.println(usersData[2][0]);

    }
}
