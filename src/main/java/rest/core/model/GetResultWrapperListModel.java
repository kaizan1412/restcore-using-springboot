package rest.core.model;

import java.util.Date;
import java.util.List;

public class GetResultWrapperListModel<T> {
	
	private int totalItems;
	private List<T> items;
	private String totalProcessingTime;
	private Date processingTime;
	
	public GetResultWrapperListModel() {
		// TODO Auto-generated constructor stub
	}

	public GetResultWrapperListModel(int totalItems, List<T> items, String totalProcessingTime, Date processingTime) {
		super();
		this.totalItems = totalItems;
		this.items = items;
		this.totalProcessingTime = totalProcessingTime;
		this.processingTime = processingTime;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	public String getTotalProcessingTime() {
		return totalProcessingTime;
	}

	public void setTotalProcessingTime(String totalProcessingTime) {
		this.totalProcessingTime = totalProcessingTime;
	}

	public Date getProcessingTime() {
		return processingTime;
	}

	public void setProcessingTime(Date processingTime) {
		this.processingTime = processingTime;
	}
	
	

}
