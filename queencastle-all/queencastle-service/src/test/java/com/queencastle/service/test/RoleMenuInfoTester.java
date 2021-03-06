package com.queencastle.service.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import com.queencastle.dao.PageInfo;
import com.queencastle.dao.model.RoleMenuInfo;
import com.queencastle.dao.mybatis.IdTypeHandler;

public class RoleMenuInfoTester extends BaseTest {

    @Test
    @Ignore
    public void testInsert() {
        RoleMenuInfo roleMenuInfo = new RoleMenuInfo();
        for (int i = 1; i < 6; i++) {
            String roleId = IdTypeHandler.encode(i);
            String menuId = IdTypeHandler.encode(2L);
            roleMenuInfo.setRoleId(roleId);
            roleMenuInfo.setMenuId(menuId);
            roleMenuInfoService.insert(roleMenuInfo);
        }

    }

    @Test
    @Ignore
    public void testGetByRoleId() {
        for (int i = 1; i < 6; i++) {
            String roleId = IdTypeHandler.encode(i);
            List<RoleMenuInfo> list = roleMenuInfoService.getByRoleId(roleId);
            if (!CollectionUtils.isEmpty(list)) {
                for (RoleMenuInfo info : list) {
                    System.out.println(i + "-------->" + info.getMenuId());
                }
            }

        }
    }

    @Test
    @Ignore
    public void testUpdateById() {
        RoleMenuInfo roleMenuInfo = new RoleMenuInfo();
        String id = IdTypeHandler.encode(1);
        String roleId = IdTypeHandler.encode(5);
        String menuId = IdTypeHandler.encode(2);
        roleMenuInfo.setId(id);
        roleMenuInfo.setRoleId(roleId);
        roleMenuInfo.setMenuId(menuId);
        roleMenuInfoService.updateById(roleMenuInfo);

    }

    @Test
    @Ignore
    public void testGetById() {

        String id = IdTypeHandler.encode(10l);
        RoleMenuInfo roleMenuInfo = roleMenuInfoService.getById(id);
        if (roleMenuInfo != null) {

            System.out.println(roleMenuInfo.getRoleId());
            System.out.println(roleMenuInfo.getMenuId());
        }

    }

    @Test
    @Ignore
    public void testPageInfo() {
        Map<String, Object> map = new HashMap<String, Object>();
        PageInfo<RoleMenuInfo> pageInfo = roleMenuInfoService.getRoleMenuByParams(1, 10, map);
        if (pageInfo != null) {
            System.out.println(pageInfo.getRows().size());
        }
    }
}
