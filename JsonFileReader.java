package bridgeLab.Datastructure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileReader {

	public static void main(String[] args) {

		JSONParser parser = new JSONParser();

		try {
			//read data from file
			Object obj = parser.parse(new FileReader("/home/bridgeit/Desktop/raju/Datastructure/file1.json"));
			//jsonObject of file
			JSONObject jsonObject = (JSONObject) obj;
			//reading json values from object
			String name = (String) jsonObject.get("name");
			System.out.println("Name Of product: " + name);

			long price = (Long) jsonObject.get("price");
			System.out.println("price: " + price);

			long weight = (Long) jsonObject.get("weight");
			System.out.println("weight :" + weight);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
