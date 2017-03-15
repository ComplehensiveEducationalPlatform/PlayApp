package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;


/**
 * Created by ve on 2017/03/10.
 */

@Entity
public class Schedule extends Model {

    /**
     * ScheduleのID
     */
    @Id
    public long scheduleId;

    /**
     * このScheduleが設定される日時
     */
    public Date date;

    /**
     * スケジュールの詳細を示すboolean型の配列
     * trueが対応可能、falseが対応不可を表す
     * 例えば、scheduleArray[1]=trueであるならば、
     * 0:30-1:00まで対応可能だということになる
     */
    public boolean[] scheduleArray = new boolean[48];

    /**
     * このScheduleクラスに紐づけられるUser
     */
    @OneToOne
    public User user;

    public static Finder<Long, Schedule> finder = new Finder<Long, Schedule>(Schedule.class);
}
