package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import model.Blog;

public class CRUDOperations
{
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog> createBlog(Blog blog) throws IOException 
	{
		list.add(blog);
		//System.out.println("after  adding"+list);
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException
	{
		//System.out.println(list);
		
		return list;
		
	}
	public List<Blog> updateBlog(Blog blog) throws IOException
	{
		list.set(list.indexOf(blog), blog);
		
		return list;
	
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException
	{
	      list.remove(blog);
	      System.out.println("after remove "+list);
		return list;
		
	}
	
	
	
	
}