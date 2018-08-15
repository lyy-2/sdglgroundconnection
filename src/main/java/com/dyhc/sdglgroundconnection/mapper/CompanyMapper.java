package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Company;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 公司信息
 **/
@Mapper
@Component
public interface CompanyMapper extends CommonMapper<Company>{
}
