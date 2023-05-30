package itinerary.itinerary_be.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import itinerary.itinerary_be.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	Optional<Member> findByEmail(String email);
}