package cibertec.edu.pe.interfaceService;

import java.util.List;
import cibertec.edu.pe.modelo.Empleado;

public interface InEmpleadoService {

	public List<Empleado> Listado();
	public int grabar(Empleado e);
}
