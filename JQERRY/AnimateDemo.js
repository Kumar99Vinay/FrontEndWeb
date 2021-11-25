$(function(){
    $('btn1').mouseover(function(){
        $(".block").css({fontSize:"30px",'border-width':'10px','background-color':'pink'});
    });
    $('#btn2').mouseover(function(){
        $(".block").animate({'font-size':'30px','border-width':'10px',height:'100px',width:'500px'},2000,'linear',()=>alert("Animation"));


    $('.inpfield').focus(function(){
        $(this).css({background :'yellow'});
    });
    });

    $('.inpfield').focus(function(){
        let currentelement=$(this);
        if(currentelement.attr('type')=='text')
              currentelement.css({border: '10px solid pink'});
        if(currentelement.attr('type')=='text')
              currentelement.css({border: 'double blue'});
        

    });
    $('#section1').mouseover(function(){
        $(this).addClass('block1');
    });
});