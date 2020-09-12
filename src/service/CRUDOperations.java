package service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog> addBlog(Blog blog) throws IOException {
		list.add(blog);
		
		Collections.sort(list, new Comparator<Blog>() {

			@Override
			public int compare(Blog b1, Blog b2) {
				// TODO Auto-generated method stub
				LocalDate d1 = b1.getDate();
				LocalDate d2 = b2.getDate();
				
				
				if(d1.compareTo(d2) != 0)
					return d1.compareTo(d2);
				
				String title1 = b1.getBlogTitle().toLowerCase();
				String title2 = b2.getBlogTitle().toLowerCase();
				
				return title1.compareTo(title2);
	
			}});
		
		 System.out.println("After Adding "+list);
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		List<Blog> viewBlog = new ArrayList<Blog>();
		viewBlog.add(list.get(list.indexOf(blog)));
		
		return viewBlog;
		
	}
	public List<Blog> updateBlog(Blog blog) throws IOException{
		list.set(list.indexOf(blog), blog);
		return list;
	
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		list.remove(blog);
	    System.out.println("After Removing "+list);
		return list;
		
	}
}
