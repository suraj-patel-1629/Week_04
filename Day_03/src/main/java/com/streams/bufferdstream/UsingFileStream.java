package com.streams.bufferdstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

 class UsingFileStream {
     // method for reading and writing by using FileStream
    public static long usingFileStream(String readFile,String writeFile) {
        // try block is used to handle io exception
        // by using try with resource we do not need to close object explictily

        //storing the start time
        long startTime = System.nanoTime();
        try(FileInputStream fis = new FileInputStream(readFile);
            FileOutputStream fos = new FileOutputStream(writeFile)){
            byte []buffer = new byte[4096];
            int size;
            while((size =fis.read(buffer))!=-1){
                fos.write(buffer,0,size);
            }
            System.out.println("File copied successfully using fileStream ");
        }catch (Exception e){
            e.printStackTrace();
        }
        // storing the endtime
        long endTime = System.nanoTime();
        // returning the time required for reading from the file and writing back to another file
        return endTime -startTime;
    }
}
