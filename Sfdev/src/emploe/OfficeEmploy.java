package emploe;

/**
 * Created by RENT on 2017-02-14.
 */
public class OfficeEmploy extends Employee {
    public Double getGrossSalary(){
        return getSalary()*1.20;
    }






//    public void test(){
//        Employee e=new Employee() {
//            @Override
//            public Double getSalary() {
//                return null;
//            }
//        };
//    }
}
