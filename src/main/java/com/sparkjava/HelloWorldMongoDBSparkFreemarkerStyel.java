package com.sparkjava;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import freemarker.template.Configuration;
import freemarker.template.Template;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

public class HelloWorldMongoDBSparkFreemarkerStyel {

	public static void main(String[] args) {
		final Configuration cfg = new Configuration();
		cfg.setClassForTemplateLoading(HelloWorldMongoDBSparkFreemarkerStyel.class, "/freemarker");
		
		MongoClient client = new MongoClient();
		MongoDatabase db = client.getDatabase("course");
		final MongoCollection<Document> collection = db.getCollection("hello");
		
		collection.drop();
		collection.insertOne(new Document("name","Vishal"));
//		Spark.get("/", new Route() {
//			public Object handle(Request req, Response resp) throws Exception {
//				StringWriter sw = new StringWriter();
//				try {
//					Template t = cfg.getTemplate("hello.ftl");
//					Document document = collection.find().first();
//
//					t.process(document, sw);
////					System.out.println(sw);
////					return sw;
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				return sw;
//			}
//
//		});
	}

}
