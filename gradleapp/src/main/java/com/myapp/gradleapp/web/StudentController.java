//package com.myapp.gradleapp.web;
//
//import com.myapp.gradleapp.model.Student;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.media.Content;
//import io.swagger.v3.oas.annotations.media.Schema;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@Tag(name = "StudentController", description = "The StudentController API with documentation annotations")
//public class StudentController {
//
//    @RequestMapping(value = "/students")
//    @Operation(summary = "Get student details")
//    public List<Student> getStudents() {
//        System.out.println(" ######## get student s Details ############");
//        return students;
//    }
//
//    @RequestMapping(value = "/student/{name}")
//    @Operation(summary = "Get student by name")
//     public Student getStudent(@PathVariable(value = "name") String name) {
//        System.out.println(" ########  getStudent ############::name::"+name);
//        return students.stream().filter(x -> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
//    }
//
//    List<Student> students = new ArrayList<Student>();
//    {
//        students.add(new Student("Deepak", "alpha", "India",20));
//        students.add(new Student("Rohit", "beta", "India",12));
//        students.add(new Student("vinay", "gamma", "USA",25));
//        students.add(new Student("Binay", "deltas", "INDIAAA",10));
//    }
//}