package data;

import vo.BookVo;

import java.util.ArrayList;
import java.util.List;

public class BookDataSet {
    public static List<BookVo> bookList = new ArrayList<BookVo>();
    public static void setBook(){
        bookList.add(new BookVo(1,"낮술","이명지","선우미디어",18000,"아빠","읽음"));
        bookList.add(new BookVo(2,"밤술","이명지","나우미디어",20000,"미정","__"));
        bookList.add(new BookVo(3,"혼술","이명지","여우미디어",15000,"엄마","진행중"));
        bookList.add(new BookVo(4,"중등영어","중학교","중학교",50000,"형","안읽음"));
        bookList.add(new BookVo(5,"초등수학","초등학교","초등학교",100000,"동생","못함"));

    }
}
