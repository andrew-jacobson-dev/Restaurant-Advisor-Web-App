package com.myspring.app.model;

public class CustReview {

	private Integer reviewid;
	private String custemail;
	private Integer restid;
	private String rname;
	private String reviewtitle;
	private String reviewdescr;
	private String reviewdate;
	private Integer rating;
	
	public Integer getReviewid() {
		return reviewid;
	}
	public void setReviewid(Integer reviewid) {
		this.reviewid = reviewid;
	}
	public String getCustemail() {
		return custemail;
	}
	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}
	public Integer getRestid() {
		return restid;
	}
	public void setRestid(Integer restid) {
		this.restid = restid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getReviewtitle() {
		return reviewtitle;
	}
	public void setReviewtitle(String reviewtitle) {
		this.reviewtitle = reviewtitle;
	}
	public String getReviewdescr() {
		return reviewdescr;
	}
	public void setReviewdescr(String reviewdescr) {
		this.reviewdescr = reviewdescr;
	}
	public String getReviewdate() {
		return reviewdate;
	}
	public void setReviewdate(String reviewdate) {
		this.reviewdate = reviewdate;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public CustReview(Integer reviewid, String custemail, Integer restid, String reviewtitle, String reviewdescr,
			String reviewdate, Integer rating) {
		super();
		this.reviewid = reviewid;
		this.custemail = custemail;
		this.restid = restid;
		this.reviewtitle = reviewtitle;
		this.reviewdescr = reviewdescr;
		this.reviewdate = reviewdate;
		this.rating = rating;
	}
	public CustReview() {
		super();
	}
	
}
