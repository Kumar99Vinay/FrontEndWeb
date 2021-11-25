/*
import{stationName} from './LocalTrain'
import{modify} from './LocalTrain'
import{test as getstation} from './LocalTrain'
import{LocalTrain as LTrain} from './LocalTrain'*/

import * as train from './LocalTrain'


/*
console.log(stationName)//global module and we cannot modify the station name
modify();
getstation();

let train1=new LTrain()
train1.trainId=1000;
train1.source="thane";
train1.destination="Cst";
train1.trainline="Harbour";
let dd=train1.getDetail();
console.log(dd)*/



console.log(train.stationName)//global module and we cannot modify the station name
train.modify();
train.test();

let train1=new train.LocalTrain()
train1.trainId=1000;
train1.source="thane";
train1.destination="Cst";
train1.trainline="Harbour";
let dd=train1.getDetail();
console.log(dd)