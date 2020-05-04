package action.chainofresponsibility.structure;

public class ConcreteHandle3 extends Handler {
	@Override
	public void handleRequest(int request) {
		if (request >= 20) {
			System.out.println("请求被:" + getClass().getSimpleName() + "处理");
		} else if (successor != null) {
			successor.handleRequest(request);
		}
	}
}
