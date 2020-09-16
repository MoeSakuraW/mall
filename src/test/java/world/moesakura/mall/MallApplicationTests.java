package world.moesakura.mall;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import world.moesakura.mall.user.mapper.UserMapper;
import world.moesakura.mall.user.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
class MallApplicationTests {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Test
    void contextLoads() {

        User user = userMapper.selectById(1L);

        System.out.println(user);

    }

}
