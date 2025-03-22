package com.example.FullStack.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="child")
@Data
@NoArgsConstructor
public class ChildEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int address_id;
    @Column(name = "address")
    private String address;
    @JoinColumn(name = "stu_id") //to specify the column name
    @OneToOne(cascade = CascadeType.ALL) //to handle the operations of the parent entity
    @JsonBackReference
    private ParentEntity parentEntity; //parent entity reference
}
