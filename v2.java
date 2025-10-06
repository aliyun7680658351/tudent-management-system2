
public class v2 {
    public static void main(String[] agrs) {
        //学生身份卡
        //化繁为简，先死后活
        //首先这段代码的目的是做学生卡，包含基础信息的"身份证"并展示出来
        //输入:学生卡上的信息有:学号，姓名，年龄，是否在校，性别，班级，座位号，
        //输出：学生卡以及上面附带的信息
        //分层处理:学生数据分层，数据输出分层
        String studentId = "gxzx0568";
        String name = "xieyuan";
        boolean isEnrolled = true;
        char studentGender = '男';
        String banji = "高一三班";
        int zuoweihao = 5;
        int studentAge = 18;
        System.out.println("学生卡的信息如下:");
        System.out.println("学号:"+studentId);
        System.out.println("姓名"+name);
        System.out.println("在校情况"+isEnrolled);
        System.out.println("性别"+studentGender);
        System.out.println(banji);
        System.out.println(zuoweihao);
        System.out.println("年龄:"+studentAge);
    }
}
