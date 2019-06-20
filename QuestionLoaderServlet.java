package com.lti.exam.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.exam.model.Question;
import com.lti.exam.model.QuestionBankLoader;

/**
 * Servlet implementation class QuestionLoaderServlet
 */
@WebServlet("/QuestionLoaderServlet")
public class QuestionLoaderServlet extends HttpServlet {
	
	private int questionNo;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionBankLoader qbl=new QuestionBankLoader();
		List<Question> questions=qbl.fetchQuestionsOnJava();
		if(questionNo<questions.size()) {
		Question q=questions.get(questionNo++ );
		request.getSession().setAttribute("currentQs",q);
		
		response.sendRedirect("showQuestion.jsp");
	
			
		}
		else {
			
			response.sendRedirect("showScores.jsp");
		}
			
	}

	
}
