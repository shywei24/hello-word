package com.yuefan.msc.controller.admin;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductConfigController {
	private static final Map<Class<?>, String> controllerPathMapping = new ConcurrentHashMap<Class<?>, String>();
	
	@RequestMapping("/productConfig")
	public String getProductConfigList(){
		return "login";
		//return getRelativePath("login");
	}
	
	protected String getRelativePath(String path) {
		Class<?> clz = getClass();
		String controllerPath = controllerPathMapping.get(clz);
		if (controllerPath == null) {
			Class<?> top = clz;
			RequestMapping mappings = null;
			while (top != Object.class) {
				mappings = top.getAnnotation(RequestMapping.class);
				if (mappings != null) {
					break;
				}
				top = top.getSuperclass();
			}
			if (mappings != null) {
				controllerPath = mappings.value()[0];
			} else {
				controllerPath = "";
			}
			controllerPathMapping.put(clz, controllerPath);
		}
		return controllerPath + path;
	}
}
