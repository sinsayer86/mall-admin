package cafe.jjdev.mall.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import cafe.jjdev.mall.admin.vo.Member;

@Mapper
public interface MemberMapper {
	public Member selectMember(Member member);
}
