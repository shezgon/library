package data;

import vo.BookVo;

import java.util.ArrayList;
import java.util.List;

public class BookDataSet {
    public static List<BookVo> bookList = new ArrayList<BookVo>();
    public static void setBook(){
        bookList.add(new BookVo(1,"낮술","이명지","선우미디어",18000,"아빠","읽음"));
        bookList.add(new BookVo(2,"밤술","이명지","나우미디어",20000,"",""));
        bookList.add(new BookVo(3,"혼술","이명지","여우미디어",15000,"",""));
        bookList.add(new BookVo(4,"입술","이명지","영우미디어",50000,"",""));
        bookList.add(new BookVo(5,"요술","이명지","건우미디어",100000,"",""));

    }
}
