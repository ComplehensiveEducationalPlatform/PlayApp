package Models.entity;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ve on 2017/03/10.
 */
@Entity
public class Answer extends Model {

    /**
     * DB上のID
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public long answerId;

    /**
     * 答え
     */
    @Constraints.Required
    public String answerContent;

    /**
     * Answerの評価数
     */
    public int answerReputationNumber;

    /**
     *関連するコメント
     * 質問者・回答者・第三者問わずに、追加できる
     */
    public List<String> comments;

    /**
     * trueであればbestAnswer、そうでなければfalse
     */
    public boolean bestAnswer;

    /**
     * 対応するQuestion
     */
    @OneToOne
    public Question question;

    /**
     * 該当するAnswerを投稿したUser
     */
    @OneToOne
    public User postUser;

    public static Finder<Long, Answer> finder = new Finder<Long, Answer>(Answer.class);
}
