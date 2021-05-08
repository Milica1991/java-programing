package OfficeHourse_03_03_2021;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        String checked ="";
        int count = 0;
        for (int i = 0; i < str.length();i++) {
            for (int j = 0; j<str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) { //A==A.B.C
                    count++;

                }
            }
            if (count > 1) {
                System.out.println(str.charAt(i) + " is duplicate");
            }
            checked+= str.charAt(i);
        }
    }
}
