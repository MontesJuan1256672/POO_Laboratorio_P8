public class Lion extends Animal{
	String roar;
	
	public Lion(String roar,String name, int age){
		super(name, age);
		this.roar = roar;
	}
	
	@Override
	public void eat(){
		System.out.println(name + "is eating cow meet.");
	}
	
	@Override
	public void imprimir(){
		System.out.println("Leon.");
		System.out.println("Rugido: " + roar);
		System.out.println("El nombre es: " + name);
		System.out.println("La edad es: " + age);
	}
	
	//setters y getters
	public void setRoar(String roar){
		this.roar = roar;
	}
	public String getRoar(){
		return roar;
	}
}