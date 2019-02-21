package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 
	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		money.amount += this.amount;
		
		return money;
	}

	public Money minus(Money money) {
		money.amount -= this.amount;
		return money;
	}

	public Money multiply(Money money) {
		this.amount *= money.amount;
		return money;
	}

	public Money devide(Money money) {
		//this.amount = money.amount;
		return money;
	}
}