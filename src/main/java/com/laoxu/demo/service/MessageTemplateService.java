package com.laoxu.demo.service;

import com.laoxu.demo.model.MessageTemplate;

import java.util.List;

public interface MessageTemplateService {

    List<MessageTemplate> getMessageTemplateList(String unionId,String hospitalId,Integer type,Integer status);


}
