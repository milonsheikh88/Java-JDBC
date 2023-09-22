package com.milon.sheikh.JavaJdbc.beans;

/**
 * @author [MILON SHEIKH]
 */
public class Candidates {
	private int candidateId;
	private String candidateFirstName;
	private String candidateLastName;
	private String candidateDOB;
	private String candidatePhone;
	private String candidateEmail;


	public Candidates() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Candidates(int candidateId, String candidateFirstName, String candidateLastName, String candidateDOB,
			String candidatePhone, String candidateEmail) {
		super();
		this.candidateId = candidateId;
		this.candidateFirstName = candidateFirstName;
		this.candidateLastName = candidateLastName;
		this.candidateDOB = candidateDOB;
		this.candidatePhone = candidatePhone;
		this.candidateEmail = candidateEmail;
	}


	/**
	 * @return the candidateId
	 */
	public int getCandidateId() {
		return candidateId;
	}


	/**
	 * @param candidateId the candidateId to set
	 */
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}


	/**
	 * @return the candidateFirstName
	 */
	public String getCandidateFirstName() {
		return candidateFirstName;
	}


	/**
	 * @param candidateFirstName the candidateFirstName to set
	 */
	public void setCandidateFirstName(String candidateFirstName) {
		this.candidateFirstName = candidateFirstName;
	}


	/**
	 * @return the candidateLastName
	 */
	public String getCandidateLastName() {
		return candidateLastName;
	}


	/**
	 * @param candidateLastName the candidateLastName to set
	 */
	public void setCandidateLastName(String candidateLastName) {
		this.candidateLastName = candidateLastName;
	}


	/**
	 * @return the candidateDOB
	 */
	public String getCandidateDOB() {
		return candidateDOB;
	}


	/**
	 * @param candidateDOB the candidateDOB to set
	 */
	public void setCandidateDOB(String candidateDOB) {
		this.candidateDOB = candidateDOB;
	}


	/**
	 * @return the candidatePhone
	 */
	public String getCandidatePhone() {
		return candidatePhone;
	}


	/**
	 * @param candidatePhone the candidatePhone to set
	 */
	public void setCandidatePhone(String candidatePhone) {
		this.candidatePhone = candidatePhone;
	}


	/**
	 * @return the candidateEmail
	 */
	public String getCandidateEmail() {
		return candidateEmail;
	}


	/**
	 * @param candidateEmail the candidateEmail to set
	 */
	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}


	@Override
	public String toString() {
		return "Candidates [candidateId=" + candidateId + ", candidateFirstName=" + candidateFirstName
				+ ", candidateLastName=" + candidateLastName + ", candidateDOB=" + candidateDOB + ", candidatePhone="
				+ candidatePhone + ", candidateEmail=" + candidateEmail + "]";
	}
	
	

}
