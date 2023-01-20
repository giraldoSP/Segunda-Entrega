package Services;

import Models.ProfessorModel;
import Repositories.ProfessorRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProfessorService {

   final
   ProfessorRepositorie professorRepositorie;


    public ProfessorService(ProfessorRepositorie professorRepositorie) {
        this.professorRepositorie = professorRepositorie;
    }

    public ArrayList<ProfessorModel> getProfessors(){
        return (ArrayList<ProfessorModel>) professorRepositorie.findAll();
    }

    public ProfessorModel saveProfessor(ProfessorModel professor){
        return professorRepositorie.save(professor);
    }

}
