package com.youxu.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youxu.common.utils.JSONResult;
import com.youxu.web.service.CulsterService;

/**
 * @Description: 订购商品controller
 */
@Controller
public class PayController {
	
	@Autowired
	private CulsterService buyService;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/buy/{itemId}")
	@ResponseBody
	public JSONResult doGetlogin(@PathVariable("itemId") String itemId) {
		
		if (StringUtils.isNotBlank(itemId)) {
			buyService.displayBuy(itemId);
		} else {
			return JSONResult.errorMsg("商品id不能为空");
		}
		
		return JSONResult.ok();
	}
	
	@GetMapping("/buy1/{itemId}")
	@ResponseBody
	public JSONResult doGetlogin1(@PathVariable("itemId") String itemId) {
				
		return JSONResult.ok("你好,itemId="+itemId);
	}
	
}
