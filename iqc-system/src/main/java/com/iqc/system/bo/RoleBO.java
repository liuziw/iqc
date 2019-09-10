package com.iqc.system.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author liuziw
 * @date 2019/8/12 18:00
 */
@Data
public class RoleBO {
    //角色名称
    @ApiModelProperty("角色名称")
    private String name;

    //角色描述
    @ApiModelProperty("角色描述")
    private String description;

    //角色标识-----注意这里需要ROLE_作为前缀这是springsecurity中的默认规则
    @ApiModelProperty("角色标识")
    private String roleKey;

    //菜单集合
    @ApiModelProperty("角色拥有的权限集合")
    private List<MenuBO> menus;
}
