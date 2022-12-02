package FileIO;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class FileOP {
    private ArrayList<String> Client;
    private ArrayList<String> passwords;

    public int readFile(String FileName){
        File fileIn = new File(FileName);
        if(fileIn.exists()){
            System.out.println("yes");
        }
        try{
            Scanner sc = new Scanner(fileIn);
            while(sc.hasNextLine()){
                String temp = sc.nextLine();
                int split = temp.indexOf(":");
                Client.add(temp.substring(0,split));
                passwords.add(temp.substring(split+1));
            }
            
        }catch(Exception e){}
        return 0;
    }
    public int writeFile(){
        return 0;
    }

}
