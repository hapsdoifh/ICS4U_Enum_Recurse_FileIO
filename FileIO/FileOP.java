package FileIO;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class FileOP {
    private ArrayList<String> Client = new ArrayList<>();
    private ArrayList<String> passwords = new ArrayList<>();

    public int readFile(String FileName){
        try{
            FileReader fIn = new FileReader(FileName);
            Scanner sc = new Scanner(fIn);
            while(sc.hasNext()){
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
