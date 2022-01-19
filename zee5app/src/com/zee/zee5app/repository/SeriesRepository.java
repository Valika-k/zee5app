package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.Series;

public class SeriesRepository {
	private Series[] shows=new Series[10];
	private static int count=-1;
	//add new user
	public String addSeries(Series series) {

		
		if(count==shows.length-1)
		{
			Series temp[]=new Series[shows.length*2];
			//add old contents to new
			System.arraycopy(shows,0,temp,0,shows.length);
			shows=temp;
			shows[++count]=series;
			return "array is full";
		}
		shows[++count]=series;
		return "success";
		
		
	}
	
	//return user details by id
	public Series getSeriesById(String Id) {
		//we need to traverse array
		for(Series series : shows) {
			if(series!=null && series.getId().equals(Id)  ) {
				return series;
			}
		}
		return null;
	}
	
	//return all user details
	public Series[] getSeriess() {
		return shows;
	}
	
	public String updateSeries(String id, Series series)
	{
		int counter=-1;

		for(Series series1 : shows) {
			++counter;
			if(series1!=null && series1.getId().equals(id)  ) {
				shows[counter].setName(series.getName());
				shows[counter].setReleasedate(series.getReleasedate());
				//registers[counter].setEmail(register.getEmail());
				//registers[counter].setPassword(register.getPassword());
				
			}
		}
		return "Series updated";
	}
	
	public String deleteSeries(String id)
	{
	
		int counter=-1;
		for(Series series : shows) {
			
			++counter;
			if(series!=null && series.getId().equals(id)  ) {
				Series rem= series;
					for(int i=counter;i<shows.length;i++) {
						shows[i]=shows[i+1];
					}
					
			}
			return "deleted "+id ;
		}
		return null;
	}
	
	
	
	
	private static SeriesRepository seriesRepository;
	public static SeriesRepository getInstance()
	{
		if(seriesRepository==null)
			seriesRepository=new SeriesRepository();
		return seriesRepository;
	}
}
