package com.domlin.strategy.entity;

import com.changhong.sei.core.entity.BaseAuditableEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 项目与模块关联表(StrategyProjectModuleRelation)实体类
 *
 * @author sei
 * @since 2023-05-09 15:13:20
 */
@Entity
@Table(name = "strategy_project_module_relation")
@DynamicInsert
@DynamicUpdate
public class StrategyProjectModuleRelation extends BaseAuditableEntity implements Serializable {
    private static final long serialVersionUID = -43420011948884121L;
    /**
     * 项目id
     */
    @Column(name = "project_id")
    private String projectId;
    /**
     * 成员id
     */
    @Column(name = "moduler_id")
    private String modulerId;


    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getModulerId() {
        return modulerId;
    }

    public void setModulerId(String modulerId) {
        this.modulerId = modulerId;
    }

}
