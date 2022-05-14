package classwork.lesson19;

import java.util.Date;

public class DebitCard implements Payment {

	private Long cardNo;
	private String issuer;
	private Date expiryDate;

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public boolean authorise(double amount) {
		System.out.println("Payment succesfull with debit card");
		return true;
	}

}
