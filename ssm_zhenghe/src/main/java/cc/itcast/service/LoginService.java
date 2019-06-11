package cc.itcast.service;

import cc.itcast.domain.Items;

public interface LoginService {
    Items findOne(Integer id);
}
