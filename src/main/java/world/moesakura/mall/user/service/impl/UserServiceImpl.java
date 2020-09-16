package world.moesakura.mall.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import world.moesakura.mall.user.mapper.UserMapper;
import world.moesakura.mall.user.model.User;
import world.moesakura.mall.user.service.UserService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author MoeSakuraW
 * @since 2020-09-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
