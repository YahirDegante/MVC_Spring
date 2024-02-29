package mx.edu.utez.sda.srpingmvc.control;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/peliculas")
public class ControlPeliculas {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @Secured({"ROLE_RECE", "ROLE_ADULTO", "ROLE_NINO"})
    public String index(){
        return "peliculas";
    };

    @RequestMapping(value = { "/romance", "/terror", "/accion"}, method = RequestMethod.GET)
    @Secured({"ROLE_ADULTO"})
    public String peliculasAdultos() {
        return "peliculas";
    }

    @RequestMapping(value = {"/animacion", "/comedia", "/aventura"}, method = RequestMethod.GET)
    @Secured({"ROLE_NINO", "ROLE_ADULTO"})
    public String peliculasNinos() {
        return "peliculas";
    }
}
