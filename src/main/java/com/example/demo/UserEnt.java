package com.example.demo;

import lombok.*;
import org.hibernate.annotations.GeneratorType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
@ToString

public class UserEnt {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;


    UserEnt(String fname, String lname){
        this.fname=name;
        this.lname=ibsn;
    }

    public String getName(){
        return this.fname;
    }
    public String getIbsn(){
        return this.lname;
    }
    public String toString(){
        return this.fname+"  "+this.lname+"\n" ;
    }

}

