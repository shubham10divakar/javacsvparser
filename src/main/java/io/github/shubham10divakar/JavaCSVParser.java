package io.github.shubham10divakar;

import org.json.JSONArray;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

public class JavaCSVParser {
    public List<String> csvToStringList(String csvfilepath){
        PythonScriptExecutor obj = new PythonScriptExecutor();

        String obj1 = obj.executePythonScriptWithArgsASync("src/main/java/io/github/shubham10divakar/internal/pythonscript/read_csv_data.py", true, Level.INFO,csvfilepath);

        String[] itemsArray = obj1.split("\n");

        List<String> itemList = Arrays.asList(itemsArray);

        return itemList;
    }

    public JSONArray csvToJSONArray(String csvfilepath){
        PythonScriptExecutor obj = new PythonScriptExecutor();

        String obj1 = obj.executePythonScriptWithArgsASync("src/main/java/io/github/shubham10divakar/internal/pythonscript/read_csv_data.py", true, Level.INFO,csvfilepath);

        String[] itemsArray = obj1.split("\n");

        List<String> itemList = Arrays.asList(itemsArray);

        JSONArray jsonArray = new JSONArray(itemList);

        return jsonArray;
    }

    public String csvToJSONArrayString(String csvfilepath){
        PythonScriptExecutor obj = new PythonScriptExecutor();

        String obj1 = obj.executePythonScriptWithArgsASync("src/main/java/io/github/shubham10divakar/internal/pythonscript/read_csv_data.py", true, Level.INFO,csvfilepath);

        String[] itemsArray = obj1.split("\n");

        List<String> itemList = Arrays.asList(itemsArray);

        JSONArray jsonArray = new JSONArray(itemList);

        // Convert JSONArray to JSON formatted string
        String jsonString = jsonArray.toString();

        return jsonString;
    }
}
