package project1;


public class UserVo {
	
	private String title;
	private String authorName;
	private String publisher;
	private Integer rate;
	
	
	
	
	
	public UserVo() {
		
	}
	
	
	
	public UserVo(String title, String authorName) {
		super();
		this.title = title;
		this.authorName = authorName;
		
	}
	

	

	public UserVo(String title, String authorName, String publisher, Integer rate) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.publisher = publisher;
		this.rate = rate;
	}
	
	
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "UserVo [title=" + title + ", authorName=" + authorName + ", publisher=" + publisher + ", rate=" + rate
				+ "]";
	}
	
	
	

}
