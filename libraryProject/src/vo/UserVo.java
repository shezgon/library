package vo;

public class UserVo {
    int num;
    String id;
    String name;
    String tel;
    String email;
    String addr;

    public UserVo(){}
    public UserVo(int num, String id, String name, String tel, String email, String addr){
        this.num = num;
        this.id=id;
        this.name=name;
        this.tel=tel;

        this.email=email;
        this.addr=addr;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
