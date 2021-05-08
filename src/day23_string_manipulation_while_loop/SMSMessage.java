package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Nadir] FromNumber<222333444> Message:{Hello. lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1, end));
        String sender = message.substring(start+1,end);
        System.out.println("sender = " + sender);

        String phoneNumber = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("phoneNumber = " + phoneNumber);
        String messageBody =  message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("messageBody = " + messageBody);

        if (sender.equals("Nadir")) {
            System.out.println("Message from Nadir about homework");
        }else{
            System.out.println("Someone else message");
        }


    }
}
