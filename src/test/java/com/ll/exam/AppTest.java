package com.ll.exam;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void 테스트(){
        assertTrue(1==1);
        assertEquals(1, 1);
    }

    @Test
    public void 스캐너에_키보드가_아닌_문자열을_입력으로_설정_테스트(){
        Scanner sc = TestUtill.genScanner("안녕");

        String cmd = sc.nextLine().trim();
        assertEquals("안녕" , cmd);
    }

    @Test
    public void 출력을_모니터네_하지_않고_문자열로_얻기(){
        ByteArrayOutputStream output =  TestUtill.setOutToByteArray();
        System.out.print("안녕");
        String rs = output.toString();
        TestUtill.clearSetOutToByteArray(output);
        assertEquals("안녕", rs);



    }



}
