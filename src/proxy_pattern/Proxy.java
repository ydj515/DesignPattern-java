package proxy_pattern;

public class Proxy implements Subject {

	private Subject real;
	
	public Proxy(Subject real) {
		this.real = real;
	}

	@Override
	public void action1() {
		
		System.out.println("간단한 업무 by proxy");
	}

	@Override
	public void action2() {
		
		this.real.action2(); // 복잡한 업무이기 때문에 proxy가 처리 할수 없기 때문에 호출하는 것
	}

}
