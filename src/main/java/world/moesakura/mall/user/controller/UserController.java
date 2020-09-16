package world.moesakura.mall.user.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.moesakura.mall.common.api.CommonResult;
import world.moesakura.mall.user.mapper.UserMapper;
import world.moesakura.mall.user.model.User;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author MoeSakuraW
 * @since 2020-09-16
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping(value = "/show/{id}")
    @ApiOperation(value = "根据 id 查询")
    public CommonResult<User> queryById(@PathVariable @ApiParam(value = "用户 id") Long id) {

        User user = userMapper.selectById(id);

        return CommonResult.success(user);
    }
}

