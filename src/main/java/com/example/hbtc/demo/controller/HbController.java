/**
 * @projectName demo
 * @package com.example.hbtc.demo.controller
 * @className com.example.hbtc.demo.controller.HbController
 * @copyright Copyright 2020 Thunisoft, Inc All rights reserved.
 */
package com.example.hbtc.demo.controller;

import com.example.hbtc.demo.service.BiteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * HbController
 *
 * @description 货币套利Controller
 * @author zhangyifan
 * @date 2021/4/26 10:30
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/api/hb")
public class HbController {
    @Resource
    private BiteService biteService;

    /**
     *
     * HbController
     * @description 也可通过接口调用查看日志
     * @return org.springframework.http.ResponseEntity
     * @date 2021/4/26 10:41
     * @author zhangyifan
     * @version 1.0
     */
    @GetMapping(value = "/hbtl")
    public ResponseEntity gxDzdm() {
        // 查询两个交易平台货币ETHUSDT和BTCUSDT实时价格并比较，输出日志
        String ethusdt = biteService.ethusdt();
        String btcusdt = biteService.btcusdt();
        return new ResponseEntity(ethusdt + btcusdt, HttpStatus.OK);
    }
}
