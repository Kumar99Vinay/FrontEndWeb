abstract class Train{
    test(){
        console.log("hii")
    }
    abstract access():string;
}

class LocalTrain extends Train{
    access():string{
        return "heloo";
    }
}

let tr=new LocalTrain()
tr.access()
tr.test()

let tr1:Train;
tr1=new LocalTrain();
tr1.access();

let tr2:LocalTrain;
tr2=<LocalTrain>tr1;