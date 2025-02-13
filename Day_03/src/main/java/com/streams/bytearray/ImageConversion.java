package com.streams.bytearray;

import java.util.Arrays;

import static com.streams.bytearray.ImageToByteArrayToImage.byteArrayToImage;
import static com.streams.bytearray.ImageToByteArrayToImage.imageToByteArray;

public class ImageConversion {
    public static void main(String[] args) {

        try {
            // Byte array to store image in the form of byte
            byte[] imageToByteArray = imageToByteArray("src/main/java/com/streams/bytearray/inputimage.jpg");
            //calling method to convertbyte array back to image
            byteArrayToImage(imageToByteArray,"src/main/java/com/streams/bytearray/outputimage.jpg");
            System.out.println("image converted succefully ");

            byte[] backConversionofOutputImage = imageToByteArray("src/main/java/com/streams/bytearray/outputimage.jpg");
            // checking wheather both images are identical or not
            if(Arrays.equals(imageToByteArray,backConversionofOutputImage)){
                System.out.println("Yes both are identical ");
            }else{
                System.out.println("both image are Not identical ");
            }


        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
