package world.moesakura.mall.user.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author MoeSakuraW
 * @since 2020-09-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user")
@ApiModel(value = "User 对象", description = "用户对象")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户 id")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "用户密码")
    private String userPassword;

    @ApiModelProperty(value = "用户邮箱")
    private String userEmail;

    @ApiModelProperty(value = "用户创建时间")
    private Date userCreateTime;

    @ApiModelProperty(value = "用户最后登录时间")
    private Date userLoginTime;

    @ApiModelProperty(value = "用户状态：0 表示禁用，1 表示启用")
    private Integer userStatus;

    @ApiModelProperty(value = "用户角色：0 表示普通用户，1 表示管理员")
    private Integer userRole;


}
