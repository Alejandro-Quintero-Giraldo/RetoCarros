package co.com.sofka.crud.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Random;

@SpringBootApplication
public class BackendApplication {
	static class podium {
		protected String searchPodium1(int carRecorrido1, int carRecorrido2, int carRecorrido3, int longitudPista, boolean podium1Assigned, Driver driver1 ){
			String podium1="";
			if (carRecorrido1>=longitudPista && carRecorrido2< longitudPista && carRecorrido3<longitudPista && podium1Assigned == false){
				podium1 = driver1.showName();
				podium1Assigned = true;
			}
			return podium1;
		}

	}
	 public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		Random random = new Random();
		Driver driver1 = new Driver();Driver driver2 = new Driver();Driver driver3 = new Driver();
		driver1.getDriverName(); driver2.getDriverName(); driver3.getDriverName();
		Car car1 = new Car(); Car car2 = new Car(); Car car3 = new Car();
		car1.setNumberCar(1); car2.setNumberCar(2); car3.setNumberCar(3);
		int longitudPista = 1500, carRecorrido1 = 0, carRecorrido2 = 0, carRecorrido3 = 0, dado;
		boolean podium1Assigned = false;
		podium podio = new podium();
		String podio1;
		do {
			for (int i=0; i==3;i++){
				dado = random.nextInt(7)+1;

				if (i==0) { carRecorrido1 = carRecorrido1 + (dado*100);}
				if (i==1) { carRecorrido2 = dado*100;}
				if (i==2) { carRecorrido3 = dado*100;}
			}
			System.out.println("El conductor "+driver1.showName()+" el del carro "+car1.showNumber()+" ha recorrido: "+carRecorrido1+" kilometros");
			System.out.println("El conductor "+driver2.showName()+" el del carro "+car2.showNumber()+" ha recorrido: "+carRecorrido2+" kilometros");
			System.out.println("El conductor "+driver3.showName()+" el del carro "+car3.showNumber()+" ha recorrido: "+carRecorrido3+" kilometros");
			podio1 = podio.searchPodium1(carRecorrido1,carRecorrido2,carRecorrido3,longitudPista,podium1Assigned,driver1);

		} while (carRecorrido1<=longitudPista && carRecorrido2<=longitudPista && carRecorrido3<=longitudPista);




	}


}
