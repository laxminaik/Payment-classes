package com.crs.lt.Bean;

public class OnlinePaymentByNetbanking {
	int id;
	int account_no;
	String IFSC_code;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the account_no
	 */
	public int getAccount_no() {
		return account_no;
	}
	/**
	 * @param account_no the account_no to set
	 */
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	/**
	 * @return the iFSC_code
	 */
	public String getIFSC_code() {
		return IFSC_code;
	}
	/**
	 * @param iFSC_code the iFSC_code to set
	 */
	public void setIFSC_code(String iFSC_code) {
		IFSC_code = iFSC_code;
	}
	

}
