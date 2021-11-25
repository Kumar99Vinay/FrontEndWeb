console.log(stationName)
stationName="Digha";
test();

let train1=new LocalTrain()
train1.trainId=1000;
train1.source="thane";
train1.destination="Cst";
train1.trainline="Harbour";
let dd=train1.getDetail();
console.log(dd)