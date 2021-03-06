package com.queencastle.service.interf;

import java.util.List;
import java.util.Map;

import com.queencastle.dao.PageInfo;
import com.queencastle.dao.model.UserRoleInfo;

public interface UserRoleInfoService {
    int insert(UserRoleInfo userRoleInfo);

    UserRoleInfo getById(String id);

    int updateById(UserRoleInfo userRoleInfo);

    List<UserRoleInfo> getByUserId(String userId);

    PageInfo<UserRoleInfo> getUserRoleByParams(int page, int rows, Map<String, Object> map);

    void saveOrUpdate(String userId, String[] roleArray);

    int deleteByUserId(String userId);
}
