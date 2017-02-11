public class NewsFeed {
	public int MAX_SIZE = 25;
	public Post[] postMessages = new Post[MAX_SIZE];
	
	public NewsFeed(){
		this.postMessages = postMessages;
	}
	
	public Post get( int index){
		return (this.postMessages[index]);
	}
	
	public NewsFeed getPhotoPost(){
		NewsFeed photoPosts = new NewsFeed();
		
		for (int i=0; i<this.size();i++){
			if (this.postMessages[i].getClass().getName()=="PhotoPost"){
				photoPosts.add(this.postMessages[i]);
			}
		}
		return photoPosts;
	}
	
	public void add(Post s){
		for (int i=0; i<MAX_SIZE;i++){
			if (this.postMessages[i]==null){
				this.postMessages[i]=s;
				break;
			}
		}
	}
	
	public int size(){
		for (int i=0; i<MAX_SIZE;i++){
			if (this.postMessages[i]==null){
				return (i);
			}
		}
		return MAX_SIZE;
	}
	
	public NewsFeed plus(NewsFeed s){
		NewsFeed nPost = new NewsFeed();
		
		if (this.size() == MAX_SIZE){
			return this;
		} else {
			for (int i=0; i<this.size();i++){
				nPost.postMessages[i] = this.postMessages[i];
			}
			for (int i=this.size(); i<MAX_SIZE;i++){
				nPost.postMessages[i] = s.postMessages[i-this.size()];
			}
			nPost.sort();
			return nPost;
		}
	}
	
	public void sort(){	    
		Post tmp;
		
	    for (int i = 0; i < this.size(); i++) {
	        for (int j=1; j < (this.size() - i); j++) {
	            if ((this.postMessages[j-1].compareTo(this.postMessages[j]))==-1) {
	                tmp = this.postMessages[j-1];
	                this.postMessages[j-1] = this.postMessages[j];
	                this.postMessages[j] = tmp;
	            }
	        }
	    }
	}
	
}
