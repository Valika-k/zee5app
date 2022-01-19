package com.zee.zee5app.service;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.repository.SubscriptionRepository;

public class SubscriptionService {
	private SubscriptionRepository repository= SubscriptionRepository.getInstance();

	private static SubscriptionService service=null;
	public static SubscriptionService getInstance() {
		//object independent
		//static keyword helps in creating method independent of object
		if(service==null)//local ref
			service = new SubscriptionService();
		return service;
	
	}
	
	
	public String addSubscription(Subscription subscription) {
		return this.repository.addSubscription(subscription);
	}
	
	public Subscription getSubscriptionById(String id) {
		return this.repository.getSubscriptionById(id);
	}
	
	public Subscription[] getSubscriptions() {
		return repository.getSubscriptions();	
	}
	public String updateSubscription(String id, Subscription subscription) {
		return this.repository.updateSubscription(id, subscription);
	}
	public String deleteSubscription(String id) {
		// TODO Auto-generated method stub
		return this.repository.deleteSubscription(id);
	}

}
