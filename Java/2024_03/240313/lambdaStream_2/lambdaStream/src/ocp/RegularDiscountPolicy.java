package ocp;

// 일반 할인 정책
class RegularDiscountPolicy implements DiscountPolicy {
	@Override
	public double applyDiscount(double price) {
		return price * 0.9; // 10% 할인
	}
}
