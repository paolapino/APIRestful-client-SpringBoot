package com.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;



public class Mongodb {

}
/*
@Configuration
@EnableMongoRepositories (basePackages="com.springboot.MongoDB.repository")
public class Mongodb extends AbstractMongoClientConfiguration{

    @Value("${spring.data.mongodb.host}")
    private String host;
 
    @Value("${spring.data.mongodb.port}")
    private int port;
 
    @Value("${spring.data.mongodb.database}")
    private String dbName;
    
    @Value("${spring.data.mongodb.username}")
    private String username;
    
    @Value("${spring.data.mongodb.password}")
    private String password;
    
    @Value("spring.data.mongodb.authentication-database")
    private String autentificacion;
	
	@Override
	protected String getDatabaseName() {
		
		return dbName;
	}
	
	@Override
    public MongoClient mongoClient() {
        return MongoClients.create(host + ":" + port);
    }

}
*/
