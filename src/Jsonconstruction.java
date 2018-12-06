import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class Jsonconstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	JSONObject json =new JSONObject();
	json.put("date", "03-11-2018");
	json.put("name", "udhaya");
	JSONArray list =new JSONArray();
	list.add("message");
	json.put("Messages",list);
	System.out.println("Json Construction:"+json.toString());
	
	}

}
