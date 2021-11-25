interface Personintf{
    name:string;
    age:number;
    getDetail();
}
interface EmpIntf extends Personintf{
    empid:number
    empSalary:number
    getSalary();
}
class Trainer implements EmpIntf{
    empid:number
    empSalary:number
    name:string;
    age:number;
    getDetail(){

    }
    getSalary(){

    }

}
//Multiple inheritance

interface MotherIntf{
    dream();
}
interface FatherIntf{
    goal();
    dream();
}
interface childIntf extends MotherIntf,FatherIntf{
    hobbies();
}

class Child implements childIntf{
    hobbies(){

    }
    goal(){

    }
    dream(){
        
    }
}