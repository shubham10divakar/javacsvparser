package io.github.shubham10divakar.internal.Testing;

import io.github.shubham10divakar.JavaCSVParser;
import org.json.JSONArray;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;

class Test {
    public static void main(String[] args) throws IOException {
//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//        Enumeration<URL> resources = classLoader.getResources("io/github/shubham10divakar/read_csv_data.py");
//        while (resources.hasMoreElements()) {
//            System.out.println(resources.nextElement());
//        }

        JavaCSVParser obj = new JavaCSVParser();

        String csvfile = "C:\\D\\my docs\\my docs\\projects\\springbootnetworkproject\\PythonScriptExecutor\\Airplane_Crashes_and_Fatalities_Since_1908.csv";

        List<String> str = obj.csvToStringList(csvfile);

        String jsonString = obj.csvToJSONArrayString(csvfile);

        JSONArray jsonArray = obj.csvToJSONArray(csvfile);

    }

    public static void display(String str){
        System.out.println(str);
    }
}
