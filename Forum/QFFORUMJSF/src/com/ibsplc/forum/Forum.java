/**
 * 
 */
package com.ibsplc.forum;

import javax.faces.bean.ManagedBean;

/**
 * @author P-1063
 *
 */
@ManagedBean
public class Forum {

	private String userName;
	private String password;
	private String emailId;
	private String search;
	private String qffnum;

	/**
	 * @return the qffnum
	 */
	public String getQffnum() {
		return qffnum;
	}

	/**
	 * @param qffnum
	 *            the qffnum to set
	 */
	public void setQffnum(String qffnum) {
		this.qffnum = qffnum;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
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
	 * @param password
	 *            the password to set
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
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the search
	 */
	public String getSearch() {
		return search;
	}

	/**
	 * @param search
	 *            the search to set
	 */
	public void setSearch(String search) {
		this.search = search;
	}

	public void saveUserDetails() {

		System.out.println("Inside saveUserDetails " + userName);

		ForumVo forumVo = new ForumVo();

		forumVo.setUserName(this.userName);
		forumVo.setPassword(this.password);
		forumVo.setQffnum(this.qffnum);
		forumVo.setEmailId(this.emailId);

		new ForumController().saveUserDetails(forumVo);

	}

}
