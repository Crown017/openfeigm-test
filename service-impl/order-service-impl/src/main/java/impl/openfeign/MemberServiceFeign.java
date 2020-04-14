package impl.openfeign;


import com.crown.service.api.entity.Member;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 命名不能有下划线
 */
@FeignClient("service-member")
public interface MemberServiceFeign {


    /**
     * @RequestParam("userId")
     * 如果使用Get请求不加请求参数会报错
     *
     *
     *
     *
     * @param userId
     * @return
     */
    @GetMapping("/getMemberById")
    Member getMemberById(@RequestParam("userId") Integer userId);

}
