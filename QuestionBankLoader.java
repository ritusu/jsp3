package com.lti.exam.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {
	
	public List<Question> fetchQuestionsOnJava() {
		QuestionBank qb= new QuestionBank();
		qb.addNewSubject("java");
		 Question q= new Question();
		 q.setQuestion("what is class?");
		 List<Option> opts =new ArrayList<Option>();
		 Option o1 =new Option();
		 o1.setOption("class is a template for an object");
		 o1.setRightAnswer(true);
		 Option o2 =new Option();
		 o2.setOption("class is an instance for an object");
		 o2.setRightAnswer(false);
		 Option o3 =new Option();
		 o3.setOption("class is another name for an object");
		 o3.setRightAnswer(false);
		 Option o4 =new Option();
		 o4.setOption("allt");
		 o4.setRightAnswer(false);
		 opts.add(o1);
		 opts.add(o2);
		 opts.add(o3);
		 opts.add(o4);
		 q.setOptions(opts);
		 qb.addNewQuestion("java", q);
		 
		 
		
			q= new Question();
			 q.setQuestion("what is object?");
			 opts =new ArrayList<Option>();
			o1 =new Option();
			 o1.setOption("template for class");
			 o1.setRightAnswer(false);
			  o2 =new Option();
			 o2.setOption("object is an instance for class");
			 o2.setRightAnswer(true);
			  o3 =new Option();
			 o3.setOption("object is another name for an class");
			 o3.setRightAnswer(false);
			  o4 =new Option();
			 o4.setOption("allt");
			 o4.setRightAnswer(false);
			 opts.add(o1);
			 opts.add(o2);
			 opts.add(o3);
			 opts.add(o4);
			 q.setOptions(opts);
			 qb.addNewQuestion("java", q);
			 
			 
				q= new Question();
				 q.setQuestion("what is inteface?");
				 opts =new ArrayList<Option>();
				o1 =new Option();
				 o1.setOption("contains only abstract method");
				 o1.setRightAnswer(true);
				  o2 =new Option();
				 o2.setOption("contaisn both abstract and non abstract methods");
				 o2.setRightAnswer(false);
				  o3 =new Option();
				 o3.setOption("contains a body");
				 o3.setRightAnswer(false);
				  o4 =new Option();
				 o4.setOption("allt");
				 o4.setRightAnswer(false);
				 opts.add(o1);
				 opts.add(o2);
				 opts.add(o3);
				 opts.add(o4);
				 q.setOptions(opts);
				 qb.addNewQuestion("java", q);
				 
				 
					q= new Question();
					 q.setQuestion("what is oops?");
					 opts =new ArrayList<Option>();
					o1 =new Option();
					 o1.setOption("template for class");
					 o1.setRightAnswer(false);
					  o2 =new Option();
					 o2.setOption("object oriented programming language");
					 o2.setRightAnswer(true);
					  o3 =new Option();
					 o3.setOption("object ");
					 o3.setRightAnswer(false);
					  o4 =new Option();
					 o4.setOption("allt");
					 o4.setRightAnswer(false);
					 opts.add(o1);
					 opts.add(o2);
					 opts.add(o3);
					 opts.add(o4);
					 q.setOptions(opts);
					 qb.addNewQuestion("java", q);
					 
					 return qb.getQuestionsFor("java");
			 
			 
			 
		 


	}

}
