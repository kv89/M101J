package com.sparkjava;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

public class SparkFreemarkerStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(SparkFreemarkerStyle.class, "/");

//		Spark.get("/", new Route() {
//			public Object handle(Request req, Response resp) throws Exception {
//				try {
//					Template t = cfg.getTemplate("hello.ftl");
//					StringWriter sw = new StringWriter();
//					Map<String, Object> helloMap = new HashMap<String, Object>();
//					helloMap.put("name", "Freemarker");
//
//					t.process(helloMap, sw);
////					System.out.println(sw);
//					return sw;
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				return "failed ! = 500";
//			}
//
//		});
	}

}
