package cn.heweiming.s2sm.action;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

public interface HighCouplingAction
		extends ServletRequestAware, ServletResponseAware, ServletContextAware {

}
