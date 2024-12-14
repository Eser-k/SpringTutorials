package com.example.CrudDemo;

import com.example.CrudDemo.dao.StudentDAO;
import com.example.CrudDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
			// readStudent(studentDAO);
			// queryForStudents(studentDAO);
			// queryForStudentsByLastName(studentDAO);
			// updateStudent(studentDAO);
			// deleteStudent(studentDAO);
			// deleteAll(studentDAO);
		};
	}

	private void deleteAll(StudentDAO studentDAO) {
		int countDeletedRows = studentDAO.deleteAll();
		System.out.println("Count of deleted rows: " + countDeletedRows);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 2;
		System.out.println("Deleting Student with the id: " + studentId);

		studentDAO.delete(studentId);
	}


	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		Student student = studentDAO.findById(studentId);
		student.setFirstName("");

		studentDAO.update(student);
		System.out.println("Updated Student with id: " + studentId + " " + student);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List <Student> students = studentDAO.findByLastName("");

		for(Student tempStudent : students){
			System.out.println(tempStudent);
		}
	}


	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();

		for(Student tempStudent : students){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Saving a new Student...");
		Student student = new Student("", "", "");
		studentDAO.save(student);

		int id = student.getId();
		System.out.println("Id of the new Student: " + id);

		Student retrievedStudent = studentDAO.findById(id);
		System.out.println("Found the Student with the id: " + id + ": " + retrievedStudent);
	}

	private void createStudent(StudentDAO studentDAO){
		System.out.println("Creating a student ...");
		Student tempStudent = new Student("Rick", "Sanchez", "rick@morty.com");

		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		System.out.println("Created the student. Generated id: " + tempStudent.getId());
	}

}
