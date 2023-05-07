package pe.edu.cibertec.appPracticandoClase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.cibertec.appPracticandoClase.service.EstadoService;

@Controller
@RequestMapping("/Estado")
public class EstadoController {
	
	@Autowired
	private EstadoService estadoService;
	
	@GetMapping("/frmMantEstado")
	public String frmMantEstado(Model model) {
		model.addAttribute("listarEstados",estadoService.listarEstados());
		return "Estado/fmrMantEstado";
	}
	
	
	@GetMapping("/frmRegistrar")
	public String frmRegistrar(Model model) {
		return "Estado/frmRegistrar";
	}
}
