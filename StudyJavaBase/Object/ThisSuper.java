


/*super��this�ĶԱ�
this��super�ֱ����ʲô
this:����ǰ���������
super:������ǵ�ǰ��������еĸ���������
this��super��ʹ������
���ó�Ա����
this.��Ա������ ���ñ���ĳ�Ա����
super.��Ա������ ���ø���ĳ�Ա����
���ù��췽��
this(��) �����ñ���Ĺ��췽��
super(��)�����ø���Ĺ��췽��
���ó�Ա����
this.��Ա���������ñ���ĳ�Ա����
super.��Ա���������ø���ĳ�Ա����*/


public class ThisSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * ����Zi�Ķ���֮��ϵͳ���ȵ���Zi�ĸ���Fu�еĹ��췽���������ȴ�ӡ��fu ֮��ϵͳ����Zi�еĹ��췽������ӡ��zi
		 * ��show���������и��ֲ�����num=512����һ�д�ӡnum�����õ��Ǿֲ������������512 ͨ��this�����˳�Ա����num����ӡ��256
		 * ͨ��super���ø����е�num����ӡ��125
		 */
		 Zi z = new Zi();
         z.show();
	}

}


class Fu{
    public int num = 125;
    public Fu(){
        System.out.println("fu");
    }
}
class Zi extends Fu{
    public int num = 256;
    public Zi(){
        System.out.println("zi");
    }
    public void show(){
        int num = 512;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}