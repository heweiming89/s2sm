package cn.heweiming.s2sm.action;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public interface LowCouplingAction
		extends ParameterAware, RequestAware, SessionAware, ApplicationAware {

}
