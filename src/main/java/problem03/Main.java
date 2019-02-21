package problem03;

public class Main {
	
	public static void main(String[] args) {
		Money five  = new Money(5);
        Money two   = new Money(2);
        Money three = new Money(3);
        Money ten   = new Money(10);
        
        System.out.println(five);
        System.out.println(two.add(three));
        
//        System.out.println(five.add(two));
//        System.out.println(two);


        if(five.equals(two.add(three)) && three.equals(five.minus(two)) && ten.equals(five.multiply(two)) && two.equals(ten.devide(five))){
            System.out.println("Money Class 구현 완료");
        }
	}
}