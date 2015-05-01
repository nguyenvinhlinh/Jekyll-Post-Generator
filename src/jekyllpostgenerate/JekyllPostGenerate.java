/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jekyllpostgenerate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nguyenvinhlinh
 */
public class JekyllPostGenerate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        Date date = new Date();
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//Enter name of article
        System.out.print("Enter name of post: ");
        String post_name = reader.nextLine().trim();
        String post_name_in_filename = post_name.replace(" ", "-");
        String post_file_name = dateFormat1.format(date) + "-" + post_name_in_filename + ".md";
       // PrintWriter writer = new PrintWriter(post_file_name);

        //Check if file name is exist or not
        File file = new File(post_file_name);
        //System.out.println("Is file named " + post_file_name + " exists? " + file.exists());
        if (file.exists() == true) {
            System.out.println("File name \""+ post_file_name +"\" did exitst. Becareful");
        } else {
            //Create new file 
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.println("---");
                writer.println("layout: post");
                writer.println("title: \"" + post_name + "\"");
                writer.println("date: " + dateFormat2.format(date));
                writer.println("tags: ");
                writer.println("categories: ");
                writer.println("---");       
                writer.close();
                System.out.println("File named \"" + post_file_name + "\" generated.");
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            }
        }
    }
}
