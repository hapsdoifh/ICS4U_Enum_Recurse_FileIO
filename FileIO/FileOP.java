package FileIO;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class FileOP {
    private ArrayList<String> Client = new ArrayList<>();
    private ArrayList<String> Passwords = new ArrayList<>();

    public int readFile(String FileName){
        try{
            FileReader fIn = new FileReader(FileName);
            Scanner sc = new Scanner(fIn);
            while(sc.hasNext()){
                String temp = sc.nextLine();
                int split = temp.indexOf(":");
                Client.add(temp.substring(0,split));
                Passwords.add(temp.substring(split+1));
            }
            fIn.close();
        }catch(Exception e){}
        return 0;
    }

    public int writeFile(String FileName){
        try{
            FileWriter fOut = new FileWriter(FileName);
            for(int i = 0; i<Client.size(); i++){
                fOut.write(Client.get(i)+":"+Passwords.get(i));
                if(i+1 < Client.size()){
                    fOut.write("\n");
                }
            }
            fOut.close();
        }catch(Exception e){}
        return 0;
    }

    public void AddClient(String Name, String pass){
        Client.add(Name);
        Passwords.add(pass);
    }
    public void RemoveClient(int position){
        try{
            Client.remove(position-1);
            Passwords.remove(position-1);
        }catch(Exception e){}
    }

    public void PrintList(){
        for(int i = 0; i < Client.size(); i++){
            System.out.println((i+1) + ". Name: " + Client.get(i) + "\t\tPassword: " + Passwords.get(i));
        }
    }
}
