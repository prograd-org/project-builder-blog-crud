package utility;

import model.Blog;

//progression3

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface
{
	String a[]= {"a55hole","acrotomophilia","aeolus","ahole","alabama hot pocket","	alaskan pipeline","anal","anal impaler","anal leakage","analprobe",
			      "anilingus","anus","apeshit","ar5e","areola", "areole","arian", "arrse", "arse","arsehole","aryan","ass", "ass fuck",
			      		 " ass fuck"," ass hole"};

	@Override
	public boolean checkBlogTitle(Blog blog) 
	{
		String title=blog.getBlogTitle();
		for(int i=0;i<25;i++)
		{
			if(title.equalsIgnoreCase(a[i]))
			{
				System.out.println(a[i]);
				return true;
			}
		}
	
		return false;
	}

	@Override
	public boolean checkBlogDescription(Blog blog)
	{
		String description=blog.getBlogDescription();
		for(int i=0;i<25;i++)
			{
			if(description.equalsIgnoreCase(a[i]))
				return true;
		}
	     return false;
	}

	@Override
	
	public boolean checkBlog(Blog blog)
	{
		if((checkBlogTitle(blog))||(checkBlogDescription(blog)))
			return false;
		return true;
	}
	
}