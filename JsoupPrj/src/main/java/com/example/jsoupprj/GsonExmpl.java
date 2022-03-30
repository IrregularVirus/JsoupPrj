package com.example.jsoupprj;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GsonExmpl {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Part part = createPartObject();

        String json = gson.toJson(part);

        try(FileWriter writer = new FileWriter("Partinfo.json")){
            gson.toJson(part, writer);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private static Part createPartObject() {
        Part part = new Part();

        part.setId("fedfmG");
        part.setName("Absorber");
        part.setNumber("133007-4");

        return part;
    }
}
