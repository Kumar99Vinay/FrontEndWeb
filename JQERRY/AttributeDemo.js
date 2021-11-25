$(function(){
    let checknode=$('#check');
    checknode.change(function(){
        if(checknode.prop('checked')==true)
            $('#pass').attr('type','text');
        else
             $('#pass').attr('type','password');
    });
});