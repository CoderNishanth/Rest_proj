package com.example.FullStack.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "teacher")
@Data
@NoArgsConstructor

public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "teacherid")
    private int teacherid;
    @Column(name = "teachername")
    private String teachername;
    
    @JoinColumn(name="teacherid")
    
    @OneToMany(cascade = CascadeType.ALL)
    
    private List<StudentEntity> students;
}
