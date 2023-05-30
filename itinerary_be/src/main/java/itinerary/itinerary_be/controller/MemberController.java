package itinerary.itinerary_be.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itinerary.itinerary_be.dto.JwtDto;
import itinerary.itinerary_be.dto.LoginDto;
import itinerary.itinerary_be.dto.MemberDto;
import itinerary.itinerary_be.service.MemberService;
import lombok.RequiredArgsConstructor;

/**
 * 회원 컨트롤러
 * @author JTB
 * @version 0.1
 */
@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService memberService;
	
	/**
	 * 회원 생성
	 * @param dto 회원 정보
	 * @return 성공시 true, 실패 false
	 */
	@PostMapping("/new")
	public String create(MemberDto dto) {
		return "";
	}
	
	/**
	 * 회원 조회
	 * @param dto 회원 정보
	 * @return member 회원 정보
	 */
	@GetMapping("/read")
	public String read(MemberDto dto) {
		return "";
	}
	
	/**
	 * 회원 수정
	 * @param dto 회원 정보
	 * @return 성공시 true, 실패 false
	 */
	@PostMapping("/update")
	public String update(MemberDto dto) {
		return "";
	}
	
	/**
	 * 회원 삭제
	 * @param dto 회원 정보
	 * @return 성공시 true, 실패 false
	 */
	@PostMapping("/delete")
	public String delete(MemberDto dto) {
		return "";
	}
	
	/**
	 * 로그인
	 * @param dto 로그인 정보
	 * @return jwt 객체
	 */
	@PostMapping("/login")
	public ResponseEntity<JwtDto> login(LoginDto dto) {
		return ResponseEntity.ok(memberService.login(dto.getId(), dto.getPassword()));
	}
}