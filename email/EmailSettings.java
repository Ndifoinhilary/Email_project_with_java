package email;

import java.util.Scanner;

public class EmailSettings {
    private String firstName;
    private String lasttName;
    private String department;
    private String password;
    private String alternativeEmail;
    private int mailboxCapcity;

    public EmailSettings(String firstName, String lasttName){
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.department = setDepartment();
        this.password = randomPassword(8);
        System.out.println("Your default password is : " + this.password );
    }

    private String setDepartment(){
        System.out.print("Welcome Please select your department\n1 Sales\n2Development \n3 Accounting\n4 None");
        Scanner data = new Scanner(System.in);
        int depChoice = data.nextInt();
        if (depChoice == 1){
            return  "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounting";
        }else {
            return "None";
        }
    }

    private String randomPassword(int length){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWYXYZ!@#$%^&*()12345678910";
        char[] password = new char[length];
        for (int i = 0 ; i < length ; i++){
            int rand = (int) Math.random()*characters.length();
            password[i] = characters.charAt(rand);
        }
        return new String(password);
    }
}
