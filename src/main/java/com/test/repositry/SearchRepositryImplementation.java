package com.test.repositry;

import java.util.ArrayList;
import java.util.Arrays;
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import com.test.model.Post;

@Component
public class SearchRepositryImplementation implements SearchRepositry{

	@Autowired
	 MongoClient client;
	
	@Autowired
	MongoConverter converter;
	
	@Override
	public List<Post> findByText(String text) {
		List<Post> posts = new ArrayList<Post>();
		 MongoDatabase database = client.getDatabase("JobManage");
			MongoCollection<Document> collection = database.getCollection("JobPost");
			AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search", 
			    new Document("text", 
			    new Document("query", text)
			                .append("path", Arrays.asList("techs", "desc", "profile")))), 
			    new Document("$sort", 
			    new Document("exp", 1L))));
		result.forEach(doc -> posts.add(converter.read(Post.class, doc)));
		return posts;
	}

	
}
