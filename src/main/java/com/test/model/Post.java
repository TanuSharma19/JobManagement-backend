package com.test.model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobPost")
public class Post {
	
	private String desc;
	private int exp;
	private String profile;
	private String techs[];
	public Post() {
		super();
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String[] getTechs() {
		return techs;
	}
	public void setTechs(String[] techs) {
		this.techs = techs;
	}
	@Override
	public String toString() {
		return "Post [desc=" + desc + ", exp=" + exp + ", profile=" + profile + ", techs="
				+ Arrays.toString(techs) + "]";
	}
	
	

}
