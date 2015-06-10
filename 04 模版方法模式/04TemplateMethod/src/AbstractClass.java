
//抽象模版类
public abstract class AbstractClass {

	//基本方法
	protected abstract void doSomething();
	//基本方法
	protected abstract void doAnything();
	//模版方法
	public void templateMethod() {
		this.doSomething();
		this.doAnything();
	}
}
