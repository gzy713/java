package com.yss.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class de extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write("<div style=\"height:200px;width:100%;background-color:withe ; text-align:center \" > <span style=\"color:red; font-size:20px \">The People£ßs republic of china</span>  </div>");
		response.getWriter().write("<from> –’√˚<input></input> </br>ƒÍ¡‰<input></input> </form>");
		

		// response.getWriter().write("yuiiiiiiiii");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
