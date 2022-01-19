package com.zee.zee5app.service;
import com.zee.zee5app.repository.UserRepository;
import com.zee.zee5app.dto.Register;
//service objects are used to just call the services inside the main method, can we do using 1 object?
//to fix this they provided a solution called a singleton design pattern
//one ==> to get only one object for the specific type

public class userService {
	
	private UserRepository repository= UserRepository.getInstance();
	//service is consuming repository
	private userService()
	{
		//auto generated constructor stub
		
	}
	
	private static userService service=null;
	
	//if we want to create a single object we need to create it  in the same class
	
	public static userService getInstance() {
		//object independent
		//static keyword helps in creating method independent of object
		if(service==null)//local ref
			service = new userService();
		return service;
	
	}
	
	
	public String addUser(Register register) {
		return this.repository.addUser(register);
	}
	
	public Register getUserById(String id) {
		return this.repository.getUserById(id);
	}
	
	public Register[] getUsers() {
		return repository.getUsers();	
	}
	
//	public Register updateUser(String id, Register register) {
//		return this.repository.updateUser(id, register);
//	}


	public String deleteUser(String id) {
		// TODO Auto-generated method stub
		return this.repository.deleteUser(id);
	}
}
