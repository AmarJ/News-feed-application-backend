public class TextPost extends Post {
	protected String message;
	
	public TextPost( String userName, String message){
		super(userName);
		this.message = message;	
	}
	
	public String getPost(TextPost s){
		return (s.message);
	}
	
	public boolean isPopular(){
		return (this.likes > 50);
	}
	
	public String toString(){
		return (super.toString()+" / message: "+this.message);
	}
}
