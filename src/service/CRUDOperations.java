package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import model.Blog;


public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog> add(Blog blog) throws IOException {
		list.add(blog);
		return list;
	}
	
	public List<Blog> view(Blog blog) throws IOException{
		list.add(blog);
		for(Blog text : list) {
			System.out.println(text);
		}
		return list;
		
	}
	public Object sortingbytitle(List<Blog> blog){
		Collections.sort(blog, (Blog b1, Blog b2) -> b1.getBlogTitle().compareTo(b2.getBlogTitle()));
		Collections.sort(blog, (Blog b1, Blog b2) -> b1.getDate().compareTo(b2.getDate()));
		list.add((Blog) blog);
		for(Blog text : blog) {
			System.out.println(text);
		}
		return blog;
	}
	
	public Object sortingusingset(List<Blog> blog) {
		ArrayList<Blog> list=new ArrayList<Blog>();

		list.sort((Blog b1,Blog b2)->b1.getBlogTitle().compareTo(b2.getBlogTitle()));
		list.sort((Blog b1,Blog b2)->b1.getDate().compareTo(b2.getDate()));

		return new LinkedHashSet<Blog>(list);

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
