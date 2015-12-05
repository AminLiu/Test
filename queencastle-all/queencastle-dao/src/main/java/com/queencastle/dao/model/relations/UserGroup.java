package com.queencastle.dao.model.relations;

import com.queencastle.dao.model.BaseModel;

/**
 * 用户群管理，群编号规则前四个作为固定的编号，由系统统一指定，后面三位是组员的编号
 * 
 * @author YuDongwei
 *
 */
public class UserGroup extends BaseModel {

    private static final long serialVersionUID = -390181455726242702L;
    /** 群名称 */
    private String cname;
    /** 群编号 */
    private String code;
    /** 群图片 */
    private String img;
    /** 群简介 */
    private String profile;
    /** 群类型 */
    private GroupType type;
    /** 群主编号 */
    private String masterId;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public GroupType getType() {
        return type;
    }

    public void setType(GroupType type) {
        this.type = type;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

}
