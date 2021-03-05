package co.com.sofka.crud.backend;
import java.io.*;
public class Driver {
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(in);
    String nameDriver;
    private void setDriverName(String nameDriver){
        this.nameDriver = nameDriver;
    }
    protected String getDriverName(){
        System.out.println("Ingrese el nombre del jugador 1");
        try {
            nameDriver = buffer.readLine();
        }catch (IOException e){System.out.println("Error de proceso de datos");}
        setDriverName(nameDriver);
        return nameDriver;
    }
    protected String showName(){
        return this.nameDriver;
    }

}
