package priv.reusingClasses;

/**
 * 
 * Prove the previous sentence
 * @page think 192
 * @author hudongyu
 *
 *֤���̳й�ϵ�У��ڽ��г�ʼ��ʱ���ȵ��ø��๹�������ٵ������๹������
 *�����൱�������һ���Ӷ���
 *
 */
class father{
	father(){
		System.out.println("init father");
	}
}

public class Exercise3 extends father{
	Exercise3(){
		System.out.println("init Exercise3");
	}
	public static void main(String[] args) {
		Exercise3 e = new Exercise3();
	}
}
/**
 * output
 * init father
 * init Exercise3
 */
