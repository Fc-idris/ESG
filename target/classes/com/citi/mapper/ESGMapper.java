package com.citi.mapper;

import com.citi.pojo.ESG;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ESGMapper {
    List<ESG> getESGs();

    int save(ESG esg);


    ESG getESGById(Integer id);

    List<ESG> getESGByCode(Integer code);



}