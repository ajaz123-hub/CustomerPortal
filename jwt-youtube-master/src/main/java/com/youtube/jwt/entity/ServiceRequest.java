package com.youtube.jwt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ServiceRequest {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer ticketNumber;
	    private String summary;
	    private String status;
	    private String date;
	    private String type;
	    
		public ServiceRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ServiceRequest(Integer ticketNumber,  String summary, String status, String date,
				String type) {
			super();
			this.ticketNumber = ticketNumber;
			
			this.summary = summary;
			this.status = status;
			this.date = date;
			this.type = type;
		}
		public Integer getTicketNumber() {
			return ticketNumber;
		}
		public void setTicketNumber(Integer ticketNumber) {
			this.ticketNumber = ticketNumber;
		}
		
		public String getSummary() {
			return summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
	  

	
}
