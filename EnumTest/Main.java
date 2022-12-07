package EnumTest;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String temp = "",response = "";
        while(!temp.equals("exit")){
            System.out.print("What is the state of the weather today?(or \"exit\"):");
            temp = sc.nextLine();
            if(temp.equals("exit")){
                break;
            }
            try{
                Weather wth = Weather.valueOf(temp);
                switch(wth){
                    case RAIN:
                        response = "wear a rain jacket";
                        break;
                    case SNOW:
                        response = "wear snow boots";
                        break;
                    case SUN:
                        response = "wear sunscreen";
                        break;
                    case WIND:
                        response = "wear a light jacket";
                        break;
                    case WARM:
                        response = "not wear too much";
                        break;
                    case COLD:
                        response = "wear many layers";
                        break;
                    default:
                        break;
                }
                System.out.println("You should "+response+" !");
            }catch(Exception e){
                System.out.println("Please enter a valid response\n");
            }
        }
    }
}