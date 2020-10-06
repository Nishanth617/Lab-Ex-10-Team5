/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ex10;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nishanth
 */
public class Q1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
   try {
        FileReader fr = new FileReader("input.txt"); 
        BufferedReader br = new BufferedReader(fr); 
        FileWriter fw = new FileWriter("outfile.txt"); 
        String line,s;

        while((s = br.readLine()) != null)
        { 
            fw.write(s); 
	    fw.flush();
            line = s.trim(); // remove leading and trailing whitespace
            line=line.replaceAll("\\s+", " ");
            fw.write(line);


        }
        fr.close();
        fw.close();
        } catch (IOException e) {
		e.printStackTrace();
		}
    }
    
}
