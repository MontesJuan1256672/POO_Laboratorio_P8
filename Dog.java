public class Dog extends Animal{
	String breed;
	public Dog(String breed, String name, int age){
		super(name, age);
		this.breed = breed;
	}
	
	public void play(){
		System.out.println(name + "is playing.");
	}
	
	@Override
	public void eat(){
		System.out.println(name + "is eating Rosco.");
	}
	
	@Override
	public void imprimir(){
		System.out.println("Perro.");
		System.out.println("Raza: " + breed);
		System.out.println("El nombre es: " + name);
		System.out.println("La edad es: " + age);
	}
	
	//setter y getters
	public void setBreed(String breed){
		this.breed = breed;
	}
	public String getBreed(){
		return breed;
	}
}