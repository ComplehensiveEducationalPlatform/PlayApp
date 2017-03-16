package Models.entity;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by ve on 2017/03/10.
 */

@Entity
public class Tag extends Model{
    @Id
    public long tagId;
    //よくわからない
    public int relatedQuestionNumber;
    public int relatedUserNumber;

    public List<User> taggedUser;
    @OneToOne
    public Discipline discipline;

    public static Finder<Long, Tag> finder = new Finder<Long, Tag>(Tag.class);
}
