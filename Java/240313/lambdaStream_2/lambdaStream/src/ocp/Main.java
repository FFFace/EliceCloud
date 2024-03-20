package ocp;

public class Main {
	public static void main(String[] args) {
		ShoppingCart regularCart = new ShoppingCart(new RegularDiscountPolicy());
		System.out.println(regularCart.calculateTotalPrice(100)); // 일반 할인 가격 출력

		ShoppingCart christmasCart = new ShoppingCart(new ChristmasDiscountPolicy());
		System.out.println(christmasCart.calculateTotalPrice(100)); // 크리스마스 할인 가격 출력
	}
}
