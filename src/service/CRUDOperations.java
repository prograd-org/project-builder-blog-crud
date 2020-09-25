package service;
import java.util.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import model.Blog;
import model.User;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	//Blog objUser = new Blog();
	
	
	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		 System.out.println("--------------------------------------------");
		//using for each to iterate over list
		for(Blog model : list) {
            System.out.println(model.getBlogTitle());
        }
		//
		
		 System.out.println("--------------------------------------------");
//		Iterator<Blog> blogIterator = list.iterator();
//		while (blogIterator.hasNext()) {
//			
//			 System.out.println(blogIterator.next());
//			
//		}
		
		 System.out.println("--------------------------------------------");
		 System.out.println("printing according to titles");
		
		list.sort((Blog b1,Blog b2) -> b1.getBlogTitle().compareTo(b2.getBlogTitle()));
		
		
		 //list.sort((Blog b1,Blog b2) -> b1.getDate().((b2.getBlogTitle());
		for(Blog model : list) {
            System.out.println(model.getBlogTitle());
        }
	
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		list.add(list.get(list.indexOf(blog));
		return list;
		
	}
	public List<Blog> updateBlog(Blog blog) throws IOException{
		list.set(list.indexOf(blog), blog);
		return list;
	
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		list.remove(blog);
		return list;
		
	}
}
