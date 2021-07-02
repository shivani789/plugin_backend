package com.slb.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ratings")
public class Rating {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	int rating;
	String comment;
	long timestamp;
	int projectId;
	int dataId;
	int userId;
	String userName;
	

	public Rating(long id, int rating, String comment, long timestamp, int projectId, int dataId, int userId,
			String userName) {
		this.id = id;
		this.rating = rating;
		this.comment = comment;
		this.timestamp = timestamp;
		this.projectId = projectId;
		this.dataId = dataId;
		this.userId = userId;
		this.userName = userName;
	}
	
	public Rating() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getDataId() {
		return dataId;
	}
	public void setDataId(int dataId) {
		this.dataId = dataId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Rating [id=" + id + ", rating=" + rating + ", comment=" + comment + ", timestamp=" + timestamp
				+ ", projectId=" + projectId + ", dataId=" + dataId + ", userId=" + userId + ", userName=" + userName
				+ "]";
	}
	
}