package service;
import java.io.IOException;
import java.util.ArrayList;


import java.util.List;

import model.Blog;


public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	
	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		list.sort((Blog b1,Blog b2) -> b1.getBlogTitle().compareTo(b2.getBlogTitle()));
	
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		return list;
		
	}
	public List<Blog> updateBlog(Blog blog) throws IOException{
		list.set(list.indexOf(blog), blog);
		return list;
	
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		list.remove(blog);
		System.out.println("removed");
		return list;
		
	}
}