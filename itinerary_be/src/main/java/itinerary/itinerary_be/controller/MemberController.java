package itinerary.itinerary_be.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import itinerary.itinerary_be.dto.JwtDto;
import itinerary.itinerary_be.dto.LoginDto;
import itinerary.itinerary_be.entity.Member;
import itinerary.itinerary_be.service.MemberService;

/**
 * 회원 컨트롤러
 * @author JTB
 * @version 0.1
 */
@RestController
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	/**
	 * 회원 생성
	 * @param member 회원 정보
	 * @return 성공시 true, 실패 false
	 */
	@PostMapping("/members/new")
	public String create(Member member) {
		return "";
	}
	
	/**
	 * 회원 조회
	 * @param member 회원 정보
	 * @return
	 */
	@GetMapping("/members/read")
	public String read(Member member) {
		return "";
	}
	
	/**
	 * 회원 수정
	 * @param member 회원 정보
	 * @return
	 */
	@PostMapping("/members/update")
	public String update(Member member) {
		return "";
	}
	
	/**
	 * 회원 삭제
	 * @param member 회원 정보
	 * @return
	 */
	@PostMapping("/members/delete")
	public String delete(Member member) {
		return "";
	}
	
	/**
	 * 로그인
	 * @param loginDto 로그인 정보
	 * @return
	 */
	@PostMapping("/members/login")
	public ResponseEntity<JwtDto> login(LoginDto loginDto) {
		return ResponseEntity.ok(memberService.login(loginDto.getId(), loginDto.getPassword()));
	}
}