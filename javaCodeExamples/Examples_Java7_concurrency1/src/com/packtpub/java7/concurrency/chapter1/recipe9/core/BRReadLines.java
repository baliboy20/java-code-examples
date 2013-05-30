package com.packtpub.java7.concurrency.chapter1.recipe9.core;
// Read a string from console using a BufferedReader.
import java.io.*;
public class BRReadLines {
   public static void main(String args[]) throws IOException
   {
      // Create a BufferedReader using System.in
      BufferedReader br = new BufferedReader(new
                              InputStreamReader(System.in));
      String str;
      System.out.println("Enter lines of text.");
      System.out.println("Enter 'end' to quit.");
      do {
         str = br.readLine();
         System.out.println(str + "...");
      } while(!str.equals("end"));
   }
} 

