/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class FileManager {
    private File file;
    
    FileManager(String path){
        this.file = new File("data/" + path + ".txt");
    }
    
    public void append(String str){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(str);
            bw.newLine();
            bw.close();
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }        
    }
    
    public ArrayList<User> getUsers(){
        ArrayList<User> users = new ArrayList<User>();
        
        try {        
            BufferedReader br = new BufferedReader(new FileReader(file));
        
            String rindina;
            String [] data;
            try {
                while((rindina = br.readLine()) != null){
                    data = rindina.split(",");
                    users.add(new Client(Integer.parseInt(data[0]), data[1], data[2], data[3]));
                }       
            } catch (IOException ex) {
                System.out.println("Error " + ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error " + ex.getMessage());
        }
        
        return users;
    }
}
