/*
	�������еķ���������Ҳ�У���ʵ������д��û�и��ǵ�����ķ���������ķ�������ֻ��ͨ��super.�����ã������ϻ����������ϵ���
	��һ��Ĭ��ʹ�õ��������µķ������ͽ�ԭ��

	super.������	���ʸ�������
	super.������	���ʸ��෽��
	super()			���ø���Ĺ��췽��
*/

public class SuperTest07 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.yiDong();
	}


}

class Animal {
	public void move() {
		System.out.println("Animal move");
	}
}

class Cat extends Animal {
	public void move() {
		System.out.println("Cat move");
	}

	public void yiDong() {
		this.move();
		move();
		super.move();
	}
}

