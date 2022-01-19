package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Subscription;

public class SubscriptionRepository {
	private Subscription[] subscriptions=new Subscription[10];
	private static int count=-1;
	//add new user
	public String addSubscription(Subscription subscription) {
		//registers.length => gives us the availability
		
		if(count==subscriptions.length-1)
		{
			Subscription temp[]=new Subscription[subscriptions.length*2];
			//add old contents to new
			System.arraycopy(subscriptions,0,temp,0,subscriptions.length);
			subscriptions=temp;
			subscriptions[++count]=subscription;
			return "array is full";
		}
		subscriptions[++count]=subscription;
		return "success";
		
		
	}
	
	//return user details by id
	public Subscription getSubscriptionById(String Id) {
		//we need to traverse array
		for(Subscription subscription : subscriptions) {
			if(subscription!=null && subscription.getId().equals(Id)  ) {
				return subscription;
			}
		}
		return null;
	}
	
	//return all user details
	public Subscription[] getSubscriptions() {
		return subscriptions;
	}
	
	public String updateSubscription(String id, Subscription register)
	{

		
		return null;
	}
	
	public String deleteSubscription(String id)
	{
	
		int counter=-1;
		for(Subscription subscription : subscriptions) {
			
			++counter;
			if(subscription!=null && subscription.getId().equals(id)  ) {
				Subscription rem= subscription;
					for(int i=counter;i<subscriptions.length;i++) {
						subscriptions[i]=subscriptions[i+1];
					}
					
			}
			return "deleted "+id ;
		}
		return null;
	}
	
	
	
	
	private static SubscriptionRepository subscriptionRepository;
	public static SubscriptionRepository getInstance()
	{
		if(subscriptionRepository==null)
			subscriptionRepository=new SubscriptionRepository();
		return subscriptionRepository;
	}

}
