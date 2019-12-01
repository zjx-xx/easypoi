package com.zjx.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Excel(name = "主键")
    private String id;
    @Excel(name = "姓名")
    private String name;
    @Excel(name = "生日", format = "yyyy-MM-dd")
    private Date bir;
    System.out.println("asddfg");
}
