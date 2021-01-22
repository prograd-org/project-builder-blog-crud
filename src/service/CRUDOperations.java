package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		return list;
	}
	
	
	public List<Blog> updateBlog(Blog blog) throws IOException{
		return null;
	
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		return null;
		
	}
	public List addBlog(Blog blog)throws IOException {
		list.add(blog);
		return list;
	}
	public List viewBlog(Blog blog) throws IOException {
		
		Iterator<Blog> i= list.iterator();
		while(i.hasNext())
		{
			Object b= i.next();
			System.out.println(b);
		}
		return list;
	}
	
	public Object sortTitle(List<Blog> blog){
		Collections.sort(blog, (Blog b1, Blog b2) -> b1.getBlogTitle().compareTo(b2.getBlogTitle()));
		Collections.sort(blog, (Blog b1, Blog b2) -> b1.getDate().compareTo(b2.getDate()));
		list.add((Blog) blog);
		Iterator i=blog.iterator();
		while(i.hasNext()) {
			  Object ele   =i.next();
			System.out.println(ele);
		}
		return blog;
	}
}
