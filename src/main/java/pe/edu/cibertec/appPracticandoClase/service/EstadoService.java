package pe.edu.cibertec.appPracticandoClase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.appPracticandoClase.model.bd.Estado;
import pe.edu.cibertec.appPracticandoClase.repository.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<Estado> listarEstados(){
		return estadoRepository.findAll();
		}
	
	public void registrarEstado(Estado estado) {
		estadoRepository.save(estado);
	}
}
