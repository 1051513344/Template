package com.laoxu.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.laoxu.demo.enumeration.MessageTypeEnumeration.*;
import com.laoxu.demo.model.Content;
import com.laoxu.demo.model.MessageTemplate;
import com.laoxu.demo.service.MessageTemplateService;
import com.laoxu.demo.service.SendMessageThreadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SendMessageThreadServiceImpl implements SendMessageThreadService {

    @Autowired
    private MessageTemplateService messageTemplateService;

    @Override
    public void sendMsgBySendType(Integer sendId) {

        List<MessageType> messageTypeList = MessageType.getMessageTypeList(sendId);

        for(MessageType messageType : messageTypeList){

            log.info("type:{}", messageType.getCode());

            List<MessageTemplate> messageTemplates = messageTemplateService.getMessageTemplateList("130123", "1118011814561100810",messageType.getCode(),1);
            log.info("短信模板：{}", JSON.toJSONString(messageTemplates));

            log.info("messageType对象：{}",messageType);
            log.info("messageType.sendId：{}",messageType.sendId);
            log.info("messageType.code：{}",messageType.code);
            log.info("messageType.message：{}",messageType.message);
            for (MessageTemplate messageTemplate : messageTemplates) {
                log.info("=========> messageTemplate: {}", messageTemplate);
                Content c = new Content();
                c.setPatientName("【病人名字】");
                c.setTeamName("【团队名字】");
                c.setLastMessage("【最后的消息】");

                String content = getContent(c, messageTemplate);
                log.info("content：{}", content);
            }

        }

    }


    public String getContent(Content cnt, MessageTemplate messageTemplate){
        String content = messageTemplate.getContent();
        if(content.indexOf(ContentEnum.PATIENT_NAME) > -1){
            content = content.replaceAll(ContentEnum.PATIENT_NAME,
                    cnt.getPatientName());
        }
        if(content.indexOf(ContentEnum.TEAM_NAME) > -1){
            content = content.replaceAll(ContentEnum.TEAM_NAME,
                    cnt.getTeamName());
        }
        if(content.indexOf(ContentEnum.LAST_MESSAGE) > -1){
            content = content.replaceAll(ContentEnum.LAST_MESSAGE,
                    cnt.getLastMessage());
        }

        return content;
    }


}
