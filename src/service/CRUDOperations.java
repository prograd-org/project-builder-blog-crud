package service;

/*
 Day - 5 We will perform CRUD operations using LIST.
Your task is to create a class called as CRUDOperations inside service folder.
Create a method called as public List addBlog(Blog blog).
Create a method called as public List viewBlog(Blog blog)
Your output is a list
Print the list in the console and also return the output to blog controller.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>();
	
	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		return list;
		
	}
	
	public List<Blog> updateBlog(Blog blog) throws IOException{
		return null;
	
	}
	
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		list.remove(blog);
			return list;
		
	}

}