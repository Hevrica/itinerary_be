package itinerary.itinerary_be.service;

import org.springframework.stereotype.Service;

import itinerary.itinerary_be.dto.ItineraryDto;
import itinerary.itinerary_be.entity.Itinerary;
import itinerary.itinerary_be.repository.ItineraryRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItineraryService {
	
	private final ItineraryRepository repository;
	
	public long create(ItineraryDto dto) {
		Itinerary entity = Itinerary
				.builder()
				.title(dto.getTitle())
				.build();
		
		repository.save(entity);
		return entity.getItineraryPk();
	}
}