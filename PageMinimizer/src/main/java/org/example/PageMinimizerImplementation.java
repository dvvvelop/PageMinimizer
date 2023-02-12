package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class PageMinimizerImplementation implements PageMinimizer {

    @Override
    public String string1tostring2(String n1) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите номера страниц через запятую: ");
        String str = in.nextLine();
        //System.out.println(str); //задаем строку чисел


        String strArr[] = str.split(",");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
            //System.out.println(numArr[i]); //преобразуем ее в массив
        }

        Arrays.sort(numArr);

        for (int values : numArr) {
            System.out.print(values + ", ");

        }


        return "";
    }
}
