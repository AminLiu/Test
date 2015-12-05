package com.queencastle.dao.mapper.relations;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import com.queencastle.dao.model.relations.GroupType;
import com.queencastle.dao.model.relations.UserGroup;

public interface UserGroupMapper {
    int insert(UserGroup userGroup);

    UserGroup getById(@Param("id") String id);

    List<UserGroup> getByCode(@Param("code") String code);

    Integer getUserGroupsCountByParams(@Param("map") Map<String, Object> map);

    List<UserGroup> getUserGroupsByParams(@Param("page") Pageable pageable,
            @Param("map") Map<String, Object> map);

    UserGroup getByGroupCode(@Param("groupCode") String groupCode);

    boolean updataById(UserGroup userGroup);

    List<String> getCodeListByBase(@Param("baseCode") String base);

    List<UserGroup> getByMasterId(@Param("masterId") String masterId, @Param("type") GroupType type);


}
