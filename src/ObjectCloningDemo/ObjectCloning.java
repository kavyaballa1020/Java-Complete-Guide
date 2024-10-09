package ObjectCloningDemo;
 class Demo implements Cloneable{
	 int id;
	 String name;
	 Demo(int id,String name){
		 this.id=id;
		 this.name=name;
	 }
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + "]";
	}
	@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
 }
public class ObjectCloning {

	public static void main(String[] args) {
		try {
			Demo d1=new Demo(19,"Kavya");
			Demo d2=(Demo) d1.clone();
			System.out.println("First Object : "+d1);
			System.out.println("Cloned Object : "+d2);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
