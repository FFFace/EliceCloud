package ocp;

// 크리스마스 할인 정책
class ChristmasDiscountPolicy implements DiscountPolicy {
	@Override
	public double applyDiscount(double price) {
		return price * 0.8; // 20% 할인
	}
}
