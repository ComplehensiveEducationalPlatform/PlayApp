package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by ve on 2017/03/10.
 */

@Entity
public class Question extends Model {
    @Id
    public long questionId;
    @Constraints.Required
    public String title;
    @Constraints.Required
    public String questionContent;
    public int questionReputationNumber;
    public int clipNumber;
    @Column(name = "posted_time")
    public Date postedTime;

    public int award;
    @OneToOne
    public User user;

    @OneToMany
    public List<Tag> tagList;
    @OneToMany
    public List<Answer> answerList;

    public Finder<Long, Question> finder = new Finder<Long, Question>(Question.class);
}
