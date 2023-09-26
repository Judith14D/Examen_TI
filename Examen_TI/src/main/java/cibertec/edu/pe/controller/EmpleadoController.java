package cibertec.edu.pe.controller;

import cibertec.edu.pe.interfaceService.InEmpleadoService;

import java.util.List;

import cibertec.edu.pe.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpleadoController {

	@Autowired
	private InEmpleadoService servicio;
	// Método para listar
		@GetMapping("/listar")
		public String Listar(Model m) {
			List<Empleado> LEmpleado = servicio.Listado();
			m.addAttribute("listEmp",LEmpleado);
			return "inicio";
		}
		
		//Método agregar
		@GetMapping("/nuevo")
		public String agregar(Model m) {
			m.addAttribute("Empleado", new Empleado());
			return "formulario";
		}
		//Método grabar
		@GetMapping("/confirmar")
		public String salvar(Empleado a, Model m) {
			servicio.grabar(a);
			return "redirect:/listar";
		}
	
		
}
