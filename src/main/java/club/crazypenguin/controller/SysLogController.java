package club.crazypenguin.controller;

import club.crazypenguin.commons.utils.PageInfo;
import club.crazypenguin.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @description：日志管理
 * @author：zhixuan.wang
 * @date：2015/10/30 18:06
 */
@Controller
@RequestMapping("/sysLog")
public class SysLogController {

    @Autowired
    private LogService logService;


    @RequestMapping(value = "/manager", method = RequestMethod.GET)
    public String manager() {
        return "/admin/syslog";
    }


    @RequestMapping(value = "/dataGrid", method = RequestMethod.POST)
    @ResponseBody
    public PageInfo dataGrid(Integer page, Integer rows) {
        PageInfo pageInfo = new PageInfo(page, rows);
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        logService.findDataGrid(pageInfo);
        return pageInfo;
    }
}
