package com.domlin.strategy.api;

import com.changhong.sei.core.api.BaseEntityApi;
import com.changhong.sei.core.dto.ResultData;
import com.changhong.sei.core.dto.serach.PageResult;
import com.changhong.sei.core.dto.serach.Search;
import com.domlin.strategy.dto.StrategyUserDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * 人员信息(StrategyUser)API
 *
 * @author sei
 * @since 2023-05-09 15:13:34
 * TODO @FeignClient(name = "请修改为项目服务名")
 */
@Valid
@FeignClient(name = "sei-strategy-api", path = StrategyUserApi.PATH)
public interface StrategyUserApi extends BaseEntityApi<StrategyUserDto> {
    String PATH = "strategyUser";

    //写一个分页查询方法
    @PostMapping(path = "findByPage")
    @ApiOperation("分页查询strategyUser")
    ResultData<PageResult<StrategyUserDto>> findByPage(@RequestBody Search search);

    //写一个方法，更新strategyUser
    @PostMapping(path = "update")
    @ApiOperation("更新strategyUser")
    ResultData<StrategyUserDto> update(@RequestBody StrategyUserDto strategyUser);

    //写一个导出方法，导出全部strategyUser
    @PostMapping(path = "export")
    @ApiOperation(value = "导出全部strategyUser", notes = "导出全部strategyUser")
    ResultData<List<StrategyUserDto>> export(@RequestBody Search search);

    //写一个方法导入strategyUser
    @PostMapping(path = "uploadStrategyUser")
    @ApiOperation(value = "导入strategyUser", notes = "导入strategyUser")
    ResultData<String> uploadStrategyUser(@RequestBody List<StrategyUserDto> list) throws Exception;


}
