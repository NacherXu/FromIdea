package cc.itcast.dao;

import cc.itcast.domain.Items;

public interface LoginDao {

    Items findOne(Integer id);
}
