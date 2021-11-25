class Generic<T>{
    obj :T;
    constructor(obj:T){
        this.obj=obj;

    }
}
let gen=new Generic<string>("ascjhgc");
let gen2=new Generic<number>(324);

interface employeeIntf<E>{
    empId:E;
    empName:string;
}

class NeoDeveloper implements employeeIntf<number>{

    empId:number;
    empName:string;
}

let develop1=new NeoDeveloper();
develop1.empId=23434;
let develop2=new NeoDeveloper();
develop2.empId=232;

class NeoTrainer implements employeeIntf<string>{
    empName:string;
    empId:string;
}

