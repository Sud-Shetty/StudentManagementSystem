package dev.sud.studentmanagementsystem;

import dev.sud.studentmanagementsystem.entity.Student;
import dev.sud.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
       /*

        Student student1 = new Student("Sud", "shetty", "sud@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student("CK", "xyz", "ck@gmail.com");
        studentRepository.save(student2);

        Student student3 = new Student("abc", "john", "abc@gmail.com");
        studentRepository.save(student3);

        */
    }
}
