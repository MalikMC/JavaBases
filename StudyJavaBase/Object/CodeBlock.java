
public class CodeBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		1.ϵͳ��Fu.class��Zi.class�ֱ���ص����������ڴ����棬��̬���������.class�ļ�һ����ص����������棬
		�����ȴ�ӡ���˾�̬������е����ݡ�
		2.�������������ڹ��췽��ִ�У������ʼ��֮ǰ�����Դ�ӡ�������еĹ�������͹��췽���е�����*/

	        ZiClass z = new ZiClass();

	}

}


class FuClass {
    static {
        System.out.println("��̬�����Fu");
    }

    {
        System.out.println("��������Fu");
    }

    public FuClass() {
        System.out.println("���췽��Fu");
    }
}

class ZiClass extends FuClass {
    static {
        System.out.println("��̬�����Zi");
    }

    {
        System.out.println("��������Zi");
    }

    public ZiClass() {
        System.out.println("���췽��Zi");
    }
}
