package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private long st_Id;
    private long ID_number;
    private String f_name;
    private String l_name;
    private String address;
}
