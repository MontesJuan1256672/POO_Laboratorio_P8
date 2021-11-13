public class Animal{
	String name;
	int age;
	boolean vaccinated;
	boolean atendido
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void eat(){
		System.out.println(name + "is eating");
	}
	
	public void sleep(){
		System.out.println(name + "is sleeping");
	}
	
	public void imprimir(){
		System.out.println("Animal generico.");
		System.out.println("El nombre es: " + name);
		System.out.println("La edad es: " + age);
	}
	
	//Setters y getters
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setVaccinated(boolean vaccinated){
		this.vaccinated = vaccinated;
	}
	public void setAtendido(boolean atendido){
		this.atendido = atendido;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public boolean getVaccinated(){
		return vaccinated;
	}
	public boolean getAtendido(){
		return atendido;
	}
	
}