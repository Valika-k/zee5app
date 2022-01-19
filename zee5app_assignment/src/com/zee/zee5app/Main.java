package com.zee.zee5app;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.dto.Series;
import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.repository.UserRepository;
import com.zee.zee5app.service.SubscriptionService;
//import com.zee.zee5app.service.UserService2;
import com.zee.zee5app.service.userService;
//import com.zee.zee5app.service.impl.UserServiceImpl;

import java.util.Scanner;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.service.MovieService;
import com.zee.zee5app.service.SeriesService;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//UserService2 service= UserServiceImpl.getInstance();
		
		System.out.println("1.To display User Details\n");
		System.out.println("2.To display Subscription Details\n");
		System.out.println("3.To display Movie Details\n");
		System.out.println("4.To display Series Details\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter your option : ");
		int option=sc.nextInt();
		if(option==1) {
		
		Register register= new Register();
		//Register- class name
		//register- object
		//new- used to create object
		//Register()- constructor
		register.setFirstname("valika");
		register.setLastname("k");
		register.setEmail("valika@gmail.com");
		register.setPassword("valli");
		
		System.out.println("USER DETAILS\n\n");
		System.out.println(register);
		System.out.println(register.toString());
		System.out.println(register.getEmail());
		
		userService service1=userService.getInstance();
		
		
		for(int i=1;i<=10;i++) {
			Register register2 =new Register();
			register2.setId("ab00"+i);
			register2.setFirstname("valika"+i);
			register2.setLastname("Kannaiah"+i);
			register2.setEmail("email"+i);
			register2.setPassword("pswd"+i);
			
			String result=service1.addUser(register2);			
			//String result= service.addUser(register);
			System.out.println(result);
		}
		
		System.out.println("\n");
		Register register2= service1.getUserById("ab1");
		System.out.println(register2!=null);
		
		System.out.println("\n");
		for(Register register3 : service1.getAllUsers()) {
			if(register3!=null)
				System.out.println(register3);
		}
		
		
		Register register7= new Register();
		register7.setFirstname("abc");
		register7.setLastname("xyz");
		String result7= service1.updateUser("ab003",register7);
		System.out.println("\nUsers after updating\n");
		for(Register register3 : service1.getAllUsers()) {
			if(register3!=null)
				System.out.println(register3);
		}
		
		Register register4= new Register();
		String result8= service1.deleteUser("ab002");
		System.out.println("\n"+result8);	
		
		}
		
		else if(option==2)
		{
		
		Subscription subscription= new Subscription();
		subscription.setDateOfPurchase("18/01/2022");
		subscription.setStatus("active");
		subscription.setCountry("india");
		subscription.setPaymentMode("Debit card");
		subscription.setAutorenewal("Yes");
		subscription.setExpirydate("18/02/2022");
		
		System.out.println("\n\nSUBSCRIPTION DETAILS\n\n");
		System.out.println(subscription);
		System.out.println(subscription.toString());
		
		SubscriptionService service2=SubscriptionService.getInstance();
		
		for(int i=1;i<=5;i++) {
			Subscription subscription2 =new Subscription();
			subscription2.setId("s00"+i);
			subscription2.setDateOfPurchase("18/01/2022");
			subscription2.setStatus("active");
			subscription2.setCountry("india");
			subscription2.setPaymentMode("Debit card");
			subscription2.setAutorenewal("Yes");
			subscription2.setExpirydate("18/02/2022");
			String result1=service2.addSubscription(subscription2);			
			//String result= service.addUser(register);
			System.out.println(result1);
		}
		System.out.println("\n");
		Subscription subscription2= service2.getSubscriptionById("ab1");
		System.out.println(subscription2!=null);
		System.out.println("\n");
		for(Subscription subscription3 : service2.getSubscriptions()) {
			if(subscription3!=null)
				System.out.println(subscription3);
		}
		
		Subscription subscription7= new Subscription();
		subscription7.setCountry("US");
		subscription7.setAutorenewal("No");
		String result7= service2.updateSubscription("s003",subscription7);
		System.out.println("\nSubscriptions after updating\n");
		for(Subscription subscripton3 : service2.getSubscriptions()) {
			if(subscripton3!=null)
				System.out.println(subscripton3);
		}

		System.out.println("\n");
		Subscription subscription4= new Subscription();
		String result2= service2.deleteSubscription("s002");
		System.out.println(result2);
		}
		
		else if(option==3) {
		
		Movie movie= new Movie();
		movie.setName("moviename");
		movie.setReleasedate("18/01/2022");
		movie.setLanguage("lang");
		movie.setCast("cast");
		movie.setLength("120");
		
		System.out.println("\n\nMOVIE DETAILS\n\n");
		System.out.println(movie.toString());
		
		MovieService service3=MovieService.getInstance();
		
		for(int i=1;i<=5;i++) {
			Movie movie2 =new Movie();
			movie2.setId("m00"+i);
			movie2.setName("movie"+i);
			movie2.setReleasedate("18/02/2022");
			movie2.setLanguage("lang"+i);
			movie2.setCast("cast"+i);
			movie2.setLength("120");			
			String result5= service3.addMovie(movie2);
			System.out.println(result5);
		}
		System.out.println("\n");
		Movie movie2= service3.getMovieById("m001");
		System.out.println(movie2!=null);
		System.out.println("\n");
		for(Movie movie3 : service3.getMovies()) {
			if(movie3!=null)
				System.out.println(movie3);
		}
		
		Movie movie4= new Movie();
		movie4.setName("abc");
		movie4.setReleasedate("20/01/22");
		String result7= service3.updateMovie("m003",movie4);
		System.out.println("\nMovies after updating\n");
		for(Movie movie3 : service3.getMovies()) {
			if(movie3!=null)
				System.out.println(movie3);
		}
		
		System.out.println("\n");
		Movie movie5= new Movie();
		String result4= service3.deleteMovie("m002");
		System.out.println(result4);		
		}
		
		else
		{

			Series series= new Series();
			series.setName("Seriesname");
			series.setReleasedate("18/01/2022");
			series.setLanguage("lang");
			series.setCast("cast");
			series.setLength("120");
			
			System.out.println("\n\nSERIES DETAILS\n\n");
			System.out.println(series.toString());
			
			SeriesService service4=SeriesService.getInstance();
			
			for(int i=1;i<=5;i++) {
				Series series2 =new Series();
				series2.setId("show00"+i);
				series2.setName("series"+i);
				series2.setReleasedate("18/02/2022");
				series2.setLanguage("lang"+i);
				series2.setCast("cast"+i);
				series2.setLength("120");			
				String result5= service4.addSeries(series2);
				System.out.println(result5);
			}
			
			System.out.println("\n");
			Series series2= service4.getSeriesById("show001");
			System.out.println(series2!=null);
			System.out.println("\n");
			for(Series series3 : service4.getSeriess()) {
				if(series3!=null)
					System.out.println(series3);
			}
			
			Series series4= new Series();
			series4.setName("abc");
			series4.setReleasedate("20/01/22");
			String result7= service4.updateSeries("show003",series4);
			System.out.println("\nSeries after updating\n");
			for(Series series3 : service4.getSeriess()) {
				if(series3!=null)
					System.out.println(series3);
			}

			System.out.println("\n");
			Series series5= new Series();
			String result6= service4.deleteSeries("show002");
			System.out.println(result6);		
			
		}
		
		//UserRepository repository= new UserRepository();//cannot create instance
		
	}	

}