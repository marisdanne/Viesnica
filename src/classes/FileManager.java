/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

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
}
