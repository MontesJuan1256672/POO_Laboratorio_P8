//1)	Crear un programa que utilice una clase "Zoo" que contenga:
//			*)Un ArrayList de diferentes objetos animales y 
//			*)Métodos para:
//				·agregar animales, 
//				·eliminar animales y 
//				·mostrar animales 
//2)	Agregue más funcionalidades a la clase "Veterinarian"
//3)	Crear diferentes subclases de animales con sus propios métodos.


import java.util.ArrayList;

public class Zoo{
	public static void main(String[] args){
		int opc, opc2, elementToBeDeleted,tamanoArray = 5;
		
		//arreglo de la clase Animal
		Animal animales[] = new Animal[tamanoArray];
		
		//arreglo que se usará para copiar los elementos del arreglo animales, excluyendo el elemento que se quiere eliminar
		Animal animalesCopy[] =   null;
		
		//aplicación de polimorfismo al instaciar las clases hijas de la clase Animal
		animales[0] = new Animal("Rodolfo", 3);
		animales[1] = new Dog("Wild dog", "Silvestre", 4);
		animales[2] = new Lion("Roar","Simba", 2);
		
		Veterinarian veterinario = new Veterinarian("Roberto",1000.00, 5);
 
		//imprimi los animales (elementos del arreglo) con los que actualmente se cuenta. 
		System.out.println();
		System.out.println("Animales que se tiene actualmente.");
		for(int i = 0; i < 5; i++){
		    if(animales[i] != null)
		        System.out.println(animales[i].getName());
            else
		        break;
		}
		////////////////////////////////////////////////
		///////////////////////////////////////////////
		//////////////////////////////////////////////
		do{
			//Menú principal de opciones
			System.out.print("\n");
			System.out.println("Seleccione una opcion");
			System.out.println(" 1) Agregar registro");
			System.out.println(" 2) Mostrar registro");
			System.out.println(" 3) Eliminar registro");
			System.out.println(" 4) Salir");
			
			opc = CapturaEntrada.capturarEntero(">>>");
			System.out.println();
			
			switch(opc){
				
				case 1:	//Únicamente se puede agreger al arreglo una instancia de la clase Animal
						for(int i = 0; i < animales.length; i++){
							if(animales[i] == null){
								animales[i] = new Animal(CapturaEntrada.capturarString("Nombre del nuevo animal"), CapturaEntrada.capturarEntero("Edad del animal"));
								break;
							}else{
								continue;
							}		
						}
					break;
				////////////////////////////////////////////////
				///////////////////////////////////////////////
				//////////////////////////////////////////////

				case 2:	//Muestra el arreglo de objetos
						for(Animal i: animales){
							if(i != null){
								i.imprimir();
								veterinario.vaccinate(i);
								System.out.println();
							}
							else
								break;
						}
					break;
				////////////////////////////////////////////////
				///////////////////////////////////////////////
				//////////////////////////////////////////////
				
				case 3:	//Elimina elemento del arreglo

						//mostrar los nombres de los elementos del arreglo
						System.out.println("Animales que se tiene actualmente.");
						for(int i = 0; i < animales.length - 1; i++){
							if(animales[i] != null){
								System.out.println((i+1) + ") " + animales[i].getName());
							}else{
								break;
							}
						}

						//Elimina elemento del arreglo
						elementToBeDeleted = CapturaEntrada.capturarEntero("Seleccione el NUMERO del animal que decea eliminar.");
						
						//recorre el arreglo hasta encontrar un elemento que coninsida con el requerido por el usuario
						for(int i = 0; i < animales.length - 1; i++){
							if(elementToBeDeleted == i+1){
								animalesCopy = new Animal[tamanoArray];
								
								//copia el arreglo en uno nuevo excluyendo el elemento seleccionado por el usuario
								for(int index = 0; index < i; index++){
									animalesCopy[index] = animales[index];
								}
								
								for(int j = i; j < animales.length - 1; j++){
									animalesCopy[j] = animales[j+1];
								}
								break;
							}
						}
						
						//copia los elementos del segundo arreglo de regreso al original e imprime el resultado final
						System.out.println("Animales que se tiene actualmente.");
						for(int i = 0; i < animalesCopy.length; i++){
							animales[i] = animalesCopy[i];
							
							if(animales[i] != null)
								System.out.println((i+1) + ") " + animales[i].getName());
						}

						
					break;
				////////////////////////////////////////////////
				///////////////////////////////////////////////
				//////////////////////////////////////////////			
				case 4: 
					System.exit(0);
					break;           
				default:
					System.out.println("\n--Seleccione un opcion valida--");
					System.out.println();
			}//switch
		}while(opc != 4);  	
	}//main
}//class