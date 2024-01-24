package com.example.spring_jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity{


//@Column(
//        name = "F_name"
//)
    private String FirstName;
    private String LastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private int age;

//    @Column(
//            updatable = false
//    )
//    private LocalDateTime createdAt;
//
//    @Column(
//            insertable = false
//    )
//    private LocalDateTime updateAt;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
