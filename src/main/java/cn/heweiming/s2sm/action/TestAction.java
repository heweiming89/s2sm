package cn.heweiming.s2sm.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestAction implements LowCouplingAction ,HighCouplingAction {

	@Override
	public void setParameters(Map<String, String[]> parameters) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		
	}
	
}
