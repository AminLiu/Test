package com.queencastle.dao.model.relations;

import com.queencastle.dao.model.BaseModel;

/**
 * 群成员,成员编号是从群编号的基础上进行三位的扩展
 * 
 * @author YuDongwei
 *
 */
public class UserMember extends BaseModel {

    private static final long serialVersionUID = -838134330269726902L;

    /** 群编号 */
    private String groupId;
    /** 用户编号 */
    private String userId;
    /** 用户编码 */
    private String code;
    /** 用户身份类型 */
    private MemberType type;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public MemberType getType() {
        return type;
    }

    public void setType(MemberType type) {
        this.type = type;
    }



}
