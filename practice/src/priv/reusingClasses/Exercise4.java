package priv.reusingClasses;



/**
 * Prove that the base-class constructors are (a) always called and (b) called
 * before derived-class constructors.
 * 
 * ֤������ĳ�ʼ����������������֮ǰ������
 * 
 * @page think 192
 * @author hudongyu
 *
 *�����ڳ�ʼ��������ʼ�ջ��ȳ�ʼ�����ࣨ�Ӷ��󣩣��ٳ�ʼ��������Ա
 */
class Father1{
	Father1(){
		System.out.println("init Father");
	}
}

public class Exercise4 extends Father1{
	//��̬����
	static void print(){
		System.out.println("static print");
	}
	Exercise4(){
		this.print();
		System.out.println("init Excercise4");
	}
	public static void main(String[] args) {
		System.out.println("begin");
		Exercise4 e = new Exercise4();
	}
	/**
	 * ��̬������main��������ִ��
	 */
	//��̬�����
	static{
		System.out.println("init static");
	}
}
/**
init static
begin
init Father
static print
init Excercise4
 */

