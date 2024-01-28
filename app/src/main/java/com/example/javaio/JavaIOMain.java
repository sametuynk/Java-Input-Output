package com.example.javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaIOMain {
    public static void main(String[] args) {
        //DOSYA YAZMA VE OKUMA


        //filewriteYaz();
        //filereadOku();
        //bufferYaz();
        bufferOku();
    }

    public static void filewriteYaz(){
        try {
            File dosya =new File("C:\\Users\\samet.uyanik\\Desktop\\dosya.txt");
            if (!dosya.exists()){
                dosya.createNewFile();
            }
            FileWriter yazici=new FileWriter(dosya);
            yazici.write("Selamlar");
            yazici.flush();
            yazici.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public  static void filereadOku(){

        try {
            File dosya =new File("C:\\Users\\samet.uyanik\\Desktop\\dosya.txt");
            FileReader okuyucu=new FileReader(dosya);
            StringBuilder sp=new StringBuilder();

            int bilgi=0;
            while ((bilgi=okuyucu.read()) !=-1){
                sp.append((char) bilgi);
            }
            okuyucu.close();
            System.out.println("Okunan : "+sp.toString());


        }catch (Exception e){
            e.printStackTrace();
        }






    }

    public static void bufferYaz(){

        try {
            File dosya =new File("C:\\Users\\samet.uyanik\\Desktop\\dosyabuffer.txt");
            if (!dosya.exists()){
                dosya.createNewFile();
            }
            FileWriter fw=new FileWriter(dosya);

            BufferedWriter yazici=new BufferedWriter(fw);
            yazici.write("BufferedWriter and BufferedReader");
            yazici.flush();
            yazici.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void bufferOku(){

        try {
            File dosya =new File("C:\\Users\\samet.uyanik\\Desktop\\dosyabuffer.txt");

            FileReader fr=new FileReader(dosya);

            BufferedReader okuyucu=new BufferedReader(fr);

            StringBuilder sb =new StringBuilder();

            String satir="";

            while ((satir=okuyucu.readLine())!=null){
                sb.append(satir+"\n");
            }
            okuyucu.close();
            System.out.println(sb.toString());


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
