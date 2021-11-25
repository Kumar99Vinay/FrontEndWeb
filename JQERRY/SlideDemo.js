$(document).ready(function(){
    $('#btn').click(function(){
        let label = $('#btn').val();
        if(label == "SLIDE UP"){
              $('img').slideUp(2000,function(){
                  $('#btn').val("SLIDE DOWN");
                  $('#btn').html("SLIDE DOWN");
              });
          }
          else{
              $('img').slideDown(2000,function(){
                  $('#btn').val("SLIDE UP");
                  $('#btn').html("SLIDE UP");
              })
          }  
      });
      $('#btn2').click(function(){
          $('img').slideToggle(2000);
      });
  })