package Repositories;


import Models.ProfessorModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepositorie extends CrudRepository<ProfessorModel, Long> {
}
