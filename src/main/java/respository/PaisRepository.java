package respository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Pais;

public interface PaisRepository extends JpaRepository <Pais, Long> {
    
}