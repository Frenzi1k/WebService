package com.frenzi.webservice;


import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;


@WebService()
public class File {

    @WebMethod
    public byte[] getFile(String fileName){
        try {
            java.io.File file = new java.io.File(String.format("D:\\Java\\Projects\\WebService\\web\\res\\Files\\%s", fileName));
            return Files.readAllBytes(file.toPath());
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    @WebMethod(operationName = "getFilesName")
    public ArrayList<String> getFilesName(String ip){
        System.out.println(ip);
        java.io.File folder = new java.io.File("D:\\Java\\Projects\\WebService\\web\\res\\Files");
        java.io.File[] files = folder.listFiles();
        ArrayList<String> listFilesName = new ArrayList<>();

        try {
            for (java.io.File file : files) {
                listFilesName.add(file.getName());
            }
        } catch (NullPointerException e){
            System.out.println("Error: " + e.getMessage());
        }

        return listFilesName;
    }
}
