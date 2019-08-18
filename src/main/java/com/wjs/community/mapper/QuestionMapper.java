package com.wjs.community.mapper;

import com.wjs.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionMapper {
    @Insert("insert into question values(default,#{title},#{description},#{gmtCreate},#{gmtModified},#{tag},#{creator})")
    void insert(Question question);
}
