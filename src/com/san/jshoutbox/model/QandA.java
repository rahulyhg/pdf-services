package com.san.jshoutbox.model;
class QandA {
		String question;
		String answer;

		public QandA(String question, String answer) {
			this.question = question;
			this.answer = answer;
		}

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public String getAnswer() {
			return answer;
		}

		public void setAnswer(String answer) {
			this.answer = answer;
		}

		@Override
		public String toString() {
			return "question : " + question + ", answer :" + answer;
		}
	}