package com.telusko;

import com.telusko.model.Address;
import com.telusko.model.Student;
import com.telusko.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaMappingOneToManyApplication implements CommandLineRunner {

    @Autowired
    private StudentRepo studentRepo;
    public static void main(String[] args) {
        SpringApplication.run(JpaMappingOneToManyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Student student=new Student();
        student.setStudentName("Gaurav");
        student.setAbout("i am the future");

        List<Address> addressList=new ArrayList<>();

        Address address1=new Address();
        address1.setCity("Gaya");
        address1.setStreet("Police line");
        address1.setCountry("India");

        address1.setStudent(student);



        Address address2=new Address();
        address2.setCity("Gaya");
        address2.setStreet("Rampur");
        address2.setCountry("India");
        address2.setStudent(student);


        Address address3=new Address();
        address3.setCity("Gaya");
        address3.setStreet("Nutan Nagar");
        address3.setCountry("India");
        address3.setStudent(student);

        addressList.add(address1);
        addressList.add(address2);
        addressList.add(address3);
        student.setAddressList(addressList);
        studentRepo.save(student);


    }
}
