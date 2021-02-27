package serviceImplTest;

import com.hltj.api.domain.TUser;
import com.hltj.api.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/2/27 15:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void insertUserTest(){
        TUser user = new TUser();
        user.setUserName("admin");
        user.setUserPasswd("123456");
        userService.insertUser(user,"admin");
    }
}
