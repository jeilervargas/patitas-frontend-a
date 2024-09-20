package pe.edu.cibertec.patitas_frontend_a.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.patitas_frontend_a.viewmodel.LoginModel;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/inicio")
    public String inicio(Model model){
        LoginModel loginModel = new LoginModel("00","","");
        model.addAttribute("nombre", "Pepe");
        return "inicio";
    }

    @PostMapping("/autenticar")
    public String autenticar(Model model){

        LoginModel loginModel = new LoginModel("00","","Jeiler Vargas");
    }
}
