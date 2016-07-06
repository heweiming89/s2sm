package cn.heweiming.s2sm.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends CouplingActionWrapper implements ModelDriven<T> {

	private static final Logger logger = LoggerFactory.getLogger(BaseAction.class);

	private static final long serialVersionUID = 1918670297689965686L;

	protected T model;

	@Override
	@SuppressWarnings("unchecked")
	public T getModel() {
		if (model == null) {
			ParameterizedType parameterizedType = (ParameterizedType) this.getClass()
					.getGenericSuperclass();
			Type[] arguments = parameterizedType.getActualTypeArguments();
			if (arguments != null && arguments.length > 0) {
				try {
					model = ((Class<T>) arguments[0]).newInstance();
				} catch (InstantiationException e) {
					logger.debug("创建对象失败! 请提供无参数构造器");
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					logger.debug("class 不允许访问！ 请把 class 访问权限设置为 public");
					e.printStackTrace();
				}
			}
		}
		return model;
	}

	public void setModel(T model) {
		this.model = model;
	}

}
