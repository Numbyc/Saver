package com.numbyc.saver.mapper;

import com.numbyc.saver.model.Consume;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ConsumeMapper {

    @Select("select * from consume_record")
    @Results({
            @Result(property = "consumeType",  column = "consume_type"),
            @Result(property = "consumeAmount", column = "consume_amount")
    })
    List<Consume> getAll();

    @Insert("insert into consume_record(consume_id, consume_type, consume_amount) values(#{consumeId}, #{consumeType}, #{consumeAmount})")
    void addNew(Consume consume);

    @Delete("delete * from consume_record where consume_id = #{id}")
    void delete(String id);
}
