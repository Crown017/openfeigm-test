package crown.crown.member.service.impl;

import com.crown.service.api.entity.Member;
import com.crown.service.api.member.MemberService;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MemberServiceImpl implements MemberService {

    private static final Map<Integer, Member> datebase = new HashMap<>();

    static {
        Member member = new Member("zhangsan","123456");
        Member member2 = new Member("lisi","123456");
        datebase.put(1,member);
        datebase.put(2,member2);
    }

    @Override
    public Member getMemberById(Integer userId) {
        Member member = datebase.get(userId);
        return member;
    }
}
