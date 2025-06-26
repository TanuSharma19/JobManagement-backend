package com.test.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Post;
import com.test.repositry.PostRepositries;
import com.test.repositry.SearchRepositry;
import com.test.repositry.SearchRepositryImplementation;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
	
	@Autowired
	PostRepositries repo;
	
	@Autowired
	SearchRepositry srepo;
	
	@GetMapping("/posts")
	public List<Post> allPosts()
	{
		
		
		return repo.findAll();
		
	}
	
	@GetMapping("/posts/{text}")
	public List<Post> searchPost(@PathVariable String text)
	{
		
		
		return srepo.findByText(text);
		
	}
	
	@PostMapping("/post")
	public Post addPost(@RequestBody Post post)
	{
		return repo.save(post);
		
	}

}
