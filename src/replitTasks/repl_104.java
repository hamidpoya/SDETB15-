package replitTasks;

import java.util.Scanner;

public class repl_104 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Enter 5 names: ");
        for(int i =0; i< names.length; i++){
            names[i] = input.nextLine();
            while(names[i]).length() < 3{
                System.out.println("Please input at least three characters for your name");
                names[i].input.nextLine();
            }
        }
        }
}
