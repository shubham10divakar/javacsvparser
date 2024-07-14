package io.github.shubham10divakar.internal.Testing;

import io.github.shubham10divakar.JavaCSVParser;
import io.github.shubham10divakar.PythonScriptExecutor;
import org.json.JSONArray;

import java.util.List;
import java.util.logging.Level;

class Test {
    public static void main(String[] args) {
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
