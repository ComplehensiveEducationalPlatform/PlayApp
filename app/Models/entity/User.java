package models;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import Models.entity.models.*;


/**
 * Created by ve on 2017/03/10.
 */

@Entity
public class User extends Model {

    /**
     * DB上のID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    /**
     * Userの名前
     */
    @NotNull
    @Column(unique=true)
    public String name;

    /**
     * パスワード
     * OAuth認証があるため、NotNullにはしない
     */
    public String password;

    /**
     * emailアドレス
     */
    @Email
    public String email;

    /**
     * snsID
     */
    @Column(unique=true)
    public String snsId;

    /**
     * 自己紹介
     */
    public String introduction;

    /**
     * プロフィール画像のパス
     */
    public String picturePath;

    /**
     * Userの所在地
     */
    public String location;

    /**
     * Userの評価値
     */
    public int UserReputationNumber;

    /**
     * 登録日
     */
    @Column(name = "create_name")
    @CreatedTimestamp
    public Date createdDate;

    /**
     * ラストログイン
     */
    @Column(name = "last_date")
    public Date lastDate;

    /**
     * 課金された額
     */
    public int setMoney;

    /**
     * タグのリスト
     */
    @OneToMany
    public List<Tag> tagsList;

    /**
     * 教えている人のリスト
     */
    @OneToMany
    public List<User> studentsList;

    /**
     * 教えてくれている人のリスト
     */
    @OneToMany
    public List<User> teachersList;

    /**
     * Answerのリスト
     */
    @OneToMany
    public List<Answer> answersList;

    /**
     * Questionのリスト
     */
    @OneToMany
    public List<Question> questionsList;

    /**
     * Scheduleのリスト
     */
    @OneToMany
    public List<Schedule> schedulesList;

    /**
     * クリップリスト
     */
    @OneToMany
    public List<Question> clipsList;

    /**
     * 紐づけられたStripeアカウント
     */
    public int connectedStripeAccountId;

    /**
     * Stripeの提供するCustomerクラス
     */
    @Column(name = "customer")
    @OneToOne(cascade=CascadeType.ALL)
    public Customer customer;


    public static Finder<Long, User> finder = new Finder<Long, User>(User.class);


}
