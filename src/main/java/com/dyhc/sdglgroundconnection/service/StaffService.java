package com.dyhc.sdglgroundconnection.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员业务接口
 **/
public interface StaffService {
  
  /**
     * 分页查看全部
     * @param pageNo
     * @param PageSize
     * @param staffname
     * @return
     * @throws Exception
     */
    PageInfo<Staff> listStaffLike(Integer pageNo, Integer PageSize,String staffname) throws Exception;
    /**
     * 删除 修改
     * @param staff
     * @return
     */
    Integer getStaffUpd(Staff staff);

    /**
     * 修改
     * @param staff
     * @return
     */
    Integer getStaffUpdTwo(Staff staff);

    /**
     * 添加
     * @param staff
     * @return
     */
    Integer getStaffAdd(Staff staff);

    /**
     * 修改  查看
     * @param staffId
     * @return
     */
    Staff getStaffUpdTwoById(Integer staffId);
}
