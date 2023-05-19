package itinerary.itinerary_be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import itinerary.itinerary_be.entity.Itinerary;

public interface ItineraryRepository extends JpaRepository<Itinerary, Long> {
	
}