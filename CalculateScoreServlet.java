package com.lti.exam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.exam.model.Option;
import com.lti.exam.model.Question;

/**
 * Servlet implementation class CalculateScoreServlet
 */
@WebServlet("/CalculateScoreServlet")
public class CalculateScoreServlet extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//picking up the current question from the sesion
		HttpSession session = request.getSession();
		Question q=(Question) session.getAttribute("currentQs");
			//reading value of the radio butten
			int optionSelected =Integer.parseInt(request.getParameter("op"));
		
			//int score=0;
			Integer score=(Integer)session.getAttribute("score");
			if(score==null)
				score=0;
			//checking if the selected option is right
			Option op=q.getOptions().get(optionSelected);
			if(op.isRightAnswer())
				score++;
			//storing the score in the session of the user
			session.setAttribute("score", score);
			
			response.sendRedirect("QuestionLoaderServlet");
		
	}

}
