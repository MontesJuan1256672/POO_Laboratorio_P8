public class Veterinarian{
	String name;
	double salary;
	int yearsOfExperence;
	
	public Veterinarian(String name, double salary, int yearsOfExperence){
		this.name = name;
		this.salary = salary;
		this.yearsOfExperence = yearsOfExperence;
	}
	
	public void vaccinate(Animal animal){
		animal.setVaccinated(true);
		System.out.println(animal.getName() + " was vaccinated");
	}
	
	public void atender(Animal animal){
		animal.setAtendido(true);
		System.out.println(animal.getName() + " fue atendido por el veterinario");
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public void setYearsOfExperence(int yearsOfExperence){
		this.yearsOfExperence = yearsOfExperence;
	}
	
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public int getYearsOfExperence(){
		return yearsOfExperence;
	}
	
}