package com.ruisitech.bi.web.app;

import com.alibaba.fastjson.JSONObject;
import com.ruisitech.bi.service.frame.UserService;
import com.ruisitech.bi.util.RSBIUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/app")
public class AppUserController {
	
	@Autowired
	private UserService service;

	@RequestMapping(value="/UInfo.action")
	public @ResponseBody
    Object userInfo() {
		Integer userId = RSBIUtils.getLoginUserInfo().getUserId();
		Map<String, Object> ret = service.appUserinfo(userId);
		return ret;
	}
}
