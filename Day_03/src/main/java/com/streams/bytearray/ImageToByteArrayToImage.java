/*5. ByteArray Stream - Convert Image to ByteArray
📌 Problem Statement:
Write a Java program that converts an image file into a byte array and then writes it back to another image file.
Requirements:
Use ByteArrayInputStream and ByteArrayOutputStream.
Verify that the new file is identical to the original image.
Handle IOException.*/

package com.streams.bytearray;

import java.io.*;

class ImageToByteArrayToImage {
  //method to convert image to byte array
  public static byte[] imageToByteArray(String imagePath) throws IOException {
   //creating the file object to point image
   File file = new File(imagePath);
   try (FileInputStream fis = new FileInputStream(file);
        // bytearray object for conveting image to byte
        ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

    // buffer array to store the image into byte
    byte[] buffer = new byte[4096];
    int bytesRead;

    // reading the file and writing it in the form of byte
    while ((bytesRead = fis.read(buffer)) != -1) {
     baos.write(buffer, 0, bytesRead);
    }
  // returning the byte code of image
    return baos.toByteArray();
   }
  }

  // This method to convert the byte dcode back to image
 public static void byteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
   // bytearrayinputstream  object to convert byte back to image
  try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
       FileOutputStream fos = new FileOutputStream(outputPath)) {
   // 4KB buffer
   byte[] buffer = new byte[4096];
   int bytesRead;
   // reading the byte array and storing to output file
   while ((bytesRead = bais.read(buffer)) != -1) {
    fos.write(buffer, 0, bytesRead);
   }
  }
 }
}
