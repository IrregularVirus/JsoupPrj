package com.example.jsoupprj;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws IOException {

        Connection.Response res = Jsoup.connect("https://catalog.polcar.com/search?q=133007-4&type=all_numbers").method(Connection.Method.POST).execute();

        Map<String,String> cookies = res.cookies();

        Document doc = Jsoup.connect("https://catalog.polcar.com/search?q=133007-4&type=all_numbers").requestBody("https://catalog.polcar.com/search?q=133007-4&type=all_numbers").header("content-ype","application/json").cookies(cookies).get();


        System.out.println(doc);
//        System.out.println(cookies)

    }
}
