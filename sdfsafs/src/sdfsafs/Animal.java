package sdfsafs;

public class Animal {
   //�ʵ�
	public String name;
	//������
	public Animal(String name) {
		this.name = name;
	}
//�޼ҵ�
	public void sing() {
	  System.out.println(name + "Sing");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	}
	
    
}