package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		for(Blog b:list) {
			System.out.println(b);
		}
		return list;
		
	}
	public List<Blog> updateBlog(Blog blog) throws IOException{
		int index=list.indexOf(blog);
		list.set(index,blog);
		return list;
	
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		list.remove(blog);
		return list;
		
	}
}
