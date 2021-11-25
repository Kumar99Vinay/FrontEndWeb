$(document).ready(function(){
    let btnNode=$('#btn');
    btnNode.click(function(){
        let imgnode=$('.image');
        let imgNode=$('#img');

        let label = btnNode.html();
        if(label == "HIDE"){
            imgnode.hide(2000);
            imgNode.hide(3000,function(){
                btnNode.html("SHOW");
            });
        }
        else{
            imgnode.show(2000);
            imgNode.show(3000,function(){
                 btnNode.html("HIDE");
            });
        }
        
    });

    $('#btn2').click(function(){
        $('img').toggle(2000);
    });
    
});