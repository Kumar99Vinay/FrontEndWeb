class BankAccount{
    accNumber;
    custId;
    accType;
    accBalance;
/*
    constructor(){
        console.log("deafault constructor");
    }*/

    constructor(accNum,cid,accType,accBal){
        console.log("parametreside constructor...")
        this.accNumber=accNum;
        this.custId=cid;
        this.accType=accType;
        this.accBalance=accBal;
    }
    showDetails(){
        console.log(this.accNumber);
        console.log(this.custId);
        console.log(this.accType);
        console.log(this.accBalance);

    }
    showDetails2(){
        return `number:${this.accNumber} type:${this.accType} id:${this.custId} balance:${this.accBalance}`;
    }
}
let account1=new BankAccount();
let account2=new BankAccount(123,1111,"saving",76000);
console.log(account1.accBalance);
console.log(account2.accBalance);

account1.showDetails();
account2.showDetails();
account1.accNumber=787878787;
account1.showDetails();
let detail=account2.showDetails2();
document.write(detail);

