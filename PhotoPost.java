public class PhotoPost extends Post {
	protected String fileName;
	protected String caption;
	
	public PhotoPost( String userName, String fileName, String caption){
		super(userName);
		this.fileName = fileName;
		this.caption = caption;
	}
	
	public String getCaption(PhotoPost s){
		return (s.caption);
	}
	
	public String getFileName(PhotoPost s){
		return (s.fileName);
	}
	
	public String toString(){
		return (super.toString()+"/ filename: "+this.fileName+"/ Caption: "+this.caption);
	}
}
