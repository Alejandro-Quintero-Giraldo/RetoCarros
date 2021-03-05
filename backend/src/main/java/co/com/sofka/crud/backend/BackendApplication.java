package co.com.sofka.crud.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

@SpringBootApplication
public class BackendApplication {
	class podium {
		protected String searchPodium1(String ){

		}

	}
	 public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		Driver driver1 = new Driver();Driver driver2 = new Driver();Driver driver3 = new Driver();
		driver1.getDriverName(); driver2.getDriverName(); driver3.getDriverName();
		Car car1 = new Car(); Car car2 = new Car(); Car car3 = new Car();
		car1.setNumberCar(1); car2.setNumberCar(2); car3.setNumberCar(3);
		int longitudPista = 1500, carRecorrido1 = 0, carRecorrido2 = 0, carRecorrido3 = 0, dado;
		boolean podium1Assigned = false;
		do {
			for (int i=0; i==3;i++){
				dado = (int) (Math.random()*6+1);
				if (i==0) { carRecorrido1 += dado*100;}
				if (i==1) { carRecorrido2 += dado*100;}
				if (i==2) { carRecorrido3 += dado*100;}
			}
			System.out.println("El conductor "+driver1.showName()+" el del carro "+car1.showNumber()+" ha recorrido: "+carRecorrido1+"kilometros");
			System.out.println("El conductor "+driver2.showName()+" el del carro "+car2.showNumber()+" ha recorrido: "+carRecorrido2+"kilometros");
			System.out.println("El conductor "+driver3.showName()+" el del carro "+car3.showNumber()+" ha recorrido: "+carRecorrido3+"kilometros");

			if (carRecorrido1>=longitudPista && carRecorrido2< longitudPista && carRecorrido3<longitudPista && podium1Assigned == false){
				String podium1 = driver1.showName();
				podium1Assigned = true;
			}
		} while (carRecorrido1<=longitudPista && carRecorrido2<=longitudPista && carRecorrido3<=longitudPista);




	}


}
