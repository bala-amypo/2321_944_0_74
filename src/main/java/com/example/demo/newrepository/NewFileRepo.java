package com.example.demo.newrepository;
import org.springframework.data.jpa.repository.Jparepository;
import com.example.demo.newentity.NewFileEntity;
public interface NewFileRepo extends JpaRepository<NewFileEntity,Long>{
    
}