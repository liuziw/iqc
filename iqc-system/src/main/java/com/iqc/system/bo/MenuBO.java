package com.iqc.system.bo;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author liuziw
 * @date 2019/8/12 17:58
 */
@Data
public class MenuBO {
    //菜单名称
    private String name;

    //菜单别名
    private String alias;

    //菜单描述
    private String description;

    //菜单图标
    private String icon;

    //菜单地址
    private String url;

    //菜单类型 1描述目录，2表示菜单，3表示按钮
    private Integer type;

    //权限标识或权限表达式
    private String perms;

    //排序号
    private Integer orderNum;

    //是否拥有权限，该字段不存入数据库，查询时使用
    private boolean hasPermission;

    //父级菜单
    private MenuBO parent;

    //子菜单
    private List<MenuBO> children;

    //角色列表
    private List<RoleBO> roles;

    //父Id
    private Long pid;

    //创建时间
    private Timestamp createTime;

    //最后修改时间
    private Timestamp modifyTime;

    //移动方向
    private Integer maveDirection;
}
