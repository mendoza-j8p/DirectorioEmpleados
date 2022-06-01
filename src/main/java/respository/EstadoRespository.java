package respository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Estado;

public interface EstadoRespository extends JpaRepository <Estado, Long> {
    
}
