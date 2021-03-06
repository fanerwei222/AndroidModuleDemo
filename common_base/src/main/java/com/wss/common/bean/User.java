package com.wss.common.bean;

import com.wss.common.base.bean.BaseBean;

import lombok.Getter;
import lombok.Setter;

/**
 * Describe：置业顾问信息
 * Created by 吴天强 on 2020/5/6.
 */
@Getter
@Setter
public class User extends BaseBean {

    /**
     * email : banshengcy@163.com
     * icon :
     * id : 1260
     * password : *******
     * token :
     * type : 0
     * username : 于慢慢家的吴蜀黍
     */

    private Integer id;
    private String username;
    private String email;
    private String icon;
    private String password;
    private String token;
    private int type;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}