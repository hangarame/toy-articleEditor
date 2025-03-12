package com.articleEditor.model;

public class ArticleDTO {
	private String articleId;
	private String articleSubject;
	private String articleContent;
	private String writerId;
	private String cartegory_id;
	private String reg_date;
	private String upd_date;
	
	public String getArticleId() {
		return articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	public String getArticleSubject() {
		return articleSubject;
	}
	public void setArticleSubject(String articleSubject) {
		this.articleSubject = articleSubject;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public String getCartegory_id() {
		return cartegory_id;
	}
	public void setCartegory_id(String cartegory_id) {
		this.cartegory_id = cartegory_id;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getUpd_date() {
		return upd_date;
	}
	public void setUpd_date(String upd_date) {
		this.upd_date = upd_date;
	}
	
	
}
