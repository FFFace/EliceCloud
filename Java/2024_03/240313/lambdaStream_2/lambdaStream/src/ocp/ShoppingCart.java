package ocp;

// 쇼핑 카트 클래스
class ShoppingCart {
	private DiscountPolicy discountPolicy;

	public ShoppingCart(DiscountPolicy discountPolicy) {
		this.discountPolicy = discountPolicy;
	}

	public double calculateTotalPrice(double price) {
		return discountPolicy.applyDiscount(price);
	}
}

