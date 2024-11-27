package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long st_Id;
    private long ID_number;
    private String f_name;
    private String l_name;
    private String address;

}
