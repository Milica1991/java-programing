package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        // dependency injection.Gropu depends on String name
        Group group1 = new Group("Cyberbugs");
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Break");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Maria");
        group1.addMember("Milica");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen", "Wakshum", "Akrem", "Bulent", "Andrea", "Andrei"));
        //print all members. not toString()
        System.out.println("group2 members = " + group2.getMembers());
        //use if statment to check if Akrem is in group
        if (group2.getMembers().contains("Akrem")) {
            System.out.println("Akrem is member of group2");

        }else{
            System.out.println("Akrem is not in group2");
        }
        //remove same members from group 1
        group1.removeMember("Pavel");
        group1.removeMember("Elvin");
        System.out.println(group1);

    }
}
