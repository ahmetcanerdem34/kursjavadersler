package DAY_33_encopsulation;

public class User {

    // 1- filedlar� id, username, password, active (boolean), signedIn (boolean)
    //    olan User isimli bir class tan�mlay�n�z.
    // 2- b�t�n fieldlar� parametre alan bir concructor tan�mlay�n�z.
    // 3- b�t�n fieldlar� i�in getter ve setter metodlar� olu�turunuz.
    // 4- UserMain isminde main i�in bir class olu�turunuz.
    // 5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
    //    active ve signedIn default olarak true, false atayabilirsiniz.
    //    id yi sistem otomatik versin.,
    // 6- e�er password 6 dan k���k olursa yeniden user� girsin.passwordun
    //    6 karakterden k���k olup olmad���n� class�n i�inde kontrol ediniz.

    int id;
    private String username;
    private String password;
    private boolean active=true;
    private boolean signIn=false;
    private int count=101;


    //kullan�c�dan alca��m�z bilgiler i�in constructor olu�turuyoru<
    public User(String username, String password) {
        //    id yi sistem otomatik versin.,
        this.id = count++;//id bilgisini count dan ++ yaparak sistem kendi �retti, 101 yap�p artt�racak
        setUsername(username);//kal�phanede set et yani �al��t�r
        setPassword(password);//kal�phanede set et yani �al��t�r

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
    // 6- e�er password 6 dan k���k olursa yeniden user� girsin.passwordun
    public void setPassword(String password) {//password uzunluk lt� dan k���kse
        if (password.length()<6){//olursa yeniden girsin, try catsc he gir
            throw new RuntimeException("password 6 karakterden k���k olamaz");//kod �al��t��� i�in daha kulln��l� rte
            //kullan�c�da g�rs�n diye maindede atml�y�z
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
