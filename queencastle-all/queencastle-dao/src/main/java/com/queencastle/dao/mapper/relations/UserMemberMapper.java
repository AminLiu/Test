package com.queencastle.dao.mapper.relations;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import com.queencastle.dao.model.relations.MemberType;
import com.queencastle.dao.model.relations.UserMember;
import com.queencastle.dao.vo.CountVO;

public interface UserMemberMapper {
    int insert(UserMember userMember);

    UserMember getById(@Param("id") String id);

    List<UserMember> getByUserId(@Param("userId") String userId);

    List<UserMember> getByGroupId(@Param("groupId") String goupId);

    Integer getUserMembersCountByParams(@Param("queryParam") Map<String, Object> queryParam);

    List<UserMember> getUserMembersByParams(@Param("page") Pageable pageable,
            @Param("queryParam") Map<String, Object> queryParam);

    String getMaxCodeByGroupId(@Param("groupId") String groupId);

    List<UserMember> getUserIdByCodeAndType(@Param("Code") String groupCode,
            @Param("type") MemberType type);

    List<CountVO> getAllUsableGroupId(@Param("groupSize") int groupSize);

    Integer getMyMembersCountByParams(@Param("map") Map<String, Object> map);

    List<UserMember> getMyMembersByParams(@Param("page") Pageable pageable,
            @Param("map") Map<String, Object> map);

    int judgeMember(@Param("userId") String userId);

    UserMember getByGroupIdAndUserId(@Param("groupId") String groupId,
            @Param("userId") String userId);

    UserMember getLatestByUserId(@Param("userId") String userId);
}
