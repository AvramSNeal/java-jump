package com.collabera.mongo;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
//UserLoginDao class for connecting and 
//accessing the user collection in MongoDB

public class UserLoginDao {
	private MongoClient mongoClient = null;
	private MongoDatabase database = null;
	private MongoCollection<User> collection = null;
	public void connectToMongo() {
		CodecProvider pojoCodecProvider = PojoCodecProvider.builder().
		automatic(true).build();
		CodecRegistry pojoCodecRegistry =
		fromRegistries(MongoClient.getDefaultCodecRegistry(),
		fromProviders(pojoCodecProvider));

		mongoClient = new MongoClient( "localhost" , 27017 );
		database = mongoClient.getDatabase("mydb")
		.withCodecRegistry(pojoCodecRegistry);
		collection = database.getCollection("users", User.class);
		System.out.println(collection);
	}
	
	public User findUser(String userName, String password) {
		System.out.println("collection="+collection);
		System.out.println(userName + " " + password);
		User user = new User();
		user = collection.find(
		Filters.and(
				Filters.eq("userName", userName),
				Filters.eq("password", password)
				)).first();
		System.out.println(user);
		System.out.println("collection = " + collection);
		return user;
	}
}
