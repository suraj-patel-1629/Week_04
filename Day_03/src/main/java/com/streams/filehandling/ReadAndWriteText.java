/*📌 Problem Statement:
Write a Java program that reads the contents of a text file and writes it into a new file. If the source file does not exist, display an appropriate message.
Requirements:
Use FileInputStream and FileOutputStream.
Handle IOException properly.
Ensure that the destination file is created if it does not exist.
*/

package com.streams.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWriteText {
    public static void main(String[] args) {
        // try block is used to handle io exception
        // by using try with resource we do not need to close object explictily
        try(FileInputStream fis = new FileInputStream("src/main/java/com/streams/filehandling/read.txt");
            FileOutputStream fos = new FileOutputStream("src/main/java/com/streams/filehandling/output.txt",true)){
            int bytestream ;
            while((bytestream =fis.read())!=-1){
                fos.write((char)bytestream);
            }
            System.out.println("File copied successfully ");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
