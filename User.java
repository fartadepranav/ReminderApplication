package Login;

import java.util.HashMap;

public class User {
	
	HashMap<String,String> users = new HashMap<String,String>();
	
	
	
	User(){
		this.users.put("User","Password");
	}
	
	User(String u,String p){
		this.users.put(u,p);
	}
	
	void add(String u,String p){
		this.users.put(u,p);
	}
	
	void init() {
	
		this.users.put("Abhishek","hello");
		this.users.put("Pranav","hello1");
		this.users.put("Utkarsh","hello2");
		this.users.put("Hrithik","hello3");
	}
	
	int login(String u,String p) {
		if(users.containsKey(u)) {
			if(p.equals(users.get(u))) {
				return 2;
			}
			else {
				return 1;
			}
		}
		else {
			return 0;
		}
	}
	
}

