$(document).ready(function(){
    $('#btn').click(function(){
        let label = $('#btn').val();
        if(label == "FADEIN"){
              $('img').fadeIn(2000,function(){
                  $('#btn').val("FADEOUT");
                  $('#btn').html("FADE TO");
              });
          }
          else{
              $('img').fadeTo(2000,0.2,function(){
                  $('#btn').val("FADEIN");
                  $('#btn').html("FADE IN");
              })
          }  
      });
      $('#btn2').click(function(){
          $('img').slideToggle(2000);
      });
  })