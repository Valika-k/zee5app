package com.zee.zee5app;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.service.SubscriptionService;
import com.zee.zee5app.service.userService;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register register= new Register();
		//Register- class name
		//register- object
		//new- used to create object
		//Register()- constructor
		register.setFirstname("valika");
		register.setLastname("k");
		register.setEmail("valika@gmail.com");
		register.setPassword("valli");
		
		System.out.println(register);
		System.out.println(register.toString());
		System.out.println(register.getEmail());
		
		userService service=userService.getInstance();
		
		for(int i=1;i<=10;i++) {
			Register register2 =new Register();
			register2.setId("ab00"+i);
			register2.setFirstname("valika"+i);
			register2.setLastname("Kannaiah"+i);
			String result=service.addUser(register2);			
			//String result= service.addUser(register);
			System.out.println(result);
		}
		
		Register register2= service.getUserById("ab1");
		System.out.println(register2!=null);
		
		for(Register register3 : service.getUsers()) {
			if(register3!=null)
				System.out.println(register3);
		}
		
		
//		Register register4= new Register();
//		register4.setFirstname("abc");
//		register4.setLastname("xyz");
//		String result= service.updateUser(register4);
		
		Register register4= new Register();
		String result= service.deleteUser("ab002");
		System.out.println(result);	
		
		
		
		
		Subscription subscription= new Subscription();
		subscription.setDateOfPurchase("18/01/2022");
		subscription.setStatus("active");
		subscription.setCountry("india");
		subscription.setPaymentMode("Debit card");
		subscription.setAutorenewal("Yes");
		subscription.setExpirydate("18/02/2022");
		
		System.out.println(subscription);
		System.out.println(subscription.toString());
		
		SubscriptionService service1=SubscriptionService.getInstance();
		
		for(int i=1;i<=5;i++) {
			Subscription subscription2 =new Subscription();
			subscription2.setId("s00"+i);
			subscription.setDateOfPurchase("18/01/2022");
			subscription.setStatus("active");
			subscription.setCountry("india");
			subscription.setPaymentMode("Debit card");
			subscription.setAutorenewal("Yes");
			subscription.setExpirydate("18/02/2022");
			String result1=service1.addSubscription(subscription2);			
			//String result= service.addUser(register);
			System.out.println(result1);
		}
		
		Subscription subscription2= service1.getSubscriptionById("ab1");
		System.out.println(subscription2!=null);
		
		for(Subscription subscription3 : service1.getSubscriptions()) {
			if(subscription3!=null)
				System.out.println(subscription3);
		}

		
		Subscription subscription4= new Subscription();
		String result2= service1.deleteSubscription("s002");
		System.out.println(result2);		
		
	}	

}