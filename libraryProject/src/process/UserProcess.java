package process;

import data.UserDataSet;
import vo.UserVo;

import java.util.Scanner;

public class UserProcess {
    Scanner scan = new Scanner(System.in);
    public UserProcess(){
        UserProcess.setUser();
    }
    public void start(){
        do{
            System.out.print("1.회원목록보기 2.회원등록하기 3.회원수정하기 4.회원삭제하기 5.종료=");
            String menu = scan.nextLine();
            switch (menu){
                case "1" : userPrint();break;
                case "2" : userInsert();break;
                case "3" : userEdit();break;
                case "4" : userDelete();break;
                case "5" :
                    System.out.println("프로그램이 정상 종료 되었습니다");
                    System.exit(0);break;
                default :
                    System.out.println("메뉴를 잘못 입력 하였습니다");
            }
        }while (true);
    }
    // 1.회원목록보기
    public void userPrint(){
        System.out.println("번호\tID\t이름\t연락처\t이메일\t주소");
        for (UserVo vo : UserDataSet.userlist){
            System.out.println(vo.toString());
        }
    }
    // 2.회원등록하기
    public void userInsert(){
        UserVo vo = new UserVo();

        System.out.print("번호입력=");
        vo.setNum(Integer.parseInt(scan.nextLine()));

        System.out.print("ID입력="); // 회원이 등록한 ID 끌어올수 있는지?
        vo.setId(scan.nextLine());

        System.out.print("이름입력=");
        vo.setName(scan.nextLine());

        System.out.print("연락처입력=");
        vo.setTel(scan.nextLine());

        System.out.print("이메일입력=");
        vo.setEmail(scan.nextLine());

        System.out.print("주소입력=");
        vo.setAddr(scan.nextLine());

        UserDataSet.userlist.add(vo);
        System.out.println(vo.getName()+"회원이 등록되었습니다");
    }
    // 3.회원정보수정하기_연락처, 이메일, 주소
    public void userEdit(){
        System.out.print("수정할 회원 이름 입력=");
        String name = scan.nextLine();

        System.out.print("수정할 항목(1.연락처, 2.이메일, 3.주소) 선택=");
        String field = scan.nextLine();

        if (field.equals("1")) System.out.print("수정할 연락처 입력=");
        else if(field.equals("2")) System.out.print("수정할 이메일 입력=");
        else System.out.print("수정할 주소 입력=");
        String editData = scan.nextLine();

        for (int i=0; i<UserDataSet.userlist.size(); i++){
            UserVo vo = UserDataSet.userlist.get(i);
            if(vo.getName().equals(name)){
                switch (field) {
                    case "1": vo.setTel(editData);break;
                    case "2": vo.setEmail(editData);break;
                    case "3": vo.setAddr(editData);
                }break;
            }
        }
    }
    // 4.회원삭제하기
    public void userDelete(){
        System.out.print("삭제할 회원 이름 입력=");
        String delName = scan.next();

        for (int i=0; i<UserDataSet.userlist.size(); i++){
            if (UserDataSet.userlist.get(i).getName().equals(delName)){
                UserDataSet.userlist.remove(i);
                System.out.println(delName+"회원을 삭제하였습니다");break;
            }
        }
    }

    public static void main(String[] args) {
        new UserProcess().start();
    }
}