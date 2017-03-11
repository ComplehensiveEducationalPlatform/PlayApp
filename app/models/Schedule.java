package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

/**
 * Created by ve on 2017/03/10.
 */

@Entity
public class Schedule extends Model {
    @Id
    public long scheduleId;
    public Date date;
    public boolean schedule;
    @OneToOne
    public User user;

    public static Finder<Long, Schedule> finder = new Finder<Long, Schedule>(Schedule.class);
}
