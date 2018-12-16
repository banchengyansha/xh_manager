package com.xh.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		String requestURL = request.getRequestURL().toString();
		System.out.println("requestURL : " + requestURL);
		if(requestURL.toLowerCase().contains("login")){
			return true;
		}
		
		HttpSession session = request.getSession();
		Object object = session.getAttribute("loginUser");
		if(object != null){
			return true;
		}else{
			String url = request.getRequestURL().toString();
			System.out.println("contextpath : " + url);
			
			response.sendRedirect("http://localhost:9000");
			return false;
		}
		
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
