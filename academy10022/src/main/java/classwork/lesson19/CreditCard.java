package classwork.lesson19;

import java.util.Date;

public class CreditCard implements Payment {

	private String issuer;
	private Long cardNo;
	private Date expiryDate;

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public boolean authorise(double amount) {
		System.out.println("Payment succesfull with credit card");
		return true;
	}
}
