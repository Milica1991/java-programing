package day15logicalops_switch_ternary;

public class Cityselector {
    public static void main(String[] args) {
        String city = "Moscow";
        //Moscow  or Tampa
        if (city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("Willingf to relocate to " + city);
        }else{
            System.out.println("Not consisdering - " + city);
        }
    }
}
