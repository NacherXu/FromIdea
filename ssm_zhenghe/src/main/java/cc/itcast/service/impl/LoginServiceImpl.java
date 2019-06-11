package cc.itcast.service.impl;

import cc.itcast.dao.LoginDao;
import cc.itcast.domain.Items;
import cc.itcast.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Override
    public Items findOne(Integer id) {
        return loginDao.findOne(id);
    }
}
