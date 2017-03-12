package models;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by ve on 2017/03/10.
 */

@Entity
public class User extends Model {
    @Id
    public long id;
    public String name;
    public String password;
    public String email;
    public String snsId;
    public String introduction;
    public String picturePath;
    public String location;
    public int UserReputationNumber;

    @Column(name = "create_name")
    @CreatedTimestamp
    public Date createDate;
    @Column(name = "last_date")
    public Date lastDate;

    public int setMoney;

    @OneToMany
    public List<Tag> tagList;
    @OneToMany
    public List<User> studentList;
    @OneToMany
    public List<User> teacherList;
    @OneToMany
    public List<Answer> answerList;
    @OneToMany
    public List<Question> questionList;
    @OneToMany
    public List<Schedule> scheduleList;
    @OneToMany
    public List<Question> clipList;

    public int connectedStripeAccountId;

    /*
     *CustomerをDBに保存する方法がよくわからない
     * もし、保存できたとして、どうやってCustomerオブジェクトとして取り出すのか。
     *
    @Column(name = "customer")
    public Customer customer;
    */

    public static Finder<Long, User> finder = new Finder<Long, User>(User.class);


}
