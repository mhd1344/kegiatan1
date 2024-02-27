//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner choice = new Scanner(System.in);

        System.out.println("====== Library System =====");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3) : ");

        int pilihan = choice.nextInt();
        choice.nextLine();// Membersihkan Buffer

        //Metode If Else
        if (pilihan == 1) {
            System.out.print("Enter your NIM : ");
            String NIM = choice.nextLine();
            if (NIM.equals("202310370311305")) {
                System.out.println("Succesfully Login as Student");
            } else {
                System.out.println("Student Not Found");
            }
        } else if (pilihan == 2) {
            System.out.print("Enter your username (admin): ");
            String username = choice.nextLine();
            System.out.print("Enter your password (admin): ");
            String password = choice.nextLine();
            if (username.equals("admin") && password.equals("admin")) {
                System.out.println("Succesfully Login as Admin");
            } else {
                System.out.println("Admin User Not Found!!");
            }
        }else if (pilihan == 3){
            System.out.println("Exiting.....");
        }else {
            System.out.println("Invalid Option");
        }



        choice.close();
    }
}