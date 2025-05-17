package com.sky.controller.admin;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.SetmealService;
import com.sky.vo.SetmealVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: HuangXuan
 * @CreateTime: 2025-05-09
 * @Description:
 * @email hxtxyydsa@gmail.com; 3441578327@qq.com
 * @Version: 1.0
 */

@RestController
@RequestMapping("/admin/setmeal")
@Api(tags = "套餐相关接口")
@Slf4j
public class SetmealController {

    @Autowired
    SetmealService setmealService;
    /**
     * 套餐保存
     * @return
     */
    @ApiOperation("新增套餐")
    @PostMapping
    @CacheEvict(value = "setmealCache",key = "setmealDTO.categoryId")
    public Result<String> save(@RequestBody SetmealDTO setmealDTO){
        log.info("套餐保存");
        setmealService.saveWithDish(setmealDTO);
        return Result.success("套餐保存成功");
    }

    /**
     * 套餐分页查询
     * @return
     */
    @ApiOperation("套餐分页查询")
    @GetMapping("/page")
    public Result<PageResult> page(SetmealPageQueryDTO setmealPageQueryDTO){
        log.info("套餐分页查询");
        PageResult pageResult = setmealService.page(setmealPageQueryDTO);
        return Result.success(pageResult);
    }

    /**
     * 套餐批量删除
     * @return
     */
    @ApiOperation("套餐批量删除")
    @DeleteMapping
    @CacheEvict(value = "setmealCache",allEntries = true)
    public Result<String> delete(@RequestParam List<Long> ids){
        log.info("套餐批量删除");
        setmealService.deleteBatch(ids);
        return Result.success("套餐批量删除成功");
    }

    /**
     * 修改套餐
     * @return
     */
    @ApiOperation("修改套餐")
    @PutMapping
    @CacheEvict(value = "setmealCache",allEntries = true)
    public Result<String> update(@RequestBody SetmealDTO setmealDTO){
        log.info("修改套餐");
        setmealService.update(setmealDTO);
        return Result.success("修改套餐成功");
    }

    /**
     * 根据id查询套餐，用于修改页面回显数据
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ApiOperation("根据id查询套餐")
    public Result<SetmealVO> getById(@PathVariable Long id) {
        SetmealVO setmealVO = setmealService.getByIdWithDish(id);
        return Result.success(setmealVO);
    }

    /**
     * 套餐起售停售
     * @param status
     * @param id
     * @return
     */
    @ApiOperation("套餐起售停售")
    @PostMapping("/status/{status}")
    @CacheEvict(value = "setmealCache",allEntries = true)
    public Result<String> startOrStop(@PathVariable Integer status, Long id) {
        log.info("套餐起售停售:{}", status);
        setmealService.startOrStop(status, id);
        return Result.success("起售停售成功");
    }

}
