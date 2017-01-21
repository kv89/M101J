package com.sparkjava;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class HelloWorldFreemarkerStyle {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(HelloWorldFreemarkerStyle.class, "/");
		
		try {
			Template t = cfg.getTemplate("hello.ftl");
			StringWriter sw  = new StringWriter();
			Map<String, Object> helloMap= new HashMap<String, Object>();
			helloMap.put("name", "Freemarker");
			
			t.process(helloMap, sw);
			System.out.println(sw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
