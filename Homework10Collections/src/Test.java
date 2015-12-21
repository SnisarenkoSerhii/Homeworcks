/**
 * Created by Sergey on 03.12.2015.
 */
public class Test {
    private String name;

    public Test(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Test{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
