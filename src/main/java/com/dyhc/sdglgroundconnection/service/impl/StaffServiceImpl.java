package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.StaffMapper;
import com.dyhc.sdglgroundconnection.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员业务实现
 **/
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;
    
    /**
     * 分页查看全部
     * @param pageNo
     * @param PageSize
     * @param staffname
     * @return
     * @throws Exception
     */
    @Override
    public PageInfo<Staff> listStaffLike(Integer pageNo, Integer PageSize, String staffname) throws Exception {
        PageHelper.startPage(pageNo,PageSize,true);
        PageInfo<Staff> staff=new PageInfo<>(staffMapper.getStaffAll(staffname));
        return staff;
    }

    /**
     * 删除  修改
     * @param staff
     * @return
     */
    @Override
    public Integer getStaffUpd(Staff staff) {
        return staffMapper.getStaffUpd(staff);
    }

    /**
     * 修改
     * @param staff
     * @return
     */
    @Override
    public Integer getStaffUpdTwo(Staff staff) {
        return staffMapper.getStaffUpdTwo(staff);
    }

    /**
     * 添加
     * @param staff
     * @return
     */
    @Override
    public Integer getStaffAdd(Staff staff) {
        return staffMapper.insert(staff);
    }

    /**
     * 修改  查看
     * @param staffId
     * @return
     */
    @Override
    public Staff getStaffUpdTwoById(Integer staffId) {
        return staffMapper.getStaffUpdTwoById(staffId);
    }
    
}
