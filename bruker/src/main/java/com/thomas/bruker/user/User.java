package com.thomas.bruker.user;


import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.List;

@Data // Lombok annotation to generate getters, setters, toString, hash, equals, etc.
@Builder // Lombok annotation to generate builder pattern
@NoArgsConstructor
@AllArgsConstructor
@Entity // JPA annotation to make this object ready for storage in a JPA-based data store
@Table(name = "_user") // JPA annotation to specify the table name
public class User  {
    @Id // JPA annotation to specify the primary key
    @GeneratedValue // JPA annotation to specify the primary key generation strategy
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;



}
