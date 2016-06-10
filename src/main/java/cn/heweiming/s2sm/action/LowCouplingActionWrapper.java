package cn.heweiming.s2sm.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LowCouplingActionWrapper extends ActionSupport implements LowCouplingAction {

	private static final long serialVersionUID = -2068329054740555319L;
	
	protected Map<String, String[]> parametersMap;
	protected Map<String, Object> requestMap;
	protected Map<String, Object> sessionMap;
	protected Map<String, Object> applicationMap;
	
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

}
