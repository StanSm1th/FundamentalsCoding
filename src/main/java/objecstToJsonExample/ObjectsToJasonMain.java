package objecstToJsonExample;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class ObjectsToJasonMain {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        FileWriter file = null;

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "1");
        jsonObject.put("firstName", "Dainius");
        jsonObject.put("lastName", "Pilypas");

        System.out.println(jsonObject.toJSONString());

        Dog dog = new Dog("Rex","German shepard");
        file = new FileWriter("src/main/resources/dog.json");

        JSONObject dogJson = new JSONObject();
        dogJson.put("dogsName", dog.getName());
        dogJson.put("dogsBreed", dog.getBreed());
        file.write(dogJson.toString());
        file.close();
    }
}
