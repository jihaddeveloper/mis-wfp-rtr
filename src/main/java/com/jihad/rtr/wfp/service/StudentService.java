//  Author: Mohammad Jihad Hossain
//  Create Date: 28/07/2022
//  Modify Date: 28/07/2022
//  Description: Student service file

package com.jihad.rtr.wfp.service;

import com.jihad.rtr.wfp.exception.ResourceNotFoundException;
import com.jihad.rtr.wfp.model.School;
import com.jihad.rtr.wfp.model.Student;
import com.jihad.rtr.wfp.repository.SchoolRepo;
import com.jihad.rtr.wfp.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;


    //Create new student
    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    //Get all student
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    //Get student with id
    public Student getStudentById(long id) {
        Optional<Student> studentDB = studentRepo.findById(id);
        if (studentDB.isPresent()) {
            return studentDB.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    //Update student
    public Student updateStudent(Student student) {
        Optional<Student> studentDB = this.studentRepo.findById(student.getId());

        if (studentDB.isPresent()) {
            Student studentUpdate = studentDB.get();
            studentUpdate.setId(student.getId());
            studentUpdate.setName(student.getName());

            studentUpdate.setGender(student.getGender());
            studentUpdate.setRoll(student.getRoll());
            studentUpdate.setFather(student.getFather());
            studentUpdate.setMother(student.getMother());
            studentUpdate.setPhone(student.getPhone());
            studentUpdate.setDateOfBirth(student.getDateOfBirth());
            studentUpdate.setAddress(student.getAddress());
            studentUpdate.setSpecialChild(student.getSpecialChild());
            studentUpdate.setSchoolId(student.getSchoolId());
            studentUpdate.setSectionId(student.getSectionId());
            studentUpdate.setGradeId(student.getGradeId());
            studentUpdate.setSchoolName(student.getSchoolName());
            studentUpdate.setUpazilla(student.getUpazilla());
            studentUpdate.setLf(student.getLf());
            studentUpdate.setLpo(student.getLpo());

            studentUpdate.setSchoolId(student.getSchoolId());

            this.studentRepo.save(studentUpdate);

            return studentUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + student.getId());
        }
    }

    //Delete student
    public void deleteStudent(long id) {
        Optional<Student> studentDB = this.studentRepo.findById(id);

        if (studentDB.isPresent()) {
            this.studentRepo.delete(studentDB.get());
        } else {
            throw new ResourceNotFoundException("Record no found with id : " + id);
        }
    }
}
