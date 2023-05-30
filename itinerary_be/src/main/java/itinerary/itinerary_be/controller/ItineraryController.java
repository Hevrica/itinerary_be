package itinerary.itinerary_be.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itinerary.itinerary_be.dto.ItineraryDetailDto;
import itinerary.itinerary_be.dto.ItineraryDto;
import itinerary.itinerary_be.service.ItineraryService;
import lombok.RequiredArgsConstructor;

/**
 * 일정 컨트롤러
 * @author JTB
 *
 */
@RestController
@RequestMapping("/itinerary")
@RequiredArgsConstructor
public class ItineraryController {
	
	private final ItineraryService itineraryService;
	
	/**
	 * 일정 등록
	 * @param dto 일정 정보
	 * @return 성공시 true, 실패 false
	 */
	@PostMapping("/create")
	public String create(ItineraryDto dto) {
		itineraryService.create(dto);
		return "";
	}
	
	/**
	 * 일정 조회
	 * @param dto 일정 정보
	 * @return 일정 정보
	 */
	@GetMapping("/read")
	public String read(ItineraryDto dto) {
		return null;
	}
	
	/**
	 * 일정 수정
	 * @param dto 일정 정보
	 * @return 성공시 true, 실패 false
	 */
	@PostMapping("/update")
	public String update(ItineraryDto dto) {
		return "";
	}
	
	/**
	 * 일정 삭제
	 * @param dto 일정 정보
	 * @return 성공시 true, 실패 false
	 */
	@PostMapping("/delete")
	public String delete(ItineraryDto dto) {
		return "";
	}
	
	/**
	 * 일정 목록 조회
	 * @param dto 일정 정보
	 * @return 일정 목록 정보
	 */
	@GetMapping("/list")
	public String list(ItineraryDto dto) {
		return null;
	}
	
	/**
	 * 상세일정 등록
	 * @param dto 상세일정 정보
	 * @return 성공시 true, 실패 false
	 */
	@PostMapping("/details/create")
	public String detailsCreate(ItineraryDetailDto dto) {
		return "";
	}
	
	/**
	 * 상세일정 조회
	 * @param dto 상세일정 정보
	 * @return 상세일정 정보
	 */
	@GetMapping("/details/read")
	public String detailsRead(ItineraryDetailDto dto) {
		return null;
	}
	
	/**
	 * 상세일정 수정
	 * @param dto 상세일정 정보
	 * @return 성공시 true, 실패 false
	 */
	@PostMapping("/details/update")
	public String detailsUpdate(ItineraryDetailDto dto) {
		return "";
	}
	
	/**
	 * 상세일정 삭제
	 * @param dto 상세일정 정보
	 * @return 성공시 true, 실패 false
	 */
	@PostMapping("/details/delete")
	public String detailsDelete(ItineraryDetailDto dto) {
		return "";
	}
	
	/**
	 * 상세일정 목록 조회
	 * @param dto 상세일정 정보
	 * @return 상세일정 목록 정보
	 */
	@GetMapping("/details/list")
	public String detailsList(ItineraryDetailDto dto) {
		return null;
	}
}