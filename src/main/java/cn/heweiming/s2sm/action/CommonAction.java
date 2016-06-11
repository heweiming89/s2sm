package cn.heweiming.s2sm.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.heweiming.s2sm.domain.User;

@Controller("web.commonAction")
@Scope("prototype")
public class CommonAction extends BaseAction<User> {

	private static final long serialVersionUID = 8945832758158793164L;

	@Value("中国人22")
	private String test;

	public CommonAction() {
		System.out.println("CommonAction.CommonAction()");
	}

	@Override
	public String execute() throws Exception {
		System.out.println("CommonAction.execute()");
		setTest("432142314");
		return SUCCESS;
	}

	public String common() throws Exception {

		// setTest(test);
		requestMap.put("test1", "test1 test1");
		ActionContext actionContext = ActionContext.getContext();
		ActionContext actCtx = ActionContext.getContext();
		actionContext.put("test2", "test2 test24444444");
		actCtx.put("test3", "fdsafs");

		return SUCCESS;
	}

	public String common2() throws Exception {
		return SUCCESS;
	}

	public String common3() throws Exception {
		return SUCCESS;
	}

	public String form() throws Exception {
		return SUCCESS;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

}
