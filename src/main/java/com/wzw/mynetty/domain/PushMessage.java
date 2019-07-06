package com.wzw.mynetty.domain;

import lombok.Data;

/**
 * @Author: Joker_wang
 * @Date: 2019/6/20 23:32
 * @Version 1.0.0
 */
@Data
public class PushMessage {
    //@ApiModelProperty(value = "登录用户编号")
    private String loginUserNum;

    //@ApiModelProperty(value = "推送内容")
    private String content;
}
