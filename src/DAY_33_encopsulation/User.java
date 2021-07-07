package DAY_33_encopsulation;

public class User {

    // 1- filedlarý id, username, password, active (boolean), signedIn (boolean)
    //    olan User isimli bir class tanýmlayýnýz.
    // 2- bütün fieldlarý parametre alan bir concructor tanýmlayýnýz.
    // 3- bütün fieldlarý için getter ve setter metodlarý oluþturunuz.
    // 4- UserMain isminde main için bir class oluþturunuz.
    // 5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
    //    active ve signedIn default olarak true, false atayabilirsiniz.
    //    id yi sistem otomatik versin.,
    // 6- eðer password 6 dan küçük olursa yeniden userý girsin.passwordun
    //    6 karakterden küçük olup olmadýðýný classýn içinde kontrol ediniz.

    int id;
    private String username;
    private String password;
    private boolean active=true;
    private boolean signIn=false;
    private int count=101;


    //kullanýcýdan alcaðýmýz bilgiler için constructor oluþturuyoru<
    public User(String username, String password) {
        //    id yi sistem otomatik versin.,
        this.id = count++;//id bilgisini count dan ++ yaparak sistem kendi üretti, 101 yapýp arttýracak
        setUsername(username);//kalýphanede set et yani çalýþtýr
        setPassword(password);//kalýphanede set et yani çalýþtýr

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    // 6- eðer password 6 dan küçük olursa yeniden userý girsin.passwordun
    public void setPassword(String password) {//password uzunluk ltý dan küçükse
        if (password.length()<6){//olursa yeniden girsin, try catsc he gir
            throw new RuntimeException("password 6 karakterden küçük olamaz");//kod çalýþtýðý için daha kullnýþlý rte
            //kullanýcýda görsün diye maindede atmlýyýz
        }
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignIn() {
        return signIn;
    }

    public void setSignIn(boolean signIn) {
        this.signIn = signIn;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
