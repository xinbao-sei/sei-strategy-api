package com.domlin.strategy.dto;

import com.changhong.sei.core.dto.BaseEntityDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 项目与文件关联表(StrategyPlansFiles)DTO类
 *
 * @author sei
 * @since 2023-05-09 15:12:44
 */
@ApiModel(description = "项目与文件关联表DTO")
public class StrategyPlansFilesDto extends BaseEntityDto {
    private static final long serialVersionUID = -72874092511379870L;
    /**
     * 项目id
     */
    @ApiModelProperty(value = "项目id")
    private String projectId;
    /**
     * 文件id
     */
    @ApiModelProperty(value = "文件id")
    private String fileId;


    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

}
