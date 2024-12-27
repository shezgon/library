package data;

import vo.UserVo;

import java.util.ArrayList;
import java.util.List;

public class UserDataSet {
    public static List<UserVo> userlist = new ArrayList<UserVo>();
    public static void setUser(){
        userlist.add(new UserVo(1,"user1","박재범","010-1111-2222","jpark@naver.com","서울시 종로구"));
        userlist.add(new UserVo(2,"user2","나영석","010-2222-3333","naa@naver.com","서울시 서초구"));
        userlist.add(new UserVo(3,"user3","장원영","010-3333-4444","jang0@naver.com","서울시 용산구"));
        userlist.add(new UserVo(4,"user4","조인성","010-4444-5555","mrjo@naver.com","서울시 성동구"));
        userlist.add(new UserVo(5,"user5","안유진","010-5555-6666","an@naver.com","서울시 동대문구"));
    }

}
