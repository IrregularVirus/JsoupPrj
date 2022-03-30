package com.example.jsoupprj;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JsonToJava {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try (Reader reader = new FileReader("Part.json.")){
            Part part = gson.fromJson(reader, Part.class);

            System.out.println(part);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
