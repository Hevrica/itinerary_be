package itinerary.itinerary_be.dto;

import java.util.Set;

import itinerary.itinerary_be.entity.Authority;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {
	private String id;
	private String password;
	private Set<Authority> authorities;
}