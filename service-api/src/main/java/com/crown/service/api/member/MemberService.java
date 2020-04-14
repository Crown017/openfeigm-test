package com.crown.service.api.member;

import com.crown.service.api.entity.Member;
import org.springframework.web.bind.annotation.GetMapping;

public interface MemberService {
    @GetMapping("/getMemberById")
    Member getMemberById(Integer userId);
}
