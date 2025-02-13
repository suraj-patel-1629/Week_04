package com.streams.bufferdstream;

import static com.streams.bufferdstream.UsingBufferdStream.usingBufferedStream;
import static com.streams.bufferdstream.UsingFileStream.usingFileStream;

public class EficientFileCopyUsingBuffered {
    public static void main(String[] args) {
        // read file path
        String readFilePath = "src/main/java/com/streams/bufferdstream/read.txt";
        // write file path with the help of fileStream
        String writeFilePathByFileStream ="src/main/java/com/streams/bufferdstream/outputWithFilestream.txt";

        // write file path with the help of BufferedStream
        String writeFilePathByBufferStream= "src/main/java/com/streams/bufferdstream/outputWithBufferedStream";

        // calling method to read file and write by using FileStream
        long timeByFileStream = usingFileStream(readFilePath,writeFilePathByFileStream);
        System.out.println("Time taken by FileStream to copy data to another file is : "+timeByFileStream/1000000.0 + "ms");

        // calling method to read file and write by using BufferedStream
        long timeByBufferedStream = usingBufferedStream(readFilePath,writeFilePathByBufferStream);
        System.out.println("Time taken by BufferedStream to copy data to another file is : "+timeByBufferedStream/1000000.0 + "ms");

        // comparing the time required by both process(by BufferedStream and FileStream)
        if(timeByBufferedStream<timeByFileStream)
        System.out.println("Therefore : Bufferedstream is efficient for copying the file ");
        else{
            System.out.println("Therefore : Filestream is efficient for copying the file ");
        }


    }
}
