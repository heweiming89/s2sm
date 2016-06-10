package cn.heweiming.s2sm.action;

import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends CouplingActionWrapper
		implements ModelDriven<T> {

	private static final long serialVersionUID = 1918670297689965686L;

	@Override
	public T getModel() {
		return null;
	}
	

}
