package practice;

import java.util.Objects;

public class SavingAccount extends Account {
	String proof;
	String bname;
	
	void show() {
		deposit(3000);
		System.out.println(getBalance());
		System.out.println(acNumber+""+balance+"");
	}
	@Override
	public int hashCode() {
		return Objects.hash(bname, proof);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		return Objects.equals(bname, other.bname) && Objects.equals(proof, other.proof);
	}
	public static void main(String args[]) {
		SavingAccount sa=new SavingAccount();
		sa.show();
	}
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SavingAccount(int acNumber, String name, double balance) {
		super(acNumber, name, balance);
		// TODO Auto-generated constructor stub
	}
	public String getProof() {
		return proof;
	}
	public void setProof(String proof) {
		this.proof = proof;
	}

}
