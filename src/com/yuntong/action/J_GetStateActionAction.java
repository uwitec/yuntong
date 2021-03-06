/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yuntong.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuntong.service.J_FareMathService;

/** 
 * MyEclipse Struts
 * Creation date: 04-12-2007
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class J_GetStateActionAction extends Action {
	private  	J_FareMathService fareMathService; 
	
	/*
	 * Generated Methods
	 */

	public J_FareMathService getFareMathService() {
		return fareMathService;
	}

	public void setFareMathService(J_FareMathService fareMathService) {
		this.fareMathService = fareMathService;
	}

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		List list= fareMathService.ShowState();
		request.getSession().setAttribute("list", list);
		return mapping.findForward("action");
	}
}