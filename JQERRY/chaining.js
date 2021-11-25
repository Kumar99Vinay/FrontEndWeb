$(document).ready(function(){
    $('#chainbutton').click(function(){
        $('img').toggle(2000).slideToggle(3000).fadeToggle(1000,function(){
            alert("completed");
        });
    });
})