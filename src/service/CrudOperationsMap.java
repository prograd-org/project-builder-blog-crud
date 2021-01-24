package service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import model.Blog;

public class CrudOperationsMap {
	int id = 1;
	HashMap<Integer,Blog> list=new LinkedHashMap<Integer,Blog>(); // Store the blog in the list
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		CrudOperationusingSet  crud = new CrudOperationusingSet();
		boolean flag = true;
		while(flag) {
		System.out.println("Select opeation 1.create 2.view 3.update 4.delete 5.sort by title 6.sort by description");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:	String title = sc.nextLine();
				String description = sc.nextLine();
				Blog blog = new Blog(title,description,LocalDate.now());
				crud.createBlog(blog);
					break;
		case 2:crud.viewBlog();
				break;
		case 3: String updatetitle = sc.nextLine();
				String updatedescription = sc.nextLine();
				Blog updatedblog = new Blog(updatetitle,updatedescription,LocalDate.now());
				crud.updateBlog(updatedblog);
				break;
		case 4: String blogtodelete = sc.nextLine();
		        crud.deleteBlog(blogtodelete);
		        break;
		case 5:List<Blog> sorted = crud.sortByTitle();
		        for(int  i =0;i < sorted.size();i++) {
		        	System.out.println(sorted.get(i).getBlogTitle()+" "+sorted.get(i).getBlogDescription());
		        }
		        break;
		case 6:
			List<Blog> sorted1 =  crud.sortByDescription();
			 for(int  i =0;i < sorted1.size();i++) {
		        	System.out.println(sorted1.get(i).getBlogTitle()+" "+sorted1.get(i).getBlogDescription());
		        }
			break;
		default:
			System.out.println("Bye Bye");
			flag = false;
		break;
		}
		}
		
	}
	public void createBlog(Blog blog) throws IOException {
		list.put(id,blog);
		id++;
	}
	
	public void viewBlog() throws IOException{
		list.entrySet().forEach(entry -> {System.out.println(entry.getValue().getBlogTitle()+" "+entry.getValue().getBlogDescription());});
	}
	
	public List<Blog> sortByTitle(){
	  List<Blog> sorted = new ArrayList<Blog>(list.values());
		sorted.sort((Blog blog1,Blog blog2) -> blog1.getBlogTitle().compareTo(blog2.getBlogTitle()));
	    return sorted;
	}
	
	public List<Blog> sortByDescription(){
		List<Blog> sorted = new ArrayList<Blog>(list.values());
		sorted.sort((Blog blog1,Blog blog2) -> blog1.getBlogDescription().compareTo(blog2.getBlogDescription()));
	    return sorted;
	}
	
	public HashMap<Integer,Blog> updateBlog(Blog blog) throws IOException{
		for(Entry<Integer, Blog> entry :  list.entrySet()){
		    if(entry.getValue().getBlogTitle().equals(blog.getBlogTitle())){
		    	entry.setValue(blog);
		    }
		}
		return list;
	}
	public HashMap<Integer,Blog> deleteBlog(String title) throws IOException{
		for(Entry<Integer, Blog> entry :  list.entrySet()){
		    if(entry.getValue().getBlogTitle().equals(title)){
		    	 list.remove(entry.getKey());
		    }
		}
		return list;
		}
}
