package net.food.qnaaction;

public class ActionForward {
	private boolean isRedirect;
	private String path;
	
	public ActionForward() {
		isRedirect = false;
		path = null;
	}
	
	public boolean isRedirect() {
		return isRedirect;
	}
	
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
