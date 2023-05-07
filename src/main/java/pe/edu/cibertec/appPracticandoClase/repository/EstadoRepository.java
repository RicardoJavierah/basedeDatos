package pe.edu.cibertec.appPracticandoClase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.appPracticandoClase.model.bd.Estado;


@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer>{
	
	
}
