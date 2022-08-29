package com.jap.ballad;

import java.io.*;

public class Ballad {
    public String readPoemFromAFile(String fileName){
        // Write the logic to read from a file
        String response = "";

        FileReader fileReader = null;
        String data = "";

        try{
            fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((data = bufferedReader.readLine()) != null){


                response = response.concat("\n") + data;
            }

        }catch (FileNotFoundException e){
            System.out.println("e = " + e);
            e.printStackTrace();

        }catch (IOException e){
            System.out.println("e = " + e);
            e.printStackTrace();
        }
        response.replace("\n","");
        return response;
    }

    public static void main(String[] args) {

        Ballad ballad = new Ballad();
        String response = ballad.readPoemFromAFile("src/main/resources/ballad.txt");
        System.out.println( response);
    }




}
