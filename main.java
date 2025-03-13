/*
Java VSCode Installation
========================
1. Open VSCode
    - Make sure you already download Java JDK and install Java Extension (Can find inside 'Extension' tab)
2. Open Configure Terminal [Ctrl + Shift + P]
3. Type 'Java', click on 'Java: Create Java Project...' and click 'No Build Tools'
4. Choose file location and name the folder by your own
5. Then, you can code ler i think [Run Code by click the top right icon, not close icon :) ]

**Your java file inside 'src'

JSON Installation
=================
1. Open ini https://github.com/stleary/JSON-java?tab=readme-ov-file and go down download the jar file.
2. Back to VSCode Left banner eh find 'JAVA PROJECTS' then you expand it.
3. Hover on 'Referenced Libraries' and click the +, find and select to import the jar file.
4. Copy this below code and try see see 
*/

import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.JSONArray;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StoreJSONExample {
    public static void main(String[] args) {
        // Step 1: Create a JSON Object
        JSONObject employee = new JSONObject();
        employee.put("name", "John Doe");
        employee.put("age", 30);
        employee.put("isMarried", false);

        // Step 2: Add a nested JSON Object
        JSONObject address = new JSONObject();
        address.put("street", "123 Main St");
        address.put("city", "New York");
        address.put("state", "NY");
        employee.put("address", address);

        // Step 3: Add a JSON Array
        JSONArray skills = new JSONArray();
        skills.put("Java");
        skills.put("Python");
        skills.put("SQL");
        employee.put("skills", skills);

        // Step 4: Store JSON data in a file
        String filePath = "employee.json";
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(employee.toString(2)); // Pretty-print JSON with indentation
            System.out.println("JSON data saved to file: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileReader file = new FileReader(filePath)) {
            // Step 1: Read the JSON file
            JSONTokener tokener = new JSONTokener(file);
            JSONObject employee2 = new JSONObject(tokener);

            // Step 2: Access JSON data
            String name = employee2.getString("name");
            int age = employee2.getInt("age");
            JSONObject address2 = employee.getJSONObject("address");
            String city = address2.getString("city");
            JSONArray skills2 = employee2.getJSONArray("skills");

            // Step 3: Print the data
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
            System.out.println("Skills: " + skills2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
