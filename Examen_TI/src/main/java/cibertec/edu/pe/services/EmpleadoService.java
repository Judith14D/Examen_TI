package cibertec.edu.pe.services;

import java.util.List;

import cibertec.edu.pe.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cibertec.edu.pe.interfaceService.InEmpleadoService;
import cibertec.edu.pe.interfaces.InEmpleado;

@Service
public class EmpleadoService implements InEmpleadoService{

	@Autowired
	private InEmpleado data;
	
	@Override
	public List<Empleado> Listado(){
		return(List<Empleado>)data.findAll();
	}
	@Override
	public int grabar(Empleado e) {
		int res =0;
		Empleado ObjE = data.save(e);
		if(!ObjE.equals(null)) res = 1;
		return res;
	}

}
