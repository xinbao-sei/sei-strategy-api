package com.domlin.strategy.entity;

import com.changhong.sei.core.entity.BaseAuditableEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 项目对接人员关联表(StrategyProjectContactRelation)实体类
 *
 * @author sei
 * @since 2023-05-09 15:13:08
 */
@Entity
@Table(name = "strategy_project_contact_relation")
@DynamicInsert
@DynamicUpdate
public class StrategyProjectContactRelation extends BaseAuditableEntity implements Serializable {
    private static final long serialVersionUID = -99878582830259552L;
    /**
     * 项目id
     */
    @Column(name = "project_id")
    private String projectId;
    /**
     * 成员id
     */
    @Column(name = "user_id")
    private String userId;


    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
