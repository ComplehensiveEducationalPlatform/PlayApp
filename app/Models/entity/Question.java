package Models.entity;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by ve on 2017/03/10.
 */

@Entity
public class Question extends Model {

    /**
     * QuestionクラスのID
     */
    @Id
    public long questionId;

    /**
     * Questionのタイトル
     */
    @Constraints.Required
    public String title;

    /**
     * Questionの内容
     */
    @Constraints.Required
    public String questionContent;

    /**
     * 質問の評価数
     */
    public int questionReputationNumber;

    /**
     * クリップされた数
     */
    public int clipNumber;

    /**
     * 投稿された日時
     */
    @Column(name = "posted_time")
    public Date postedTime;

    /**
     * 質問に答えた時に与えられる額
     */
    public int award;

    /**
     * 質問したUser
     */
    @OneToOne
    public User user;

    /**
     * 質問にタグづけられたTag
     */
    @OneToMany
    public List<Tag> tagsList;

    /**
     * この質問に対する答え
     */
    @OneToMany
    public List<Answer> answersList;

    public Finder<Long, Question> finder = new Finder<Long, Question>(Question.class);
}
