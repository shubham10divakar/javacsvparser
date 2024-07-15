package io.github.shubham10divakar;

import org.json.JSONArray;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;

public class JavaCSVParser {

    // Method to get the Python script content from JAR
    private File getPythonScriptFromResource(String scriptPath) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Enumeration<URL> resources = classLoader.getResources(scriptPath);

        if (!resources.hasMoreElements()) {
            throw new FileNotFoundException("Python script not found: " + scriptPath);
        }

        URL resourceURL = resources.nextElement();
        InputStream inputStream = resourceURL.openStream();

        File tempFile = File.createTempFile("script", ".py");
        tempFile.deleteOnExit();

        try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }

        return tempFile;
    }

    public List<String> csvToStringList(String csvfilepath){
        PythonScriptExecutor obj = new PythonScriptExecutor();

        File scriptFile = null;

        try {
            scriptFile = getPythonScriptFromResource("io/github/shubham10divakar/read_csv_data.py");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String obj1 = obj.executePythonScriptWithArgsASync(scriptFile.getAbsolutePath(), true, Level.INFO,csvfilepath);

        String[] itemsArray = obj1.split("\n");

        List<String> itemList = Arrays.asList(itemsArray);

        return itemList;
    }

    public JSONArray csvToJSONArray(String csvfilepath){
        File scriptFile = null;

        try {
            scriptFile = getPythonScriptFromResource("io/github/shubham10divakar/read_csv_data.py");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        PythonScriptExecutor obj = new PythonScriptExecutor();

        String obj1 = obj.executePythonScriptWithArgsASync(scriptFile.getAbsolutePath(), true, Level.INFO,csvfilepath);

        String[] itemsArray = obj1.split("\n");

        List<String> itemList = Arrays.asList(itemsArray);

        JSONArray jsonArray = new JSONArray(itemList);

        return jsonArray;
    }

    public String csvToJSONArrayString(String csvfilepath){
        File scriptFile = null;

        try {
            scriptFile = getPythonScriptFromResource("io/github/shubham10divakar/read_csv_data.py");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        PythonScriptExecutor obj = new PythonScriptExecutor();

        String obj1 = obj.executePythonScriptWithArgsASync(scriptFile.getAbsolutePath(), true, Level.INFO,csvfilepath);

        String[] itemsArray = obj1.split("\n");

        List<String> itemList = Arrays.asList(itemsArray);

        JSONArray jsonArray = new JSONArray(itemList);

        // Convert JSONArray to JSON formatted string
        String jsonString = jsonArray.toString();

        return jsonString;
    }
}
