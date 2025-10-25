import java.util.Scanner;

public class v3 {
    public static void main(String[] args) {
        //学生身份卡
        //化繁为简，先死后活
        //首先这段代码的目的是做学生卡，包含基础信息的"身份证"并展示出来
        //输入:学生卡上的信息有:学号，姓名，年龄，是否在校，性别，班级，座位号，
        //输出：学生卡以及上面附带的信息
        //分层处理:学生数据分层，数据输出分层
        //第一次修改代码，因为这些都是硬代码,未区分“配置/输入/代码”，把变化的东西写进了不该变的地方.所以必须使用
        //破法：用构造参数、配置/输入（Scanner/文件/环境变量），为默认值设常量。
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入学生的学号:");
        String studentId = myScanner.nextLine();
        System.out.println("请输入学生的名字:");
        String name = myScanner.nextLine();
        System.out.println("请输入学生的在校情况:");
        boolean isEnrolled = myScanner.nextBoolean();
        myScanner.nextLine();
        System.out.println("请输入学生的性别:");
        String gender = myScanner.nextLine();
        System.out.println("请输入学生的班级:");
        String className = myScanner.nextLine();
        System.out.println("请输入学生的座位号:");
        int seatNumber = myScanner.nextInt();
        System.out.println("请输入学生的年龄:");
        int studentAge = myScanner.nextInt();


        //String studentId = "gxzx0568";
        //String name = "xieyuan";
        //boolean isEnrolled = true;
        //char gender = '男';
        //String className = "高一三班";
        //int seatNumber = 5;
        //int studentAge = 18;
        System.out.println("学生卡的信息如下:");
        System.out.println("学号:"+studentId+"姓名:"+name+"在校情况:"+isEnrolled+"性别:"+gender+"班级:"+className+"座位号:"+seatNumber+"年龄:"+studentAge);
        //决策内容:解决了硬编码问题,使用Scanner动态输入
        //决策时间:2025.10.22
        //考虑因素:症状：所有字段值写死在代码里。根因：未区分“配置/输入/代码”，把变化的东西写进了不该变的地方。
        //预期收益:硬编码问题：从 0% → 90% ✅,语法错误：从 0% → 100% ✅,用户体验：从 0% → 60% 🟡
        //潜在风险:
        //
    }
}
