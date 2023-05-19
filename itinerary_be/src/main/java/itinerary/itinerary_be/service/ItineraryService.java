package itinerary.itinerary_be.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itinerary.itinerary_be.entity.Itinerary;
import itinerary.itinerary_be.repository.ItineraryRepository;

@Service
public class ItineraryService {
	
	@Autowired
	private ItineraryRepository repository;
	
	public long create(Itinerary itinerary) {
		repository.save(itinerary);
		return itinerary.getItineraryPk();
	}
}