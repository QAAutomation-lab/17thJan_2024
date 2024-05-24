package day1.jsonexamples;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Example2 {
	
	@Test
	public void testJsonArrayCreation() {
		JSONObject obj1=new JSONObject();
		obj1.put("Name", "Shailesh");
		obj1.put("ID", 123);
		obj1.put("Address", "Pune");
		
		JSONObject obj2=new JSONObject();
		obj2.put("Name", "Aman");
		obj2.put("ID", 456);
		obj2.put("Address", "Mumbai");
		
		System.out.println("First JSON object: \n\t\t"+obj1);
		System.out.println("Second JSON object: \n\t\t"+obj2);
		
		JSONArray jArray=new JSONArray();
		jArray.add(obj1);
		jArray.add(obj2);
		System.out.println("JSON Array object: \n\t\t"+jArray);
		for(Object obj:jArray) {
			System.out.println(obj);
		}
	}
}
/*
 * JSON file read and write
 * POJO classes
 * Serialization
 * Rest Assured
 */
