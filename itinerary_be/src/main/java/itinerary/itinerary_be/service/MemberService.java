package itinerary.itinerary_be.service;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import itinerary.itinerary_be.config.jwt.JwtProvider;
import itinerary.itinerary_be.dto.JwtDto;
import itinerary.itinerary_be.entity.Member;
import itinerary.itinerary_be.repository.MemberRepository;

@Service
public class MemberService {
	
	private final MemberRepository repository;
	private final AuthenticationManagerBuilder builder;
	private final JwtProvider provider;
	
	public MemberService(MemberRepository repository, AuthenticationManagerBuilder builder, JwtProvider provider) {
		this.repository = repository;
		this.builder = builder;
		this.provider = provider;
	}
	
	/**
	 * 회원 가입
	 * @param member
	 * @return
	 */
	public long create(Member member) {
		// TODO validation 걸기
		repository.save(member);
		return member.getMemberId();
	}
	
	/**
	 * 로그인
	 * @param id
	 * @param password
	 * @return
	 */
	public JwtDto login(String id, String password) {
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(id, password);
		Authentication authentication = builder.getObject().authenticate(authenticationToken);
		
		return provider.createToken(authentication);
	}
}