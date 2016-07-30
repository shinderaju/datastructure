package bridgeLab.Datastructure;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONFileWrite {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JSONArray jsonArray=new JSONArray();
		JSONObject countryObj = new JSONObject();
		System.out.println("Enter the name of product");
		String name = sc.next();
		System.out.println("Enter the weight");
		int w = sc.nextInt();
		System.out.println("Enter the price");
		int p = sc.nextInt();
		countryObj.put("name", name);
		countryObj.put("weight", w);
		countryObj.put("price", p);		
		obtainJSONArray(countryObj);
		try{
		// Writing to a file
			File file = new File("/home/bridgeit/Desktop/raju/Datastructure/file1.json");
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter br =new BufferedWriter(fileWriter);
					
			System.out.println("Writing JSON object to file");
			System.out.println("-----------------------");
			System.out.print(obtainJSONArray(countryObj));

			br.append(obtainJSONArray(countryObj));
			br.append("]");
			br.newLine();
			br.flush();
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String obtainJSONArray(JSONObject jsonObject){
		String jsonArrayString=null,finalString;
		jsonArrayString=jsonObject.toJSONString();
		finalString="["+jsonArrayString+",";
		return finalString;
	}

}
