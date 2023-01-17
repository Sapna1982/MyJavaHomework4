package School;

public class RunTest {
    public static void main(String[] args) {
        System.out.println("*************Head Teacher*************");
        HeadTeacher P = new HeadTeacher();
        P.ManageSchool();
        P.GoodEducation();
        P.SafeEnvironment();
        P.EmployeeGoodStaff();
        P.EarlyYears();
        P.Primary();
        P.Secondary();
        P.College();
        P.University();

        System.out.println("*************Office Staff*************");

        OfficeStaff O = new OfficeStaff();
        O.ManageSchool();
        O.GoodEducation();
        O.SafeEnvironment();
        O.EarlyYears();
        O.Primary();
        O.Secondary();
        O.College();
        O.University();

        System.out.println("*************Teacher*************");

        Teacher T = new Teacher();
        T.GoodEducation();
        T.SafeEnvironment();
        T.EarlyYears();
        T.Primary();
        T.Secondary();
        T.College();
        T.University();

        System.out.println("*************Students*************");

        Students S = new Students();
        S.GoodEducation();
        S.EarlyYears();
        S.Primary();
        S.Secondary();
        S.College();
        S.University();



    }
}
