package project1;


public class UserVo {
	
	private String title;
	private String authorName;
	private String publisher;
	private String pubdate;
	private Integer rate;
	private Integer locationId;
	private String type;
	
	
	public UserVo() {
		
	}
	
	
	
	public UserVo(String title, String authorName) {
		super();
		this.title = title;
		this.authorName = authorName;
		
	}
	
	public UserVo(String title, String authorName, String publisher) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.publisher = publisher;
		
	}
	

	

	public UserVo(String title, String authorName, String publisher, Integer rate) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.publisher = publisher;
		this.rate = rate;
	}
	
	public UserVo(String title, String authorName, String publisher, String type, Integer rate) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.publisher = publisher;
		this.type = type;
		this.rate = rate;
	}
	
	public UserVo(String title, String authorName, String publisher, String pubdate, int rate, int locationId, String type) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.publisher = publisher;
		this.pubdate = pubdate;
		this.locationId = locationId;
		this.type = type;
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



	public String getPubdate() {
		return pubdate;
	}



	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}



	public Integer getRate() {
		return rate;
	}



	public void setRate(Integer rate) {
		this.rate = rate;
	}



	public Integer getLocationId() {
		return locationId;
	}



	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	@Override
	public String toString() {
		return "UserVo [제목=" + title + ", 작가=" + authorName + ", 출판사=" + publisher + ", 출판일="
				+ pubdate + ", 별점=" + rate + ", 위치=" + locationId + ", 장르=" + type + "]";
	}



	
	
	

}
