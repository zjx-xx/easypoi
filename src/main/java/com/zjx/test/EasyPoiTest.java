package com.zjx.test;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.zjx.entity.Teacher;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class EasyPoiTest {
    @Test
    public void testOut() {
        ArrayList<Teacher> teachers = new ArrayList<>();
        Teacher t1 = new Teacher("1", "良品铺子", new Date());
        Teacher t2 = new Teacher("2", "三只松鼠", new Date());
        Teacher t3 = new Teacher("3", "百草味", new Date());
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("计算机一班学生", "学生"),
                Teacher.class, teachers);
        try {
            workbook.write(new FileOutputStream(new File("H:/baizhieducation/teacher.xls")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
