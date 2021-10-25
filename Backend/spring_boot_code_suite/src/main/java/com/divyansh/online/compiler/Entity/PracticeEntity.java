package com.divyansh.online.compiler.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;

@Entity
public class PracticeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false, updatable = false, name = "Q_ID")
	private Long Q_ID;
	@NaturalId
	private String Q_Email;
	@NaturalId(mutable = true)
	private String Q_Title;
	@NaturalId(mutable = true)
	private String Q_Type;
	@NaturalId(mutable = true)
	private String Q_Hints;
	@NaturalId(mutable = true)
	private String Q_RelatedTopic;
	@NaturalId(mutable = true)
	private String Q_Question;
	@NaturalId(mutable = true)
	private String Q_Testcase;
	@NaturalId(mutable = true)
	private String Q_TestcaseAns;
	
	public PracticeEntity() {
		super();
	}

	public PracticeEntity(String q_Email, String q_Title, String q_Type, String q_Hints,
			String q_RelatedTopic, String q_Question, String q_Testcase, String q_TestcaseAns) {
		super();
		Q_Email = q_Email;
		Q_Title = q_Title;
		Q_Type = q_Type;
		Q_Hints = q_Hints;
		Q_RelatedTopic = q_RelatedTopic;
		Q_Question = q_Question;
		Q_Testcase = q_Testcase;
		Q_TestcaseAns = q_TestcaseAns;
	}

	public Long getQ_ID() {
		return Q_ID;
	}

	public void setQ_ID(Long q_ID) {
		Q_ID = q_ID;
	}

	public String getQ_Email() {
		return Q_Email;
	}

	public void setQ_Email(String q_Email) {
		Q_Email = q_Email;
	}

	public String getQ_Title() {
		return Q_Title;
	}

	public void setQ_Title(String q_Title) {
		Q_Title = q_Title;
	}

	public String getQ_Type() {
		return Q_Type;
	}

	public void setQ_Type(String q_Type) {
		Q_Type = q_Type;
	}

	public String getQ_Hints() {
		return Q_Hints;
	}

	public void setQ_Hints(String q_Hints) {
		Q_Hints = q_Hints;
	}

	public String getQ_RelatedTopic() {
		return Q_RelatedTopic;
	}

	public void setQ_RelatedTopic(String q_RelatedTopic) {
		Q_RelatedTopic = q_RelatedTopic;
	}

	public String getQ_Question() {
		return Q_Question;
	}

	public void setQ_Question(String q_Question) {
		Q_Question = q_Question;
	}

	public String getQ_Testcase() {
		return Q_Testcase;
	}

	public void setQ_Testcase(String q_Testcase) {
		Q_Testcase = q_Testcase;
	}

	public String getQ_TestcaseAns() {
		return Q_TestcaseAns;
	}

	public void setQ_TestcaseAns(String q_TestcaseAns) {
		Q_TestcaseAns = q_TestcaseAns;
	}

	@Override
	public String toString() {
		return "PracticeEntity [Q_ID=" + Q_ID + ", Q_Email=" + Q_Email + ", Q_Title=" + Q_Title + ", Q_Type=" + Q_Type
				+ ", Q_Hints=" + Q_Hints + ", Q_RelatedTopic=" + Q_RelatedTopic + ", Q_Question=" + Q_Question
				+ ", Q_Testcase=" + Q_Testcase + ", Q_TestcaseAns=" + Q_TestcaseAns + "]";
	}
	
}
