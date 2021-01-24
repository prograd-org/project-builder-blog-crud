package service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import model.Blog;
/*Day - 5 We will perform CRUD operations using LIST.*
2.*Your task is to create a class called as CRUDOperations inside service folder.*
3.*Create a method called as public List<Blog> addBlog(Blog blog).*
4.*Create a method called as public List<Blog> viewBlog(Blog blog)*
5.*Your output is a list*
6.*Print the list in the console and also return the output to blog controller.*
*/
public class CRUDOperations {
	List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		CRUDOperations crud = new CRUDOperations();
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
		case 5: List<Blog> sorted = crud.sortByTitle();
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
		list.add(blog);
	}
	
	public void viewBlog() throws IOException{
		for(int i = 0;i < list.size();i++) {
			System.out.println("Blog title : "+list.get(i).getBlogTitle()+" desccription : "+list.get(i).getBlogDescription()+" Posted on: "+list.get(i).getDate());
		}
	}
	
	public List<Blog> sortByTitle(){
		List<Blog> sorted = new ArrayList<Blog>(list);
		sorted.sort((Blog blog1,Blog blog2) -> blog1.getBlogTitle().compareTo(blog2.getBlogTitle()));
	    return sorted;
	}
	
	public List<Blog> sortByDescription(){
		List<Blog> sorted = new ArrayList<Blog>(list);
		sorted.sort((Blog blog1,Blog blog2) -> blog1.getBlogDescription().compareTo(blog2.getBlogDescription()));
	    return sorted;
	}
	
	public List<Blog> updateBlog(Blog blog) throws IOException{
		for(int i = 0;i < list.size();i++) {
			if(list.get(i).getBlogTitle().equals(blog.getBlogTitle())) {
				list.set(i, blog);
			}
		}
		return list;
	
	}
	public List<Blog> deleteBlog(String title) throws IOException{
		for(int i = 0;i < list.size();i++) {
			if(list.get(i).getBlogTitle().equals(title)) {
				list.remove(i);
			}
		}
		return list;
	}
}

