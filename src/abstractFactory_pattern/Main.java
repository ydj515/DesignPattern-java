package abstractFactory_pattern;

public class Main {

	public static void main(String[] args) {

		AbstractFactory samsungFactory = new SAMSUNGFactory(); // 추상 팩토리로 해당 팩토리 생성
		samsungFactory.create(); // 팩토리에게 의뢰를 맡긴다

		System.out.println("==================");
		
		AbstractFactory LGFactory = new LGFactory(); // 추상 팩토리로 해당 팩토리 생성
		LGFactory.create(); // 팩토리에게 의뢰를 맡긴다

	}

}
