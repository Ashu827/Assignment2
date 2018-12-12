package com.ashu.spring.assignment2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Question {
	
	private String questionId;
	private String question;
	private List<String>answers;
	private Set<String> answer;
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public Set<String> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<String> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question
				+ ", answers=" + answers + "]";
	}
	
	public void show(){
	System.out.println(getQuestionId()+" "+getQuestion()+" ");
	
	Iterator<String> itr=answers.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	
	}

}
