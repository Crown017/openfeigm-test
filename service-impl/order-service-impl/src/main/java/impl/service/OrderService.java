package impl.service;


import com.crown.service.api.entity.Member;
import com.crown.service.api.entity.Order;
import impl.openfeign.MemberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class OrderService {


    @Autowired
    private MemberServiceFeign memberServiceFeign;

    /**
     * 调用Openfeign客户端
     * @return
     */
    @GetMapping("/getOrderByUserId")
    public Order getOrderByUserId(@RequestParam Integer userId){
        String uuid  = UUID.randomUUID().toString().replaceAll("-","");
        Member member = memberServiceFeign.getMemberById(userId);
        return new Order(uuid,member.getUserName());
    }

}
