package collectionType;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Stu
{
    private String[] courses;
    private List<String> list;
    private Map<String,String> maps;
    private Set<String> sets;
    //学生所选课程
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList)
    {
        this.courseList = courseList;
    }

    public void setCourses(String[] courses)
    {
        this.courses = courses;
    }

    public void setList(List<String> list)
    {
        this.list = list;
    }

    public void setMaps(Map<String,String> maps)
    {
        this.maps = maps;
    }

    public void setSets(Set<String> sets)
    {
        this.sets = sets;
    }

    public void test()
    {
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }


}
