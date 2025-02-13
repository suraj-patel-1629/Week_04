package com.streams.bufferdstream;

import java.io.*;

 class UsingBufferdStream {

         // method for reading and writing by using BufferedStream
        public static long usingBufferedStream(String readFile,String writeFile){
            // storing start time
            long startTime = System.nanoTime();
            try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(readFile));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(writeFile))){
                byte []buffer = new byte[4096];
                int size;
                while((size =bis.read(buffer))!=-1){
                    bos.write(buffer,0,size);
                }
                System.out.println("File copied successfully using bufferedStream ");
            }catch (Exception e){
                e.printStackTrace();
            }
            //storing end time
            long endTime = System.nanoTime();
            // returning the time required for reading from ine file and writing back to another file
            return endTime -startTime;
        }

}
