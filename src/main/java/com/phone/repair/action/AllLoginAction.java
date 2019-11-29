package com.phone.repair.action;

import com.phone.repair.commons.SpringIOC;
import com.phone.repair.dao.pojo.Admin;
import com.phone.repair.dao.pojo.Maintenance;
import com.phone.repair.service.iservice.IAdminService;
import com.phone.repair.service.iservice.IBaseService;
import com.phone.repair.service.iservice.IMaintenanceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AllLoginAction {

    @RequestMapping(value = "alllogin.do", method = RequestMethod.POST)
    public String AllLogin(@RequestParam() int pri, @RequestParam() String username, @RequestParam() String password) {
        if (pri == 1) {
            IAdminService adminService = (IAdminService) SpringIOC.getCtx().getBean("adminService");
            Admin admin = adminService.login(username, password);
            if (admin != null) {
                return "index";
            } else {
                return "error";
            }
        } else{
            IMaintenanceService maintenanceService = (IMaintenanceService) SpringIOC.getCtx().getBean("maintenanceService");
            Maintenance maintenance=maintenanceService.login(username,password);
            if (maintenance != null) {
                return "index1";
            } else {
                return "error";
            }
        }
    }
}
