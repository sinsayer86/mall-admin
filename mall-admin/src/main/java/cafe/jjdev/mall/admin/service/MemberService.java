package cafe.jjdev.mall.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cafe.jjdev.mall.admin.mapper.MemberMapper;
import cafe.jjdev.mall.admin.vo.Member;

@Service
@Transactional
public class MemberService {
	@Autowired MemberMapper memberMapper;
	
	// 회원 한 명 정보 가져오는 서비스 메서드
	public Member getMember(Member member) {
		return memberMapper.selectMember(member);
	}
}
