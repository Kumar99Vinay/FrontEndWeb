$(function(){
   $('#btn1').dblclick(function(){
       let contents=$('para').html();
       $('#block').html(contents);
   });
   $('#btn2').dblclick(function(){
       let contents=$('para').text();
       $('#block').text(contents);
   });
   $('btn3').click(function(){
       let name=$('#name').val();
       $('#name1').val(name);
       $('#name').val('');
   });
});