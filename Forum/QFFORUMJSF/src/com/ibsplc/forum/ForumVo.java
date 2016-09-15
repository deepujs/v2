/**
 * 
 */
package com.ibsplc.forum;

/**
 * @author P-1063
 *
 */
public class ForumVo {
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the qffnum
	 */
	public String getQffnum() {
		return qffnum;
	}
	/**
	 * @param qffnum the qffnum to set
	 */
	public void setQffnum(String qffnum) {
		this.qffnum = qffnum;
	}
	private String userName;
	private String password;
	private String emailId;
	private String qffnum;


}
