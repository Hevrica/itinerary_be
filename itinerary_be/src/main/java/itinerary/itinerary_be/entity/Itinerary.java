package itinerary.itinerary_be.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Itinerary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "itinerary_pk")
	private Long itineraryPk;
	
	@Column(name = "title", length = 500)
	private String title;
	
	@Column(name = "destination", length = 50)
	private String destination;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name = "start_day")
	private String startDay;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name = "end_day")
	private String endDay;
	
	@Column(name = "writer_pk")
	private String registerPk;
	
	@Column(name = "write_day")
	private Date registerDay;
	
	@Column(name = "modifier_pk")
	private String modifierPk;
	
	@Column(name = "modify_day")
	private Date modifyDay;
}