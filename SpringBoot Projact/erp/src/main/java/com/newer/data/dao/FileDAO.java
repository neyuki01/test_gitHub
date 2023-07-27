package com.newer.data.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.newer.data.entity.File;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileDAO extends BaseMapper<File> {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(File record);

    File selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);
}