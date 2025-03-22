package com.example.FullStack.Entity;

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
@Table(name = "parent")
@Data
@NoArgsConstructor
public class ParentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private int stu_id;
    @Column(name = "stu_name")
    private String stu_name;
    @Column(name = "stu_class")
    private String stu_class;
    @JoinColumn(name = "address_id") //to specify the column name
    @OneToOne(cascade = CascadeType.ALL) //to handle the operations of the child entity
    private ChildEntity childEntity; //child entity reference
}
