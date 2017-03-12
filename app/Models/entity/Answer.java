package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by ve on 2017/03/10.
 */
@Entity
public class Answer extends Model {
    @Id
    public long answerId;
    @Constraints.Required
    public String answerContent;
    public int answerReputationNumber;

    public List<String> comments;
    public boolean bestAnswer;
    @OneToOne
    public Question question;
    @OneToOne
    public User postUser;

    public static Finder<Long, Answer> finder = new Finder<Long, Answer>(Answer.class);
}
