package com.numbyc.saver.service;

import com.numbyc.saver.mapper.ConsumeMapper;
import com.numbyc.saver.model.Consume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConsumeService {

    @Autowired
    private ConsumeMapper consumeMapper;

    public List<Consume> getList() {
        return consumeMapper.getAll();
    }

    public void addNew(Consume consume) {
        consumeMapper.addNew(consume);
    }

    public void delete(String consumeId) {consumeMapper.delete(consumeId);};
}
