package com.school.school.Entity;

import com.school.school.Repository.AddressRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class AddressTest {
    @Autowired
    private AddressRepository addressRepository;

    @Test
    public void saveAddress(){

        Student student = new Student();
        student.setFirstName("John");
        student.setLastName("Goggler");
        student.setEmailId("john1@gmail.com");
        student.setBirthDate("1985-08-11");
        student.setEnterYear("2005");



        Address address = new Address();
        address.setStreet("78702 Hoffman Way");
        address.setCity("Cabo de Vila");
        address.setState("Porto");
        address.setCountry("Portugal");
        address.setStudent(student);
        addressRepository.save(address);
    }

}