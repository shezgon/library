package process;

import data.BookDataSet;
import data.UserDataSet;
import vo.BookVo;

import java.awt.print.Book;
import java.util.Scanner;

public class BookProcess {
    Scanner scan = new Scanner(System.in);
    public BookProcess(){
        BookDataSet.setBook();
    }
    public void start(){
        do{
            System.out.print("1.책목록보기 2.책등록하기 3.책정보수정하기 4.책삭제하기 5.종료=");
            String menu = scan.nextLine();
            switch (menu){
                case "1" : bookPrint();break;
                case "2" : bookInsert();break;
                case "3" : bookEdit();break;
                case "4" : bookDelete();break;
                case "5" :
                    System.out.println("프로그램이 정상 종료 되었습니다");
                    System.exit(0);
                default :
                    System.out.println("메뉴를 잘못 입력 하였습니다");
            }
        }while (true);
    }
    // 1.책목록보기
    public void bookPrint(){
        System.out.println("번호\t\t책제목\t\t작가\t\t\t출판사\t\t가격\t\t소유자\t독서여부");
        for (BookVo vo : BookDataSet.bookList){
            System.out.println(vo.toString());
        }
    }
    // 2.책등록하기
    public void bookInsert(){
        BookVo vo = new BookVo();

        System.out.print("번호입력=");
        vo.setCode(Integer.parseInt(scan.nextLine()));

        System.out.print("책 제목 입력=");
        vo.setBook(scan.nextLine());

        System.out.print("작가입력=");
        vo.setName(scan.nextLine());

        System.out.print("출판사입력=");
        vo.setCompany(scan.nextLine());

        System.out.print("가격입력=");
        vo.setPrice(Integer.parseInt(scan.nextLine()));

        System.out.print("책 소유자 입력=");
        vo.setOwner(scan.nextLine());

        System.out.print("책 읽음, 안읽음 입력=");
        vo.setRead(scan.nextLine());

        BookDataSet.bookList.add(vo);
        System.out.println(vo.getBook()+"책이 등록되었습니다");
    }
    // 3.책정보수정하기
    public void bookEdit(){
        System.out.print("책 제목 입력=");
        String name = scan.nextLine();

        System.out.print("수정할 항목(1.책제목, 2.작가, 3.가격) 선택=");
        String field = scan.nextLine();

        if (field.equals("1")) System.out.print("수정할 책 제목 입력=");
        else if(field.equals("2")) System.out.print("수정할 작가 입력=");
        else System.out.print("수정할 가격 입력=");
        String editData = scan.nextLine();

        int data = scan.nextInt();


        for (int i=0; i<BookDataSet.bookList.size(); i++){
            BookVo vo = BookDataSet.bookList.get(i);
            if(vo.getBook().equals(name)){
                switch (field) {
                    case "1": vo.setBook(editData);
                    case "2": vo.setName(editData);
                    case "3": vo.setPrice(data);
                }
            }
        }
    }
    // 4.책삭제하기
    public void bookDelete(){
        System.out.print("삭제할 책 제목 입력=");
        String delTitle = scan.next();

        for (int i=0; i<BookDataSet.bookList.size(); i++){
            if (BookDataSet.bookList.get(i).getBook().equals(delTitle)){
                BookDataSet.bookList.remove(i);
                System.out.println(delTitle+"책을 삭제하였습니다");break;
            }
        }
    }

    public static void main(String[] args) {
        new BookProcess().start();
    }
}
