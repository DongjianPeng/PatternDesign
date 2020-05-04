package action.chainofresponsibility.structure;

public class ConcreteHandle2 extends Handler {
	@Override
	public void handleRequest(int request) {
		if (request >= 10 && request < 20) {
			System.out.println("请求被:" + getClass().getSimpleName() + "处理");
		} else if (successor != null) {
			successor.handleRequest(request);
		}
	}
}
