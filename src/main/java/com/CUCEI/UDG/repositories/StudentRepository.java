package com.CUCEI.UDG.repositories;

import com.CUCEI.UDG.models.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<StudentModel,Long> {



    public Optional<StudentModel> findBycode(String code);
    public Optional<List<StudentModel>> findByName(String name);
    public void deleteStudentByCode(String code);
}
