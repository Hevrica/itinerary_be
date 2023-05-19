package itinerary.itinerary_be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import itinerary.itinerary_be.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	
}