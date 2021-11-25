export let stationName="CST"
export function modify(){
    stationName="Digha";
}

export function test(){
    console.log(stationName);
    
}

export class LocalTrain{
    trainId:number
    source:string
    destination:string
    trainline:string

    getDetail(){
        return `${this.trainId} ${this.source} ${this.destination} ${this.trainline}}`
    }
}

export * as train from "./LocalTrain"