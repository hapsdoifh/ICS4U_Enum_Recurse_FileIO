
package FileIO;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        FileOP textOp = new FileOP();
        Scanner keyboard = new Scanner(System.in);
        textOp.readFile("FileIO\\Info.txt");
        String tempN="",tempP="",Action = "";
        while(!Action.equals("exit")){
            System.out.print("Add new client name (\"skip\" to actions): ");
            tempN = keyboard.nextLine();
            if(!tempN.equals("skip")){
                System.out.print("Add new client password (\"skip\" to actions): ");
                tempP = keyboard.nextLine();
                if(!tempP.equals("skip")){
                    textOp.AddClient(tempN, tempP);
                }
            }   
            System.out.print("\nChoose action (\"exit\", \"view\",\"remove\", any key to continue): ");
            Action = keyboard.nextLine();
            switch(Action){
                case "view":
                    System.out.println("Client List: ");
                    textOp.PrintList();
                    System.out.println();
                    break; 
                case "exit":
                    textOp.writeFile("FileIO\\Info.txt");
                    break;
                case "remove":                    
                    System.out.println("Which client? (number): ");
                    textOp.RemoveClient(keyboard.nextInt());
                    break;
                default:
            }
        }
    }
}