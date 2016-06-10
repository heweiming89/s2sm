package cn.heweiming.s2sm.filter;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet Filter implementation class EncodingFilter
 */
public class EncodingFilter implements Filter {

	private static final Logger logger = LoggerFactory.getLogger(EncodingFilter.class);

	private String encoding = "UTF-8";

	public EncodingFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		if ("GET".equals(req.getMethod())) {
			Map<String, String[]> parameterMap = req.getParameterMap();
			for (String key : parameterMap.keySet()) {
				String[] strings = parameterMap.get(key);
				for (int i = 0, len = strings.length; i < len; i++) {
					if (strings[i] != null && !strings[i].isEmpty()) {
						String begin = strings[i];
						strings[i] = new String(strings[i].getBytes("ISO-8859-1"),
								encoding);
						logger.info("{} 中文转码,转码后  -> {}", begin, strings[i]);
					}
				}
			}
			chain.doFilter(req, response);
		} else {
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		String parameter = fConfig.getInitParameter("encoding");
		if (parameter != null && !parameter.isEmpty()) {
			this.encoding = parameter;
		}
	}

}
