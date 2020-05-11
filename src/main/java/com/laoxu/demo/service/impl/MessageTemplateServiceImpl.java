package com.laoxu.demo.service.impl;

import com.laoxu.demo.mapper.MessageTemplateMapper;
import com.laoxu.demo.model.MessageTemplate;
import com.laoxu.demo.service.MessageTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class MessageTemplateServiceImpl implements MessageTemplateService {

    @Autowired
    private MessageTemplateMapper messageTemplateMapper;

    @Override
    public List<MessageTemplate> getMessageTemplateList(
            String unionId, String hospitalId, Integer type,Integer status) {
        Example example = new Example(MessageTemplate.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("isDelete", "0")
                .andEqualTo("type",type)
                .andEqualTo("hospitalId",hospitalId)
                .andEqualTo("unionId",unionId)
                .andEqualTo("status",status);
        return messageTemplateMapper.selectByExample(example);
    }

}
