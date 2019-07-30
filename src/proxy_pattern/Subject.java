package proxy_pattern;

public interface Subject {

	// 리소스가 적게 드는 일
	public void action1();
	
	// 리소스가 많이 드는 일(네트워크, 메모리를 많이 사용)
	public void action2();
}
