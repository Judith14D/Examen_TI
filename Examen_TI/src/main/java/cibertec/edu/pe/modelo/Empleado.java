package cibertec.edu.pe.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empleado")
public class Empleado {
	@Id
	@Column(name = "IdEmpleado")
	private char IdEmpleado;
	@Column(name = "Apellidos")
	private String Apellidos;
	@Column(name = "Nombres")
	private String Nombres;
	@Column(name = "Edad")
	private int Edad;
	@Column(name = "Sexo")
	private char Sexo;
	@Column(name = "Salario")
	private double Salario;
	
	public Empleado() {
	}
	
	public Empleado(char idEmpleado, String apellidos, String nombres, int edad, char sexo, double salario) {
		IdEmpleado = idEmpleado;
		Apellidos = apellidos;
		Nombres = nombres;
		Edad = edad;
		Sexo = sexo;
		Salario = salario;
	}

	public char getIdEmpleado() {
		return IdEmpleado;
	}

	public void setIdEmpleado(char idEmpleado) {
		IdEmpleado = idEmpleado;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public char getSexo() {
		return Sexo;
	}

	public void setSexo(char sexo) {
		Sexo = sexo;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	
	
}
