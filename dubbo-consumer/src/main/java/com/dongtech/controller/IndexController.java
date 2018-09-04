package com.dongtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: dongbao
 * @Date: 2018/9/4 09:59
 * @Description:
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(Model model){
        //历史年化收益率
        model.addAttribute("historyAverageRate",15);
        //平台用户数
        model.addAttribute("allUserCount",999999);
        //累计成交额
        model.addAttribute("allBidMoney","999,999,999.00");
        return "jsp/index";
    }
}
