package Beverage;
public class BeverageHouse {

	public static void main(String[] args) {
		Beverage b1 = new JuHuaCha("菊花茶");
		b1.setCapacity(Beverage.MEDIUM);
		System.out.println(b1.getDescription() + "一杯" + b1.price());

//		Beverage b2 = new LemonJuice("С������֭");
//		b2.setCapacity(Beverage.SMALL);
//		b2 = new BingTang(b2);
//		System.out.println(b2.getDescription() + "�۸�" + b2.price());
//
//		Beverage b3 = new NaiCha("���̲�");
//		b3.setCapacity(Beverage.LARGE);
//		b3 = new YeGuo(b3);
//		b3 = new Milk(b3);
//		System.out.println(b3.getDescription() + "�۸�" + b3.price());
//
	}
}
