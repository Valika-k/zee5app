package com.zee.zee5app.service;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.Series;
import com.zee.zee5app.repository.SeriesRepository;

public class SeriesService {
	private SeriesRepository repository= SeriesRepository.getInstance();

	private static SeriesService service=null;
	public static SeriesService getInstance() {
		//object independent
		//static keyword helps in creating method independent of object
		if(service==null)//local ref
			service = new SeriesService();
		return service;
	
	}
	
	
	public String addSeries(Series series) {
		return this.repository.addSeries(series);
	}
	
	public Series getSeriesById(String id) {
		return this.repository.getSeriesById(id);
	}
	
	public Series[] getSeriess() {
		return this.repository.getSeriess();	
	}
	public String updateSeries(String id, Series series) {
		return this.repository.updateSeries(id, series);
	}
	public String deleteSeries(String id) {
		// TODO Auto-generated method stub
		return this.repository.deleteSeries(id);
	}

}
