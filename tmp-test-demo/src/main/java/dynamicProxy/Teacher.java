package dynamicProxy;

/**
 * @author ZHQ
 * @date 2021/2/17
 */
public class Teacher implements People {

    @Override
    public String work() {
        System.out.println("老师教书育人...");
        return "教书";
    }
}
