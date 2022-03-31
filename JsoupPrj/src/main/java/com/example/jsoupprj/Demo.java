package com.example.jsoupprj;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws IOException {

      Connection.Response execute = Jsoup.connect("https://catalog.polcar.com/search?q=133007-4&type=all_numbers").execute();
        Document doc = execute.parse();
        String csrf = doc.selectXpath("//meta[@id=\"csrf-token\"]").attr("content");
        System.out.println(csrf);

        Map<String,String> cookies = execute.cookies();

        Map<String,String> body = new HashMap<>();
        body.put("q","133007-4");

        Map<String,String> headers = new HashMap<>();
        headers.put("accept","application/json");
        headers.put("x-csrf-token",csrf);
        headers.put("content-type","application/json");
        headers.put("origin","https://catalog.polcar.com");
        headers.put("referer","https://catalog.polcar.com/search?q=133007-4&type=all_numbers");
        headers.put("x-xsrf-token",cookies.get("XSRF-TOKEN"));

        Connection.Response res = Jsoup.connect("https://catalog.polcar.com/search?q=133007-4&type=all_numbers").ignoreContentType(true).headers(headers).requestBody(body.toString()).cookies(cookies).method(Connection.Method.POST).execute();
        System.out.println(res.body());

    }
}
