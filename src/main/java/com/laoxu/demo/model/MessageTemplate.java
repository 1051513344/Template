package com.laoxu.demo.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Table(name = "message_template")
@Data
@Accessors(chain = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class MessageTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 医联体id
     */
    @Column(name = "union_id")
    private String  unionId;

    private String hospitalId;

    /**
     * 类型
     */
    private Integer type;

    private Integer status;

    private Integer userType;

    private Integer consultType;

    /**
     * 类型说明
     */
    @Column(name = "type_explain")
    private String typeExplain;

    /**
     * 短信发送类型  1 文字  2 语音  3排班消息 4推送
     */
    @Column(name = "msg_type")
    private Integer msgType;

    private String title;
    /**
     * 短信内容（其中带 ## 的字段是需要替换填充的 ）
     */
    private String content;

    /**
     * 跳转地址，为消息类型时为业务id
     */
    private String url;

    /**
     * 小程序跳转地址，当msgType = 3 消息类型时为消息图标
     */
    private String miniUrl;

    private String templateId;

    private Integer informationType;

    /**
     * 是否删除  0未删除 1已删除
     */
    @Column(name = "is_delete")
    private String isDelete;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

}