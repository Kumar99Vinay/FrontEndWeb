$(document).ready(function(){
    let btnNode=$('#btn1');
    btnNode.click(function(){
        let imgNode=$('.image1');
        let imgNode2=$('.image2')
        let imgNode3=$('.image3')
        let imgNode4=$('.image4')

        let label = btnNode.html();
        if(label == "HIDE"){
            imgNode.hide(1000,
                ()=>imgNode2.hide(1000,'swing',
                    ()=>imgNode3.hide(1000,
                        ()=>imgNode4.hide(1000,
                            ()=>btnNode.html("SHOW")
                        )
                    )
                )
            );
            
        }
        else{
            imgNode.show(1000,
                ()=>imgNode2.show(1000,
                    ()=>imgNode3.show(1000,
                        ()=>imgNode4.show(1000,
                            ()=>btnNode.html("HIDE")
                        )
                    )
                )
            );
        }
        
    });
    
});