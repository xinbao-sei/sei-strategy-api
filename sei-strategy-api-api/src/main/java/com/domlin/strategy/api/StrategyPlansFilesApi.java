package com.domlin.strategy.api;

import com.changhong.sei.core.api.BaseEntityApi;
import com.domlin.strategy.dto.StrategyPlansFilesDto;
import org.springframework.cloud.openfeign.FeignClient;

import javax.validation.Valid;

/**
 * 项目与文件关联表(StrategyPlansFiles)API
 *
 * @author sei
 * @since 2023-05-09 15:12:45
 * TODO @FeignClient(name = "请修改为项目服务名")
 */
@Valid
@FeignClient(name = "sei-strategy-api", path = StrategyPlansFilesApi.PATH)
public interface StrategyPlansFilesApi extends BaseEntityApi<StrategyPlansFilesDto> {
    String PATH = "strategyPlansFiles";
}
