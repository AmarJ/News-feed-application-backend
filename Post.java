import java.util.*;

public class Post implements Likeable, Comparable {
	protected int likes;
	protected String userName;
	protected Date timeStamp;
	
	public Post( String userName){
		Date rightNow = Calendar.getInstance().getTime();
		this.likes = 0;
		this.timeStamp = rightNow;
		this.userName = userName;
	}
	
	public int compareTo( Post p){	
		if ((this.timeStamp.before(p.timeStamp))){
			return 1;
		} else if ((this.timeStamp.equals(p.timeStamp))){
			return 0;
		} else{
			return -1;
		}
	}
	
	public void like(){
		this.likes++;
	}
	
	public int getLikes(){
		return this.likes;
	}
	
	public String getUser(Post s){
		return s.userName;
	}
	
	public Date getDate(Post s){
		return s.timeStamp;
	}
		
	public boolean isPopular(){
		return (this.likes > 100);
	}
	
	public String toString(){
		return ("Username: "+this.userName+" /Likes: "+this.likes+" /Date: "+this.timeStamp);
	}
}

