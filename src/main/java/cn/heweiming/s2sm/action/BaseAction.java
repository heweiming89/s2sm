package cn.heweiming.s2sm.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends ActionSupport
		implements ModelDriven<T>, LowCouplingAction, HighCouplingAction {

	private static final long serialVersionUID = 8421678724691353608L;


	protected Map<String, String[]> parametersMap;
	protected Map<String, Object> requestMap;
	protected Map<String, Object> sessionMap;
	protected Map<String, Object> applicationMap;

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	protected ServletContext application;

	@Override
	public T getModel() {
		return null;
	}

	@Override
	public void setParameters(Map<String, String[]> parameters) {
		this.parametersMap = parameters;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.requestMap = request;

	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;

	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.applicationMap = application;

	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}

	@Override
	public void setServletContext(ServletContext context) {
		this.application = context;

	}

}
