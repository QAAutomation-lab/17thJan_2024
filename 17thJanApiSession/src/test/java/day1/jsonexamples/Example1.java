package day1.jsonexamples;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Example1 {
	
	@Test
	public void testJsonObjectCreation() {
		JSONObject ref=new JSONObject();
		ref.put("Subject1", "Manual");
		ref.put("Subject2", "API");
		ref.put("Subject3", "Automation");
		ref.put("Subject4", "Mobile");		
		System.out.println("JSON Object: \n"+ref);
		System.out.println("Subject1 value is: "+ref.get("Subject1"));
	}
	
	@Test
	public void testJsonObjectCreationUsingMap() {
		Map ref=new HashMap();
		ref.put("Subject1", "Manual");
		ref.put("Subject2", "API");
		ref.put("Subject3", "Automation");
		ref.put("Subject4", "Mobile");		
		System.out.println("MAP Object: \n"+ref);
//		JSONObject obj=new JSONObject(ref);
//		System.out.println("JSON Object: \n"+obj);
	}
}
