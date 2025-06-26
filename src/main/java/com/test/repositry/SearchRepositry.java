package com.test.repositry;

import java.util.List;

import com.test.model.Post;

public interface SearchRepositry {

	List<Post> findByText(String text);
	
}
