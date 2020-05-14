package com.dyg.mydemo.test.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Duan Yigui
 * @date 2020-05-11
 */
@Data
public class User {
    private Long id;
    private String username;
    private String cipher;
    private String nikeName;
    private String phone;
    private String email;
    private LocalDateTime registerTime;
    private Long auditStatus;
    private Long status;
    private String remark;
    private boolean deleteFlag;
    private String createUser;
    private LocalDateTime createTime;
    private String updateUser;
    private LocalDateTime updateTime;
//    private int pageNo;
//    private int pageSize;
}
