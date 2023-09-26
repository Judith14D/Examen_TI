package cibertec.edu.pe.interfaces;

import cibertec.edu.pe.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InEmpleado extends JpaRepository<Empleado, String>{

}
