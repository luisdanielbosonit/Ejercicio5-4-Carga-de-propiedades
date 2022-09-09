package Ejercicio54.Carga.de.propiedades;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${greeting}")
    private String hola;

    @Value("${my.number}")
    private String num;

    //@Value("${new.property}") al llamar una un contenido inexistente del fichero properties,
    // lanza un eeror y sugiere una exception
    private String property="new.property no tiene valor";

    @GetMapping("/hola")
    public String View(){
        return "el valor de greeting es:"+ hola + "\n"+"el valor de my.number es :"+num+ "\n"+ "El valor de new.property es: "+property;
    }

}
