package com.infoshareacademy.homeworks;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class GradeService {



    public String[][] calculateAverage(String[][] data) {

        String[][] students = new String[][]{{}};
        if (data == null || data.length == 0) {
            return students;
        }

        else {
            for(int i =0; i<data.length;i++){
                String grade = data[i][1];

                BigDecimal result = new BigDecimal(grade).setScale(2);
                data[i][1] = result.toString();
            }
            Arrays.sort(data, Comparator.comparing(o -> (o[0])));

            return data;

                }




    }



}