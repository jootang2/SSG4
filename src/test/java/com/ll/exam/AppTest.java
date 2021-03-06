package com.ll.exam;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void 등록(){
        Scanner sc = TestUtill.genScanner("""
                등록
                명언1
                작가1
                종료
                """);
        ByteArrayOutputStream output =  TestUtill.setOutToByteArray();

        new App(sc).run();

        String rs = output.toString();
        TestUtill.clearSetOutToByteArray(output);

        assertTrue(rs.contains("명언 : "));
        assertTrue(rs.contains("작가 : "));

    }

    @Test
    public void 종료_명령(){
        Scanner sc = TestUtill.genScanner("종료");
        ByteArrayOutputStream output =  TestUtill.setOutToByteArray();

        new App(sc).run();

        String rs = output.toString();
        TestUtill.clearSetOutToByteArray(output);


        assertTrue(rs.contains("== 명언 SSG =="));
        assertTrue(rs.contains("명령)"));

    }

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
