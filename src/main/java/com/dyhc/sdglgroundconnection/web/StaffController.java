package com.dyhc.sdglgroundconnection.web;

import com.dyhc.sdglgroundconnection.service.StaffService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 人员 控制层
 **/
@RestController
public class StaffController  {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(StaffController.class);

    @Autowired
    private StaffService staffService;
    
    
    /**
     * 分页查看全部
     * @param pageNo
     * @param pageSize
     * @param staffname
     * @return
     */
    @RequestMapping("/showstaffLike.html")
    public ReponseResult StaffLike(@RequestParam("page") Integer pageNo, @RequestParam("limit") Integer pageSize, @RequestParam("staffname")String staffname){
        try{
            System.out.println("..."+staffname+"...");
            PageInfo<Staff> pageInfoTravel=staffService.listStaffLike(pageNo,pageSize,staffname);
            ReponseResult<List> data = ReponseResult.ok(pageInfoTravel.getList(), pageInfoTravel.getTotal(), "分页获取组团社成功！");
            logger.info(" method:StaffLike  分页获取组团社成功！");
            return data;
        }catch (Exception e){
            logger.error(" method:StaffLike  获取组团社数据失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Object> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 删除   修改
     * @param staff
     * @return
     */
    @RequestMapping("/StaffUpd.html")
    public ReponseResult<Integer> StaffUpd(Staff staff){
        try{
            Integer result=0;
            Integer data=0;
            result=staffService.getStaffUpd(staff);
            if(result>0){
                data=1;
            }
            logger.info(" method:showTravelupdlala  删除人员成功！");
            return ReponseResult.ok(data,"删除人员成功！");
        }catch (Exception e){
            logger.error(" method:showTravelupdlala  删除人员失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Integer> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 修改
     * @param staff
     * @return
     */
    @RequestMapping("/StaffUpdTwo.html")
    public ReponseResult<Integer> StaffUpdTwo(Staff staff){
        try{
            Integer result=0;
            Integer data=0;
            result=staffService.getStaffUpdTwo(staff);
            if(result>0){
                data=1;
            }
            logger.info(" method:StaffUpdTwo  修改人员成功！");
            return ReponseResult.ok(data,"修改人员成功！");
        }catch (Exception e){
            logger.error(" method:StaffUpdTwo  修改人员失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Integer> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    /**
     * 添加
     * @param staff
     * @return
     */
    @RequestMapping("/StaffAdd.html")
    public ReponseResult<Integer> StaffAdd(Staff staff){
        try{
            Integer result=0;
            Integer data=0;
            result=staffService.getStaffAdd(staff);
            if(result>0){
                data=1;
            }
            logger.info(" method:StaffAdd  添加人员成功！");
            return ReponseResult.ok(data,"修改人员成功！");
        }catch (Exception e){
            logger.error(" method:StaffAdd  添加人员失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Integer> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }

    /**
     * 修改    查看
     * @param staffId
     * @return
     */
    @RequestMapping("/StaffUpdTwoById.html")
    public ReponseResult StaffUpdTwoById(Integer staffId){
        try{
            Staff result=staffService.getStaffUpdTwoById(staffId);
            logger.info(" method:StaffAdd  添加人员成功！");
            return ReponseResult.ok(result,"修改人员成功！");
        }catch (Exception e){
            logger.error(" method:StaffAdd  添加人员失败，系统出现异常！");
            e.printStackTrace();
            ReponseResult<Integer> err = ReponseResult.err("系统出现异常！");
            return err;
        }
    }
    
    
}
