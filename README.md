# JavaCSVParser

**JavaCSVParser** is a Java library designed to facilitate the conversion of CSV data fetched via a Python script into various formats, including a List<String>, a JSONArray, or a JSON formatted string. It integrates with the PythonScriptExecutor class for executing Python scripts asynchronously to retrieve CSV data and the data is available in Java code to be used for Java Applications.

## Features

- **CSV to List Conversion**: Convert CSV data fetched via a Python script into a List<String>, where each string element represents a line from the CSV file.
- **CSV to JSONArray Conversion**: Convert CSV data into a JSONArray object, enabling structured JSON representation of the CSV content.
- **CSV to JSON String Conversion**: Generate a JSON formatted string from CSV data using a JSONArray, suitable for data exchange and storage in JSON format.
- **Custom Exceptions**
- **Cross-Platform Support**
- Uses **pythonscriptexecutor** library at the backend.

## Installation

Add the following dependency to your `pom.xml` if you are using Maven:

```xml
<dependency>
    <groupId>io.github.shubham10divakar</groupId>
    <artifactId>pythonscriptexecutor</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

# Note
Ensure your Python scripts (script.py in this case) have a __main__ section defined as shown in the example below. This ensures compatibility and proper execution when using the PythonScriptExecutor library in your Java code else it wont run.
```code
import io.github.shubham10divakar.JavaCSVParser;
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
```

## License
This project is licensed under the MIT License - see the LICENSE file for details.


## About Me
I am Subham Divakar and I am the developer of multiple Java, Python and React libraries.
Check out my worksamples on my portfolio site.

## Connect with Me

    LinkedIn: https://www.linkedin.com/in/subham-divakar-a7420a12a/
    GitHub: https://github.com/shubham10divakar
    Portfolio: https://shubham10divakar.github.io/showcasehub/

## Feedback

Your feedback is important! Please share your thoughts and suggestions.
License

This project is licensed under the MIT License.