package cn.heweiming.s2sm.filter;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class EncodingRequest extends HttpServletRequestWrapper {

	@Override
	public String getParameter(String name) {
		String parameter = request.getParameter(name);
		// System.out.println("parameter:\t" + parameter);
		try {
			// parameter = new String(parameter.getBytes("ISO-8859-1"),
			// "UTF-8");
			parameter = URLEncoder.encode(URLEncoder.encode(parameter, "UTF-8"), "UTF-8");
		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();
		}

		return parameter;
	}

	private HttpServletRequest request;

	public EncodingRequest(HttpServletRequest request) {
		super(request);
		this.request = request;
	}

}
