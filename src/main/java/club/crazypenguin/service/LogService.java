package club.crazypenguin.service;

import club.crazypenguin.commons.utils.PageInfo;
import club.crazypenguin.model.SysLog;

/**
 * @description：操作日志
 * @author：zhixuan.wang
 * @date：2015/10/30 10:35
 */
public interface LogService {

    void insertLog(SysLog sysLog);

    void findDataGrid(PageInfo pageInfo);
}
