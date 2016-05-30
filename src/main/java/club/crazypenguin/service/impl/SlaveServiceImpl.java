package club.crazypenguin.service.impl;

import club.crazypenguin.commons.annotation.DataSourceChange;
import club.crazypenguin.mapper.SlaveMapper;
import club.crazypenguin.service.SlaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SlaveServiceImpl implements SlaveService {

    @Autowired
    private SlaveMapper slaveMapper;

    @Override
    @DataSourceChange(slave = true)
    public Integer count() {
        return slaveMapper.count();
    }


}
