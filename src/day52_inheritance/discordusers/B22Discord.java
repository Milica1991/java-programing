package day52_inheritance.discordusers;

public class B22Discord {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Milica");
        user1.setRole("student");
        Admin admin1 = new Admin();
        admin1.setId(43214);
        admin1.setName("Burak Kara");
        admin1.setRole("Admin");

        System.out.println(user1);
        System.out.println(admin1);

    }
}
